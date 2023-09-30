package comSno1.harsha.InnerClasses1Agenda;

/*Important
 **********
 *
 * Inside java file --> Multiple classes are present is different
 *				-----> Class inside class is different	
 */
public class Agenda1 {

	public static void main(String[] args) {
		System.out.println("In Main Method: TestClass1");
	}

}

class TestClass2{
	 public static void main(String[] args) {
		 System.out.println("In Main Method: TestClass2");
	 }
}

class TestClass3{
	public static void main(String[] args) {
		System.out.println("In Main Method: TestClass3");
	}
}


class TestClass4{
	public static void main(String[] args) {
		System.out.println("In Main Method: TestClass4");
	}
	
}

/* Agenda1
 * ********
 * 1.Can we have more then one class in a java file? 
 * Ans:Yes we can have
 * 
 * 2.Can we have more then on public class in a java file?
 * Ans: 1.No, it shows error, we can't declare more then one public class in a java file
 * 		2.which one we said public class it must be same name of java file & public class
 * 
 * 
 * 3.How many class files will be generated when multiple classes are present in a java file?
 * Ans:Number of classes which are present in a java file 
 * 		proportional to OR equal to 
 * 	   Number of classes files are generated	
 * 
 * when we compile
 * Here we have 4 class file are generated in java 
 * when it's time for Execution
 * but execution time the classes which have main inside each class,
 * it suggest you which one could be preferred for execution
 * 
 * 	   	
 * 4.Can we have main method in all the classes present at root level of java file?
 * Ans:Yes, you can have main method in all the class present at root level of java file
 * 
 * 		but execution time the classes which have main inside each class,
 * 		it suggest you which one could be preferred for execution
 * 
 * 5.If a java file contains more then one class at the root level, are they considered as inner classes?
 * Ans: When we keep classes in java file,
 * 		except main class will i call inner class 
 * 		the answer is NO
 * 
 * These above program
 * is not inner class 
 * They are the normal class but they just packed in a java file
 */