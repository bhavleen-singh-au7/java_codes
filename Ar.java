class Ar 
{
public static void main(String arr[])
{
	int temp;
	int a[]={3,9,12,55,76};
	for(int i=0;i<5;i++)
	{
		for(int j=i+1;j<5;j++)
		{
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	}
	for(int i=0;i<5;i++)
	{
		
		System.out.print(a[i]+" ");
	}
	
}
}