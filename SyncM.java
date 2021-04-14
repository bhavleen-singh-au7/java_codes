//example of syncronized method
class Table{
	//synchronized void printTable(int n)
	//void printTable(int n)
	synchronized static void printTable(int n)
	{
		//synchronized(this){
		for(int i=1;i<=5;i++)
			System.out.println(n*i);
		try
		{
			Thread.sleep(400);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class SyncM
{
	public static void main(String arr[])
	{
		Table obj=new Table(); //only one object
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}
}