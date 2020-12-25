package mono.com.huawei.hmf.tasks;


public class OnFailureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hmf.tasks.OnFailureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailure:(Ljava/lang/Exception;)V:GetOnFailure_Ljava_lang_Exception_Handler:Com.Huawei.Hmf.Tasks.IOnFailureListenerInvoker, XTasks-1.4.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hmf.Tasks.IOnFailureListenerImplementor, XTasks-1.4.1.300", OnFailureListenerImplementor.class, __md_methods);
	}


	public OnFailureListenerImplementor ()
	{
		super ();
		if (getClass () == OnFailureListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hmf.Tasks.IOnFailureListenerImplementor, XTasks-1.4.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onFailure (java.lang.Exception p0)
	{
		n_onFailure (p0);
	}

	private native void n_onFailure (java.lang.Exception p0);

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
