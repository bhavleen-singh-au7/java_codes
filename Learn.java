//toUpperCase()  		//toLowerCase()		//indexOf()		//lastIndexOf()
//equals()		//equalsIgnoreCase()		//substring()
class Learn
{
	public static void main(String arr[])
	{
		String s1=("This is my Computer");
		//String s2=("this is my computer");
		//String s2=s1.substring(7); //will give output of string after 7 index i.e., " my computer"
		String s2=s1.substring(5,7); //this will give 5,6 index only 7=end point the output= "is"
		//int s2=s1.indexOf('m'/*"my"*//*14*/);//by 14 then it will search from index #14 instead of 0 index
		//System.out.println(s2);
		//s2=s1.lastIndexOf('m'); //by this it given 13 bcoz it starts from last index but here index never change it always starts with 0 on first variable
		/*System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		s2=s1.toLowerCase();*/
		System.out.println(s2);
		
	/*	if(s1.equalsIgnoreCase(s2))
			System.out.println("same");
		else
			System.out.println("not same");*/
		
	}
}
