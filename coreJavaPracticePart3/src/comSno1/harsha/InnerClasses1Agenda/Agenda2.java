package comSno1.harsha.InnerClasses1Agenda;
/*Agenda-2
 *1.What is an Inner class?
 *Ans:Any class which i have placed a class member then it called Inner class
 *
 *2.How many types of Inner classes available? and what are they?
 *Ans:4 types of Inner class in java
 *		1. nested Non-Static inner classes
 *		2. nested Static inner classes
 *		3. local Inner classes
 *		4. Anonymous Inner classes
 *
 *
 */

//OuterClass
public class Agenda2 {
	int id = 101;
	public static void main(String[] args) {
		System.out.println("In Main method: TestClass1");
	}
	//InnerClass
	class TestClass4{
		
	}
	//InnerClass
	class TestClass5{
		 
	}
}

//OuterClass
class TestClaas2{
	
}
//OuterClass
class TestClaas3{
	
	
}

/*
 * 3.Why Inner class are Introduced?
 * Ans:To bring the Scope to be a limited stage
 * 
 * EX: class inside member are used by Inheritance & accessible modifier
 * 		Public,Private,Protected,Default 
 *least accessible modifier is Private
 *Private is used or access within the same class & we can't access Outside the class
 *
 *private --> Inner class --> Not much more usage of class go for inner class
 *
 *Advantage
 **********
 *
 *Inner class help to access private member of outer class
 *
 *Any class which can't be access by another (not much usage of class)
 *we go for inner class 
 *
 *you are increasing the restricted area & also private member can be accessed
 *
 *Encapsulation & Inheritance concept can be used as a extraordinary by using Inner class
 *
 *Very Much relation for Inner class 
 *-->Java 8 version
 *******************
 *-> FunctionInterface
 *-> IOStreams
 *-> LambdaExpression
 *
 */

/*
 * 3.Can we have more then one InnerClass in a given class?
 * 
 * Yes we can specify more then one InnerClass in a given class
 * 
 * But every class have their Unique class name
 * Nested non-static inner classes
 * Nested static inner class
 * 
 * so we can have more then one inner class in a class but all of those innerClass name Must be unique
 * 
 * 
 */

/*
 *4. How to find inner & outer class?
 * Ans:
 * 
 * After compilation
 * 1.class file are created
 * 2.Take a Outer class with  in inner class & drag & place it in eclipse
 * 
 * EX: OuterClassName$followed by InnerClassName
 * 
 *  By reading 1
 *  ************
 *  OuterClass
 *  **********
 *  file contents with
 *  -> Inner classes:
 *  -> Nest members:
 *  we know that OuterClass file
 *  
 *  By reading 2
 *  ************
 *  InnerClass
 *  **********
 *  file contents with
 *  -> Inner classes:
 *  -> Nest Host:
 *  we know that InnerClass file
 */ 

/*
 * 5.What is default access modifier for inner class?
 * Ans: default
 * 
 * 6. How can we recognize any generated class file as Outer class Or Inner class?
 * Ans: By using
 * 		1.Naming convention
 * 		2.Open in editor can also be recognize
 * 
 * 
 */
