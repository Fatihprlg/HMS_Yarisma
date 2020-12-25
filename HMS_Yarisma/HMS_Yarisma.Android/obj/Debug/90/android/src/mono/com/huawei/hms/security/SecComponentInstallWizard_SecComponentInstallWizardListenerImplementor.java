package mono.com.huawei.hms.security;


public class SecComponentInstallWizard_SecComponentInstallWizardListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailed:(ILandroid/content/Intent;)V:GetOnFailed_ILandroid_content_Intent_Handler:Com.Huawei.Hms.Security.SecComponentInstallWizard/ISecComponentInstallWizardListenerInvoker, XBase-5.0.4.301\n" +
			"n_onSuccess:()V:GetOnSuccessHandler:Com.Huawei.Hms.Security.SecComponentInstallWizard/ISecComponentInstallWizardListenerInvoker, XBase-5.0.4.301\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hms.Security.SecComponentInstallWizard+ISecComponentInstallWizardListenerImplementor, XBase-5.0.4.301", SecComponentInstallWizard_SecComponentInstallWizardListenerImplementor.class, __md_methods);
	}


	public SecComponentInstallWizard_SecComponentInstallWizardListenerImplementor ()
	{
		super ();
		if (getClass () == SecComponentInstallWizard_SecComponentInstallWizardListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hms.Security.SecComponentInstallWizard+ISecComponentInstallWizardListenerImplementor, XBase-5.0.4.301", "", this, new java.lang.Object[] {  });
	}


	public void onFailed (int p0, android.content.Intent p1)
	{
		n_onFailed (p0, p1);
	}

	private native void n_onFailed (int p0, android.content.Intent p1);


	public void onSuccess ()
	{
		n_onSuccess ();
	}

	private native void n_onSuccess ();

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
