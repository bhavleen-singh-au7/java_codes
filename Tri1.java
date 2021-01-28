import java.util.Scanner;
class Tri1
{
	public static void main(String arr[])
	{
		int total,r,a,h,b;
		String circle,square,triangle,user;
		System.out.println("Enter 1 shape: circle, square, triangle");
		Scanner ob=new Scanner(System.in);
		user=ob.nextLine();
		switch(user)
		{
		case "circle":
		{ 
			System.out.println("enter radius of Circle");
			r=ob.nextInt();
			total=3*r*r;
			System.out.println("Area Of Circle = "+total);
			break;
		}
		case "square":
		{
			System.out.println("enter area of Square");
			a=ob.nextInt();
			total=a*a;
			System.out.println("Area Of Sqaure = "+total);
			break;
		}
		case "triangle":
		{
			System.out.println("enter Heigh & Base Of Triangle");
			h=ob.nextInt();
			b=ob.nextInt();
			total=1/2*b*h;
			System.out.println("Area Of Triangle = "+total);
			break;
		}
		}
	}
}
