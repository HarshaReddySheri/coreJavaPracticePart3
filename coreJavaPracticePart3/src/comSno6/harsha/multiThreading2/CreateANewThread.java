package comSno6.harsha.multiThreading2;

public class CreateANewThread {
	// How to create one thread & execute?
	//How to create MultiThreading & execute?
	//By this 2 make you learned multiThreading
	
	/*
	 * for example java mainMethod is also a One Task(Thread) so that internally
	 * java always provide one thread for PSV main(String [] args)  or each piece of code that one thread execute the
	 * program and code
	 * 
	 * when work is alloted to thread after work completed then thread is dead finally
	 * 
	 */
	
	/* Remember
	 * 
	 * working with file -> Remember File class
	 * working with exception -> Remember exception class
	 * working with MultiThreading -> Remember Thread class 
	 * 
	 * 
     */
	public static void main(String[] args) {
		/*
		 * Running Race we use GunFire(to start running race) 
		 * Similarly
		 * Thread Race we use tread.start (to start thread under run)
		 */
		
		/*
		 * Thread is Created not started because of not alloted a Task
		 * Similarly
		 * Employee are their not under working because of not alloted a project 
		 * Employee are under Bench
		 * 
		 */
		Thread t1 = new Thread();
		t1.start();
		
	   /*we started but what we executing 
	    * let say add of Two numbers Or average of two number
	    * 
	    * we started but not alloted a task
	    * 
	    * Thread class called Run method inside  Run method Piece of code will be executed
	    * Thread is a default class know but how can we keep our own logic 
	    * to execute our own logic we keep piece of code in run()
	    * Thread always executed run method internally 
	    * so that don't call run() , call start();
	    * internally start will call to run() method
	    * 
	    */
		
		
		Thread t2 = new Thread();
		t2.start();

		Thread t3 = new Thread();
		t3.start();

		Thread t4 = new Thread();
		t4.start();
		
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getPriority());
	}

}
