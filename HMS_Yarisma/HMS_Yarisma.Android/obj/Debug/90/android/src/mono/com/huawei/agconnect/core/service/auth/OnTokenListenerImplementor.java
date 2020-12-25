package mono.com.huawei.agconnect.core.service.auth;


public class OnTokenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.agconnect.core.service.auth.OnTokenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChanged:(Lcom/huawei/agconnect/core/service/auth/TokenSnapshot;)V:GetOnChanged_Lcom_huawei_agconnect_core_service_auth_TokenSnapshot_Handler:Com.Huawei.Agconnect.Core.Service.Auth.IOnTokenListenerInvoker, XAgconnectCore-1.4.0.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Agconnect.Core.Service.Auth.IOnTokenListenerImplementor, XAgconnectCore-1.4.0.300", OnTokenListenerImplementor.class, __md_methods);
	}


	public OnTokenListenerImplementor ()
	{
		super ();
		if (getClass () == OnTokenListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Agconnect.Core.Service.Auth.IOnTokenListenerImplementor, XAgconnectCore-1.4.0.300", "", this, new java.lang.Object[] {  });
	}


	public void onChanged (com.huawei.agconnect.core.service.auth.TokenSnapshot p0)
	{
		n_onChanged (p0);
	}

	private native void n_onChanged (com.huawei.agconnect.core.service.auth.TokenSnapshot p0);

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
