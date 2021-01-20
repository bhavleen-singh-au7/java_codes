class Anno
{
 public void path()
 {
  System.out.println("\nprint this");
 }

 public static void main(String arr[])
 {
  Anno obj=new Anno()
  {
   @Override public void path()
   {
    System.out.println("\nprint none");
   }
  };
  //Anno obj2=new Anno(); //making 2nd object to print 1path method
  obj.path();
  //obj2.path(); //by making diffrect object and call it also
 }
}