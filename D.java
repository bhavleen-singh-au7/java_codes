class D
{
	public static void main(String arr[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==1||i==5)||(j==2)) 
				{
					System.out.print('*');
				}
				else if(j==5)
				{
					System.out.print(" *");
				}
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}