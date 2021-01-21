class Zero1
{
	public void someMethod()
	{
		System.out.println("print kch b");
	}
}
public class Zero
{
	public static void main(String arr[])
	{
		Zero1 obj=new Zero1()
		{
			@Override public void someMethod()
			{
				System.out.println("print something");
			}	
		
		};
	obj.start();	
	}
	
}