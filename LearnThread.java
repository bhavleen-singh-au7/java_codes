//checking states of threads before program terminations
class LearnThread implements Runnable
{
	String name;
	Thread some;
	LearnThread(String str){
		name = str;
		some=new Thread(this, name);
		System.out.println("New threads are starting:"+some);
		some.start();
	}
	public void run(){
		try{
			for(int count=0;count<2;count++){
				System.out.println(name+" :"+count);
				some.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println(name+"interruted");
		}
		System.out.println(name+"exiting");
	}
	public static void main(String arr[]){
		LearnThread obj1=new LearnThread("one");
		LearnThread obj2=new LearnThread("two");
		LearnThread obj3=new LearnThread("three");
		System.out.println("first thread is alive :"+obj1.some.isAlive());
		System.out.println("second thread is alive :"+obj2.some.isAlive());
		System.out.println("third thread is alive :"+obj3.some.isAlive());
		try{
			System.out.println("in this main method, waiting for the thread to finish");
			obj1.some.join();
			obj2.some.join();
			obj3.some.join();
		}catch(InterruptedException e){
			System.out.println("main method is interrupted");
		}
		System.out.println("first thread is alive :"+obj1.some.isAlive());
		System.out.println("second thread is alive :"+obj2.some.isAlive());
		System.out.println("third thread is alive :"+obj3.some.isAlive());
		System.out.println("main thread is over and exiting");
	}
}