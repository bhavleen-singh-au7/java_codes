import java.util.Scanner;
class Tri
{
	public static void main(String arr[])
	{
		int a;
		System.out.println("Enter Length Of Pyramid");
		Scanner b=new Scanner(System.in);
		a=b.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>i;j--)
			{	
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}