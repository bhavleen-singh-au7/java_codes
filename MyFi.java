class MyFi
{
	public static void main(String arr[])
	{
		int a=0,b=1,c=0,i;
		System.out.print(a+" "+b);
		for(i=0;i<6;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c+" ");
		}
	}
}