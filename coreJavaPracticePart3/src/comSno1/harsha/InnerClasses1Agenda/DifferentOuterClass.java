package comSno1.harsha.InnerClasses1Agenda;

import comSno1.harsha.InnerClasses1Agenda.SameOuterClass.TestClass4;
import comSno1.harsha.InnerClasses1Agenda.SameOuterClass.TestClass5;

public class DifferentOuterClass {

	private int id = 101;
	public static void main(String[] args) {
		System.out.println("In main method: DifferentOuterClass");

		

	}
	
	//Different Outer Class of their inner class object can called in different Outer class Of ther inner's 
	//By simple adding of their Outer class Object before the inner class object
	
	//Nested Non-Static Inner Class
	public class TC101{
		TestClass4 tc4 = new SameOuterClass().new TestClass4();
	}
	//Nested Non-Static Inner Class
	public class TC102{
		TestClass5 tc5 = new SameOuterClass().new TestClass5(); 
	}
	
	

}
