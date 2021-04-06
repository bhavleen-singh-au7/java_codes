import java.util.Scanner;
class Home
{
	int square(int a)
	{
		System.out.println(a*a);
		return 0;
	}
	int circle(int r)
	{
		System.out.println(3.14159*r*r);
		return 0;
	}
	int triangle(int b,int h)
	{
		System.out.println(1/2*b*h);
		return 0;
	}
	public static void main(String arr[])
	{
		int a,r,b,h;
		Scanner ob=new Scanner(System.in);
		a=ob.nextInt();
		r=ob.nextInt();
		b=ob.nextInt();
		h=ob.nextInt();
		Home ob1=new Home();
		ob1.square(a);
		Home ob2=new Home();
		ob2.circle(r);
		Home ob3=new Home();
		ob3.triangle(b,h);
		
	}
}