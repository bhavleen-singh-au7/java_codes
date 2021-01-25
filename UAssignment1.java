import java.util.Scanner;
class UAssignment1
{
	public static void main(String arr[])
	{
		int ar[]=new int[10];
		int temp;
		System.out.println("enter 10 value in array");
		Scanner obj=new Scanner(System.in);
		for(int a=0;a<10;a++)
		{
			ar[a]=obj.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}