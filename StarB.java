class StarB
{
	public static void main(String[] arr)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=2&&j<=i-1)
				{
					System.out.print(' ');
				}
				else
				{
					System.out.print('*');
				}
			}
		/*	for(int j=2;j<=i;j++)
			{
				System.out.print(' ');
			}
			for(int k=1;k<=1;k++)
			{
				System.out.print('*');
			}
			System.out.println();*/
		}
	}
}