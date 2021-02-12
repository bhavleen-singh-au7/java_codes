import java.io.*;
class Student implements Serializable
{
	int id;
	String name;
	transient int age;
	public Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println(id+" "+age+" "+name);
	}
}
public class Serial
{
	public static void main(String arr[])throws Exception
	{
		Student s1=new Student(01,"rab",20);
		FileOutputStream fout= new FileOutputStream("Serial1.txt");
		ObjectOutputStream obj= new ObjectOutputStream(fout);
		
		obj.writeObject(s1);
		obj.flush();
		System.out.println("success");
	}
}