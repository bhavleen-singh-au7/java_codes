import java.util.Calendar;
class Trying
{
	public static void main(String arr[])
	{
		int days=Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		System.out.println("Days: "+days);
		System.out.println("Days left for the next year: "+(365-days));
		
		
	}
}
