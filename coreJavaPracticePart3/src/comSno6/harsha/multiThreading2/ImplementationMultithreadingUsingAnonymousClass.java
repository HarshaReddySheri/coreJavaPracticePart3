package comSno6.harsha.multiThreading2;

public class ImplementationMultithreadingUsingAnonymousClass {
	/*By default Java provide 2 Ways for MultiThreading
	 *1st extends Thread class
	 *2nd implements Runnable interface
	 *
	 *java provide other to ways for multiThreading
	 *Additional ways are come from additional feature's like
	 */
	public static void main(String[] args) {
		
		//AnonymousClassWay --> without class name is called AnonymousClass
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("hello Employee " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());

			}

		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("hi manager " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());

			}
			
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.activeCount());

	}

}
