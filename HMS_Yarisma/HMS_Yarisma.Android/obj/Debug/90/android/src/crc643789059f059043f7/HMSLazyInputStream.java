package crc643789059f059043f7;


public class HMSLazyInputStream
	extends com.huawei.agconnect.config.LazyInputStream
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_get:(Landroid/content/Context;)Ljava/io/InputStream;:GetGet_Landroid_content_Context_Handler\n" +
			"";
		mono.android.Runtime.register ("HMS_Yarisma.Droid.HMSLazyInputStream, HMS_Yarisma.Android", HMSLazyInputStream.class, __md_methods);
	}


	public HMSLazyInputStream (android.content.Context p0)
	{
		super (p0);
		if (getClass () == HMSLazyInputStream.class)
			mono.android.TypeManager.Activate ("HMS_Yarisma.Droid.HMSLazyInputStream, HMS_Yarisma.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public java.io.InputStream get (android.content.Context p0)
	{
		return n_get (p0);
	}

	private native java.io.InputStream n_get (android.content.Context p0);

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
