using System;

using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Content;
using Com.Huawei.Agconnect.Config;
using Com.Huawei.Hmf.Tasks;
using Com.Huawei.Hms.Support.Hwid;
using Com.Huawei.Hms.Support.Hwid.Result;
using Android.Util;
using Com.Huawei.Hms.Common;
using Com.Huawei.Hms.Support.Hwid.Request;
using Com.Huawei.Hms.Support.Hwid.Service;
using Plugin.CurrentActivity;
using Android.Content.Res;
using System.ComponentModel;
using Xamarin.Forms;

namespace HMS_Yarisma.Droid
{
    [DesignTimeVisible(true)]
    [Activity(Label = "HMS_Yarisma", Icon = "@mipmap/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
    {
        Xamarin.Forms.Button signinBtn;
        HuaweiIdAuthParams authParams;
        private IHuaweiIdAuthService authManager;  
        
        public static MainActivity MainActivityInstance { get; private set; }
        protected override void OnCreate(Bundle savedInstanceState)
        {
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;
            base.OnCreate(savedInstanceState);
            

            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            global::Xamarin.Forms.Forms.Init(this, savedInstanceState);
            LoadApplication(new App());
            MainActivityInstance = this;
            
            signinBtn = (Xamarin.Forms.Button)MainPage.main.FindByName("submitBtn");
            signinBtn.Clicked += SignInClicked;
        }
        public void SignInClicked(object sender, EventArgs e)
        {
            authParams = new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DefaultAuthRequestParam)
           .SetIdToken()
           .SetAccessToken()
           .CreateParams();
            authManager = HuaweiIdAuthManager.GetService(Android.App.Application.Context, authParams);
            StartActivityForResult(authManager.SignInIntent, 8888);

        }
        protected override void OnActivityResult(int requestCode, Result resultCode, Intent data)
        {
            base.OnActivityResult(requestCode, resultCode, data);
            if (requestCode == 8888)
            {
                //login success
                Task authHuaweiIdTask = HuaweiIdAuthManager.ParseAuthResultFromIntent(data);
                if (authHuaweiIdTask.IsSuccessful)
                {
                    AuthHuaweiId huaweiAccount = (AuthHuaweiId)authHuaweiIdTask.TaskResult();
                    Log.Info("AuthRequest", "signIn get code success.");
                    Log.Info("AuthRequest", "ServerAuthCode: " + huaweiAccount.AuthorizationCode);
                    MainPage.main.PushNewPage();
                }
                else
                {
                    Log.Info("AuthRequest", "signIn failed: " + ((ApiException)authHuaweiIdTask.Exception).StatusCode);
                    MainPage.main.LoginFailed(resultCode);
                }
            }
        }
        protected override void AttachBaseContext(Context context)
        {
            base.AttachBaseContext(context);
            AGConnectServicesConfig config = AGConnectServicesConfig.FromContext(context);
            config.OverlayWith(new HMSLazyInputStream(context));
            
        }
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}