import java.io.Console;
class NamePass
{
	public static void main(String arr[])
	{
		Console c=System.console();
		System.out.println("enter your name");
		String n=c.readLine();
		System.out.println("Welcome -  "+n);
		System.out.println("Enter password");
		char[] ch=c.readPassword();
		String pass=new String(ch);
		System.out.println("Password is: "+pass);
	}
}