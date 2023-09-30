package comSno1.harsha.InnerClasses1Agenda;

import comSno1.harsha.InnerClasses1Agenda.SameOuterClass.TestClass4;
import comSno1.harsha.InnerClasses1Agenda.SameOuterClass.TestClass5;

//InnerClassObject are called in different inner class of different outer class By this method
//we have to create object in different manner as like did in previous same outer class main object creation
public class DifferentOuterClass {

	private int id = 101;
	public static void main(String[] args) {
		System.out.println("In main method: DifferentOuterClass");

		

	}
	
	/*
	 * Different Outer Class of their inner class object can called in different
	 * Outer class Of their inner's By simple adding of their Outer class Object
	 * before the inner class object
	 */
	
	//Nested Non-Static Inner Class
	public class TC101{
		TestClass4 tc4 = new SameOuterClass().new TestClass4();
	}
	//Nested Non-Static Inner Class
	public class TC102{
		TestClass5 tc5 = new SameOuterClass().new TestClass5(); 
	}
	
	/*
	 * (TestClass1) outer class of (TestClass5)inner class object will be 
	 * called in
	 * (DifferentOuterClass) different outer class  of their inner class (Test Class 101)
	 */

}
