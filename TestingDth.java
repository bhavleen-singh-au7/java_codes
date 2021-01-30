public class TestingDth extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("daemon thread work"); //checking for daemon thread
		}
		else
		{
			System.out.println("user thread");
		}
	}
	public static void main(String arr[])
	{
		TestingDth t1=new TestingDth();
		TestingDth t2=new TestingDth();
		TestingDth t3=new TestingDth();
		
		
		t1.setDaemon(true); //now t1 is daemon thread
		
		t1.start();		//first we set thread as daemon then it will start
		t2.start();		//otherwise throw a exception 
		t3.start();
	}
}