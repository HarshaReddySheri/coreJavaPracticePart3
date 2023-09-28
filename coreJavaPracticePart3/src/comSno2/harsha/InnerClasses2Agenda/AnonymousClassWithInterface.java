package comSno2.harsha.InnerClasses2Agenda;

//class have only implemented method so that we can create object for it...
//Interface have only unimplemented(abstract) method are present so that we can't create object for it
//But coming to Anonymous class with interface
// interface can also create object by implement the unimplemented methods inside the with the help of anonymous class by placing implementation in anonymous class block area....

public class AnonymousClassWithInterface {

	public static void main(String[] args) {

		//we have other option in-order to convert interface to class, you go for Anonymous class
		//type Anonymous class way..
		Student s1 = new Student() {
			//Implementation can't be accessible towards global Only i want to be access..
			@Override
			public void attend() {
				System.out.println("Attendence is called");

			}

			@Override
			public int getMarks() {
				System.out.println("GetMarks is called");
				return 79;
			}

		};
		//Interface object calling and using it is anonymousClass way...
		s1.attend();
		s1.getMarks();




		/////////////////////////////////////////////
		//I have one abstract class it has 2 method one implement (show method) and two unimplemented (print method) 
		//but i don't want to implement the unimplemented method(print method) 
		//these one implemented (show method) i want to use in my code


		// place the unimplemented method in anonymous class, you can use implemented by creation of object for abstractClass

		//File naming of java file
		//OuterclassName$Number.class
		//anonymous class does'nt have any Name 
		//so that file name abstract class indicate by number
		////////////////////////////////////////////




		//class8 object calling and using it is traditional way...
		class8 c8 = new class8();
		c8.attend();
		c8.getMarks();

	}

}

//we have one option is convert interface to class by using implements then we can create object for class and use it...
//type tradition way...

class class8 implements Student{

	@Override
	public void attend() {
		System.out.println("Attendence is called");
	}

	@Override
	public int getMarks() {
		System.out.println("GetMarks is called");
		return 79;
	}

}


///////////
//Remember/
///////////

/*
 * limited use whatever the method you want inside 
 * class, abstractClass,Interface
 * for limited use then we create it with anonymous class
 */


/*
 * Widely use whatever the method you want inside 
 * class, abstractClass, interface 
 * for widely use then we create it with fully implementation class
 */


/* important understanding
 * class without name is called anonymous class 
 * object without reference variable is called anonymous object 
 * function without methodOrFunction name is called anonymous function
 * 
 */

//anonymous class can't access any additional access modifier's

//anonymous is a beautiful features but when we combined with lambda expression its a powerful features......