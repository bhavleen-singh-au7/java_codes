import java.util.Scanner;
class Aa implements Runnable
{
	public void run()
	{	
		int a,result=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter no. to print table");
		a=ob.nextInt();
		for(int i=1;i<=10;i++)
		{
			result=a*i;
			System.out.println(a+"x"+i+"="+result);
		}
	}
}
class Ab implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
			System.out.println(i+"Thread ab is on");
	}
}
class MyThread2
{
	public static void main(String arr[])
	{
		Thread t1=new Thread(new Aa());
		Thread t2=new Thread(new Ab());
		t1.start();
		t2.start();
	}
}