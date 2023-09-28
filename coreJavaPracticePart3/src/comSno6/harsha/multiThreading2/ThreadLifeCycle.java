package comSno6.harsha.multiThreading2;

public class ThreadLifeCycle {
	public static void main(String[] args) throws Exception {
		Runnable r1 = () -> {
			//System.out.println("hello Employee " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
			
	};
	Runnable r2 = () -> {
			//System.out.println("hello Employee " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());	
	};
	
	
	//6 steps for ThreadLifeCycle
	
	/*
	 * 0 -> New (created Thread)
	 * 1 -> Runnable ( Thread under go )
	 * 2 -> Blocked (Operations Like Synchronization(for example -> Variable or data accessing one Thread & can't access Other Thread until it is released firstThread is called synchronization)
	 * 3 -> waiting (join)
	 * 4 -> Timed waiting (specific time/sleep)
	 * 5 -> Terminated
	 * 
	 */
	
	//To find the STATUS of Thread use t.getState();
	
	Thread t1 = new Thread(r1, "T1");
	Thread t2 = new Thread(r2, "T2");
	
	System.out.println(t1.getState()); //NEW
	t1.start();
	System.out.println(t1.getState()); //RUNNABLE
	t1.sleep(10000);
	System.out.println(t1.getState()); //TERMINATED
	
	
	t1.start();// IF YOU WANT TO DO A SURVIVE OR FAVOUR TO THREAD. IT THROW AN EXCEPTION(ILLEGALtHREADSTATEXCEPTION)
	System.out.println(t1.getState()); //WHEN WORK IS ALLOTED TO THREAD AFTER WORK COMPLETED THEN THREAD IS DEAD
									   //ONCE THREAD IS DEAD, CAN'T BE SURVIVE AGAIN
	
	
	t2.start();
	System.out.println(t2.getState()); //TERMINATED
 	}
	
}
