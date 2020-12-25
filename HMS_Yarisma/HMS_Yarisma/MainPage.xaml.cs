using Android.Content;
using Com.Huawei.Hms.Support.Hwid;
using Com.Huawei.Hms.Support.Hwid.Request;
using Com.Huawei.Hms.Support.Hwid.Service;
using System;
using Android.App;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;


namespace HMS_Yarisma
{
    // Learn more about making custom code visible in the Xamarin.Forms previewer
    // by visiting https://aka.ms/xamarinforms-previewer
    [DesignTimeVisible(true)]
    public partial class MainPage : ContentPage
    {
        public static MainPage main { get; set; }
        public MainPage()
        {
            InitializeComponent();
            main = this;
        }
        public async void PushNewPage()
        {
            await Navigation.PushAsync(new Notes());
        }
       
        public async void LoginFailed(Result result)
        {
            await DisplayAlert("Login Failed", "There is a problem :( Code: " + result.ToString(), "Try Again");
        }
    }
}
