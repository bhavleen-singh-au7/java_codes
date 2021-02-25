class Rec
{
	public static void main(String arr[])
	{
		for(int e=1;e<=2;e++)
		{
			for(int f=1;f<=4;f++)
			{
				System.out.print(" ");
			}
			for(int g=1;g<=2;g++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1;a<=3;a++)
		{
			for(int b=1;b<=8;b++)
				{
					if(b==1||b==2)
					System.out.print(" ");
					else 
					{
						if(a==1)
						{
							System.out.print("*");			
						}
						else{
						
						if(b>=4 && b<=7)
						System.out.print(" ");
						else
						System.out.print("*");
						
						}
						
					}
					
				}System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			if(i==1||i==4)
			{
				for(int j=1;j<=10;j++)
				{
				System.out.print("*");
				}
			}
			else
			{
				for(int k=1;k<=10;k++)
				{
					if(k==1||k==10)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}