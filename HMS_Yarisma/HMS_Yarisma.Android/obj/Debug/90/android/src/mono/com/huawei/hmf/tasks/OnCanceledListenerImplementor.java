package mono.com.huawei.hmf.tasks;


public class OnCanceledListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hmf.tasks.OnCanceledListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCanceled:()V:GetOnCanceledHandler:Com.Huawei.Hmf.Tasks.IOnCanceledListenerInvoker, XTasks-1.4.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hmf.Tasks.IOnCanceledListenerImplementor, XTasks-1.4.1.300", OnCanceledListenerImplementor.class, __md_methods);
	}


	public OnCanceledListenerImplementor ()
	{
		super ();
		if (getClass () == OnCanceledListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hmf.Tasks.IOnCanceledListenerImplementor, XTasks-1.4.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onCanceled ()
	{
		n_onCanceled ();
	}

	private native void n_onCanceled ();

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
