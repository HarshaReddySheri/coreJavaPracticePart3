package comSno6.harsha.multiThreading2;

public class ImplementationMultithreadingUsingRunnableInterfaceImplements {

	public static void main(String[] args) {
		/*
		 * 2nd way Runnable Interface
		 * 
		 * Runnable has only one method run 
		 * but start method is not their 
		 * 
		 * Thread data not in Runnable
		 * 
		 * Create Runnable Object Employee & create Thread Object
		 * 
		 * ReferenceVariableOfRunnableObject is passed in ThreadObject 
		 */
		Employee e1 = new  ImplementationMultithreadingUsingRunnableInterfaceImplements().new Employee();
		Thread t1 = new Thread(e1);
		t1.start();
		manager m1 = new  ImplementationMultithreadingUsingRunnableInterfaceImplements().new manager();
		Thread t2 = new Thread(m1);
		t2.start();
		
		manager m2 = new  ImplementationMultithreadingUsingRunnableInterfaceImplements().new manager();
		m2.drive(160, "Tata");

	}

	/*
	 *here the concept oops Inheritance
	 *
	 *why 2nd way?
	 *
	 *java doesn't support multiple inheritance where in class level
	 *so that runnable interface used for multiple inheritance where in interface level
	 *
	 *
	 *In future you want to extends another class you can't do
	 *
	 *
	 *More then one class you can't extend in one class( In class level )
	 *for example
	 *class Employee extends Thread{
	 *
	 *}
	 *
	 *
	 *But
	 *
	 *
	 *More then one interface you can implement in one class ( In Interface level )
	 *for example
	 *public class Employee (here is option for extends Thread) implements Car, Runnable (moreThen one Interface){
	 *
	 *}
	 * 
	 * 
	 */

	public class Employee implements Runnable{

		@Override
		public void run() {
			System.out.println("hello Employee " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());

		}

	}
	public class manager extends Thread implements Car, Runnable{

		@Override
		public void run() {
			System.out.println("hi manager " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());

		}
		

		public void drive(int speed, String model){
			System.out.println("Driving " + model);
			System.out.println("Car is driving very smoothly at speed " + speed);

			if(speed>100)
				System.out.println("fast driving");
			else
				System.out.println("slow driving");

		}





		@Override
		public void drive() {
			// TODO Auto-generated method stub
			
		}



	}

}
