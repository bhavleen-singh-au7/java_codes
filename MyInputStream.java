// to read the value/text from the existing file
import java.io.FileInputStream;
public class MyInputStream
{
	public static void main(String arr[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("myTest.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception e){System.out.println(e);}
	}
}