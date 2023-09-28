package comSno1.harsha.InnerClasses1Agenda;

public class Agenda3ObjectCreation {
	private int id = 101;
	public static void main(String[] args) {
		System.out.println("In main method: Agenda3ObjectCreation");
		
		//TestClass4 is not a Root Level of Agenda3ObjectCreation.
		//Inorder to Object creation of innerclass inside Main method can be done by usingOrCreation instanceOfmainClass.     
		TestClass4 tc4 = new Agenda3ObjectCreation().new TestClass4(); 
		//OR
		Agenda3ObjectCreation A3OC = new Agenda3ObjectCreation();
		TestClass4 tc = A3OC.new TestClass4();
		
		tc4.show();
		tc.show();
		
	}
	public class TestClass4{
		public TestClass4() {
			
		}
		public void show() {
			System.out.println(id);
		}
		//object creation 
		//No restruction of object creation of Inner class with in the Inner class
		//We can Keep object innerClass inside method 
		public void add() {
			TestClass4 tc4 = new TestClass4();
		}
	}
	
}
