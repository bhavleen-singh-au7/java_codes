//normal behaviour of thread even after interruption
class TestIntruptTh extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
	public static void main(String arr[])
	{
		TestIntruptTh t1=new TestIntruptTh();
		t1.start();
		
		t1.interrupt();
	}
}