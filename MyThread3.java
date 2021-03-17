class MyTh1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
			System.out.println(i+" run 1 ");
	}
}
class MyTh2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		System.out.println(i+" run 2 ");
	}
}
public class MyThread3
{
	public static void main(String arr[])
	{
		MyTh1 ob1=new MyTh1();
		ob1.start();
		MyTh2 ob2=new MyTh2();
		ob2.start();
	}
}