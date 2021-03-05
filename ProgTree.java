class ProgTree
{
	public static void main(String[] arr)
	{
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=20-i;j++)
			{
				System.out.print(' ');
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int a=1;a<=7;a++)
		{
			for(int b=1;b<=20;b++)
			{
				System.out.print(' ');
				if(b==19)
				{
					System.out.print("***");
				}
			}
			System.out.println();
		}
	}
}