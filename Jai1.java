import java.util.Scanner;
class Jai1
{
public static void main(String arr[])
{
int a[]=new int[5];
Scanner obj=new Scanner(System.in);
System.out.println("enter the value of matrix");
for(int i=0;i<4;i++)
{
 a[i]=obj.nextInt();
}
for(int i=0;i<4;i++)
{
 System.out.print(a[i]);
}
}
}