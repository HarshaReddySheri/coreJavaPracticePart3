package comSno2.harsha.InnerClasses2Agenda;
//Local Classes ==> Any Thing we have to use in class in only one block then these class is create as a local class
//we can't access anywhere (out side the block & out side the constructor )because it a local class.
//If we create local class inside 
//1.Main method--> it permitted to main
//2.static block --> it permitted to static block
//3.nonstatic block --> it permitted to non static block
//4.construtor -->it permitted to constructor
//we can't access local class Out of these  4 type 
//why?-->because its scope can't allow
public class LocalClass{
	private int id = 100;
	public static void main(String[] args) {
		
		int salary = 5000;
		//local class have access entair class member of Outer class or Outside the local class member
		//child can access parent property
		
		//here salary is parent class
		class A{
			//here class A is the child class
			//salary access in child 
			public void print() {
				System.out.println("Salary is " + salary);
			}
		}
		A a = new A();
		a.print();
		
		
		///////////////////////////////
		//local class only applicable to default or abstract or final is permitted
		//not all access modifier are applicable
		final class B{
			 
		}
		abstract class C{
			
		}
		//////////////////////////////

	}
	
	
	//parent can't access child property.......
	public void show() {
		//new LocalClass().new A(); 
		System.out.println("show method is called");
	}
	
	
	
	
	//Constructor local class
	public LocalClass() { 
		class e{
			
		}
	}
	
	//non static local class block 
	{
		class f{
			
		}
	}
	//static local class block
	static {
		class g{
			
		}
	}
}
