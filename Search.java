class Search
{
public static void main(String arr[])
{
int list[]={10,11,12,13,14,15,16,17,18,19,20};
int x=21,a=0;
for(int i=0;i<11;i++)
{
 if(x==list[i])
 { 
	a=1;
	System.out.println("success  "+list[i]);
 }
}
if(a==0)
System.out.println("wrong input");


}
}