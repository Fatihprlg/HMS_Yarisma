package mono.com.huawei.hms.common.internal;


public class BaseHmsClient_OnConnectionFailedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectionFailed:(Lcom/huawei/hms/api/ConnectionResult;)V:GetOnConnectionFailed_Lcom_huawei_hms_api_ConnectionResult_Handler:Com.Huawei.Hms.Common.Internal.BaseHmsClient/IOnConnectionFailedListenerInvoker, XBase-5.0.4.301\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Common.Internal.BaseHmsClient+IOnConnectionFailedListenerImplementor, XBase-5.0.4.301", BaseHmsClient_OnConnectionFailedListenerImplementor.class, __md_methods);
	}


	public BaseHmsClient_OnConnectionFailedListenerImplementor ()
	{
		super ();
		if (getClass () == BaseHmsClient_OnConnectionFailedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Common.Internal.BaseHmsClient+IOnConnectionFailedListenerImplementor, XBase-5.0.4.301", "", this, new java.lang.Object[] {  });
	}


	public void onConnectionFailed (com.huawei.hms.api.ConnectionResult p0)
	{
		n_onConnectionFailed (p0);
	}

	private native void n_onConnectionFailed (com.huawei.hms.api.ConnectionResult p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
