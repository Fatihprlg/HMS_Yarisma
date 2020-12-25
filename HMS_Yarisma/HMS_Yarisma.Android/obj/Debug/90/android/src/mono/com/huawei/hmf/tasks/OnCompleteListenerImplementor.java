package mono.com.huawei.hmf.tasks;


public class OnCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.huawei.hmf.tasks.OnCompleteListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onComplete:(Lcom/huawei/hmf/tasks/Task;)V:GetOnComplete_Lcom_huawei_hmf_tasks_Task_Handler:Com.Huawei.Hmf.Tasks.IOnCompleteListenerInvoker, XTasks-1.4.1.300\n" +
			"";
		mono.android.Runtime.register ("Com.Huawei.Hmf.Tasks.IOnCompleteListenerImplementor, XTasks-1.4.1.300", OnCompleteListenerImplementor.class, __md_methods);
	}


	public OnCompleteListenerImplementor ()
	{
		super ();
		if (getClass () == OnCompleteListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Huawei.Hmf.Tasks.IOnCompleteListenerImplementor, XTasks-1.4.1.300", "", this, new java.lang.Object[] {  });
	}


	public void onComplete (com.huawei.hmf.tasks.Task p0)
	{
		n_onComplete (p0);
	}

	private native void n_onComplete (com.huawei.hmf.tasks.Task p0);

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
