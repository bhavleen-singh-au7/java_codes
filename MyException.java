class MyException
{
	public static void main(String arr[])
	{
		try{
		int a[]=new int[2];
		System.out.println(a[5]);
		}	
		catch(Exception e)
		{
		System.out.println("input value does not exist");
		}
	}
}