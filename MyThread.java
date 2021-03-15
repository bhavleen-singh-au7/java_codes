//self
class Add implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
			System.out.println("THREAD ADD "+i);
		/**int a=10,b=20;
		int c=a+b;
		System.out.println("thread add "+c);**/
	}
}
class Sub implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
			System.out.println("THREAD SUB "+i);
		/**int a=10,b=20;
		int c=a-b;
		System.out.println("thread sub "+c);**/
	}
}
class MyThread
{
	public static void main(String arr[])
	{
		Thread t1=new Thread(new Add());
		Thread t2=new Thread(new Sub());
		t1.start();
		t2.start();
	}
}