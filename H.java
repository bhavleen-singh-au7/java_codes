class H
{
	public static void main(String arr[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||j==5)
				{
					System.out.print("*");
				}
				else if(i==3)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
