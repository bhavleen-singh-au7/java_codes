class Trying1
{
	public static void main(String arr[])
	{
		System.out.printf("%n");
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=40;j++)
			{
				p(i>=1&&i<10&&j>=1&&j<=40?
				(i>=1&&i<=2&&j>=19&&j<21
				||i>=3&&j>9&&j<=30||
				i>=6&&j>5&&j<=35?
				(i>=4&&i<=5&&j>10&&j<30||
				i>=7&&i<=9&&j>6&&j<=34?" ":"*"):
				" "):"*");
			}
			System.out.println();
		}
	}
	private static <T> void p(T a)
	{
		System.out.print(a);
	}
}