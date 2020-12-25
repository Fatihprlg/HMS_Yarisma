using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using System.IO;
using Com.Huawei.Agconnect.Config;
using Android.Util;

namespace HMS_Yarisma.Droid
{
    class HMSLazyInputStream : LazyInputStream
    {
        public HMSLazyInputStream(Context context) : base(context)
        {
        }
        public override Stream Get(Context context)
        {
            try
            {
                return context.Assets.Open("agconnect-services.json");
            }
            catch (Exception e)
            {
                Log.Error(e.ToString(), "Can't open agconnect file");
                return null;
            }
        }
    }
}