import java.util.Scanner;
class NaturalNoR
{
	public static void main(String[] arr)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter any natural no.");
		int a=obj.nextInt();
		System.out.println();
		for(int i=a;i>=0;i--)
		{
			System.out.println(i);
		//a--;	
		}
	}
}