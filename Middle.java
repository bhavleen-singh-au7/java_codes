class Middle
{
	public static void main(String arr[])
	{
		for(int a=1;a<=3;a++)
		{
			for(int b=1;b<=31;b++)
				{
					if(b>=1&&b<=9)
					System.out.print(" ");
					else 
					{
						if(a==1)
						{
							System.out.print("*");			
						}
						else{
						
						if(b>=11 && b<=30)
						System.out.print(" ");
						else
						System.out.print("*");
						
						}
						
					}
					
				}System.out.println();
		}
	}
}