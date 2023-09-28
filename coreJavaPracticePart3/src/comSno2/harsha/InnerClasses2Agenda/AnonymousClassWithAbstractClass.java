package comSno2.harsha.InnerClasses2Agenda;
//class have only implemented method so that we can create object for it...
//Abstract class have implement(non abstract) & unimplemented(abstract) method are present so that we can't create object for it


//But coming to Anonymous class with abstract class
//abstract class will also create a object by implement the unimplemented methods inside the anonymous class block area
public class AnonymousClassWithAbstractClass {

	public static void main(String[] args) {
		
		//we have other option in-order to convert AbstractClass to class, you go for Anonymous class
		//type Anonymous class way...
		AbstractClass ac = new AbstractClass() {
			public void print(){
				//I have one abstract class it has 2 method one implement (show method) and two unimplemented (print method) 
				//but i don't want to implement the unimplemented method(print method) 
				//these one implemented (show method) i want to use in my code
				
				
				// place the unimplemented method in anonymous class, you can use implemented by creation of object for abstractClass
				
				//File naming of java file
				//OuterclassName$Number.class
				//anonymous class does'nt have any Name 
				//so that file name abstract class indicate by number
			}
		};
		
		
		//AbstractClass object creation and using it is anonymous class way...
		ac.show();
		
		
		
		//class1 object calling and using it is traditional way...
		class1 c1 = new class1();
		c1.show();
		
	}
	
	

}

//we have one option is convert Abstract class to class by using extends then we can create object for class and use it...
//type tradition way...
class class1 extends AbstractClass{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
