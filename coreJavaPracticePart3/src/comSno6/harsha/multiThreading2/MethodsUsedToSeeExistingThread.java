package comSno6.harsha.multiThreading2;

public class MethodsUsedToSeeExistingThread {

	public static void main(String[] args) {
		System.out.println("Hello Guys");
		//By this we know or estimate of the number of active threads in the currentthread's 
		System.out.println(Thread.activeCount());
		
		//java allocate default id & name for every thread to identify
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		
		//By default it's not run under max or min priority 
		//By default it is run under Normal priority
		System.out.println(Thread.currentThread().getPriority());
	}

}
