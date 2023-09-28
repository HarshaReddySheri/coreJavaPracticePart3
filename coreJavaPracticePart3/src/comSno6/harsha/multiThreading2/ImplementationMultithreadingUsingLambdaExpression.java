package comSno6.harsha.multiThreading2;

public class ImplementationMultithreadingUsingLambdaExpression {

	public static void main(String[] args) throws Exception {

		//AnonymousFunctionWay --> without FunctionName is called AnonymousFunction
		
		//Runnable is a @FunctionalInterface so that we have Other Approach By Lambda 

		Runnable r1 = () -> {
			for(int i= 0; i<10; i++) {
				//for clarity check MultiThreading is implemented
				System.out.println("hello Employee " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
			}	
		};

		Runnable r2 = () -> {
			for(int i=0; i<20; i++) {
				//for clarity check MultiThreading is implemented
				System.out.println("hi manager " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
			}	
		};

		
		
		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");

		t1.start();
		//t1.join(); // To stop the next Thread(i.e.,T2) & complete the previous Thread(i.e.,T1)
		t1.sleep(10000); //To stop the next thread with a specific time in mile second's
		t2.start();

		System.out.println(Thread.activeCount());


	}

}
