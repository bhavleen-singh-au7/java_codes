//thread making by extends thread
class T extends Thread
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
public class Thread2
{
	public static void main(String arr[])
	{
		T obj1=new T();	
		obj1.start();
	}
}