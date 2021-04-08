class TestIntruptTh1 extends Thread
//use of isintruppeted and intrrupted method
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("code for interrupted thread");
			}
			else
			{
				System.out.println("code for normal thread");
			}
		}
	}
	public static void main(String arr[])
	{
		TestIntruptTh1 t1=new TestIntruptTh1();
		TestIntruptTh1 t2=new TestIntruptTh1();
		
		t1.start();
		t1.interrupt();
		
		
		t2.start();
	}
}