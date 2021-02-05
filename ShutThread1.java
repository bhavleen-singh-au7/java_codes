//leaning shutdown hook by annonymous class
public class ShutThread1
{
	public static void main(String arr[])throws Exception
	{
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new Thread()
		{
			public void run()
			{
				System.out.println("shut down hook task completed");
			}
		}
	);
		System.out.println("now main sleeping... press ctrl+c to exit");
		try
		{
			Thread.sleep(500);
		}
		catch (Exception e) {}
	}
}