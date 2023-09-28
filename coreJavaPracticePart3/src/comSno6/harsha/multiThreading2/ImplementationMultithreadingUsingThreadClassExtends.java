package comSno6.harsha.multiThreading2;
//1st way extends Thread class
public class ImplementationMultithreadingUsingThreadClassExtends {


	public static void main(String[] args) {
		
		
		Employee t1 = new ImplementationMultithreadingUsingThreadClassExtends().new Employee("HARSHA");
		t1.start();
		
		Manager t2 = new ImplementationMultithreadingUsingThreadClassExtends().new Manager();
		t2.start();
		
		System.out.println(Thread.activeCount());

	}
	
	//here oops concept will enter in MultiThreading
	/*
	 * Inheritance
	 * 
	 * SomeOne is create a class and they place a logic in methods
	 * but i want to place My own method logic
	 * 
	 * By these
	 * I want to extends the class & i want to @override
	 * 
	 * when i use extended class indirectly 
	 * my own logic run() method i use for thread
	 *
	 */
	
	
	/*
	 * By default thread class 
	 * employee extends Thread
	 * 
	 * Thread class called Run method inside  Run method Piece of code will be executed
	 * Thread is a default class know but how can we keep our own logic 
	 * to execute our own logic we keep piece of code in run()
	 * Thread always executed run method internally 
	 * so that don't call run() , call start();
	 * internally start will call to run() method
	 * 
	 */
	class Employee extends Thread{
		//How to give a Name to Thread?
		//method for giving naming to Thread......
		public Employee(String tName) {
			super(tName);
		}
		
		
		@Override
		public void run() {
			System.out.println("hello " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
		}
	}
	
	class Manager extends Thread{
		@Override
		public void run() {
			System.out.println("hi " + Thread.currentThread().getName() + ">>" + Thread.currentThread().getId());
		}
		
	}




}
