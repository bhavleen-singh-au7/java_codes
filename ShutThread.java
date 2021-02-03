//leaning shutdown hook
class TestShutdownHook extends Thread
{
	public void run()
	{
		System.out.println("shut down hook task completed");
	}
}
public class ShutThread
{
	public static void main(String arr[])throws Exception
	{
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new TestShutdownHook());
		System.out.println("now main sleeping... press ctrl+c to exit");
		try
		{
			Thread.sleep(500);
		}catch (Exception e) {}
	}
}