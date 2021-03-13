class New1
{
	int	nMetho(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String arr[])
	{
		New1 obj=new New1();
		int x=obj.nMetho(2,3);
		System.out.println(x);
	}
}