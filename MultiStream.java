//to read value from 2 .txt file and write in another seperate file
//for more than 1 input stream at a time
import java.io.*;
public class MultiStream
{
	public static void main(String arr[])throws Exception
	{
		FileInputStream fin1=new FileInputStream("myTest.txt");
		FileInputStream fin2=new FileInputStream("myTest1.txt");
		FileOutputStream fout=new FileOutputStream("myTestF.txt");
		SequenceInputStream inst=new SequenceInputStream(fin1,fin2);
		int j;
		while((j=inst.read())!=-1)
		{
			fout.write(j);
		}
		inst.close();
		fin1.close();
		fin2.close();
		fout.close();
		System.out.println("success");
	}
}