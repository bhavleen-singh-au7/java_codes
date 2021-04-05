//multiple input stream with enum as parameter
import java.io.*;
import java.util.*;
public class Input2
{
	public static void main(String arr[])throws Exception
	{
		//creating the FileInputStream objects for all the files
		FileInputStream fin1=new FileInputStream("myTest.txt");
		FileInputStream fin2=new FileInputStream("myTest1.txt");
		FileInputStream fin3=new FileInputStream("myTest2.txt");
		
		//creating Vector object to all the stream
		Vector v=new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		
		//creating enumeration object by calling the elements method
		Enumeration en=v.elements();
		
		//passing the enumeration object in the constructor
		SequenceInputStream inst=new SequenceInputStream(en);
		int j;
		while((j=inst.read())!=-1)
		{
			System.out.print((char)j);
		}
		inst.close();
		fin1.close();
		fin2.close();
		fin3.close();
		System.out.println("success");
	}
}