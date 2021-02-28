//thread making by implements interface
class T implements Runnable
{
	String name;
	public void run()
	{
		int count=0;
		while(count<3)
		{
			System.out.println(Thread.activeCount());
			name=Thread.currentThread().getName();
			System.out.println(name);
			count++;
		}
	}
}
public class Thread1
{
	public static void main(String arr[])
	{
		T obj1=new T();
		Thread th=new Thread(obj1);	
		th.start();
	}
}