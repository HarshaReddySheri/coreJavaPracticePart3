package comSno1.harsha.InnerClasses1Agenda;



//for this Program every thing is called in circular
public class SameOuterClass {

	private int id = 101;
	public static void main(String[] args) {
		System.out.println("In main method: SameOuterClass");

		TestClass5 tc5 = new SameOuterClass().new TestClass5(); 
		tc5.sub();
		

	}
	
	//Nested Non-Static Inner Class
	public class TestClass4{
		public TestClass4() {

		}
		public void show() {
			System.out.println(id);
		}
		//object creation 
		//No restruction of object creation of Inner class with in the Inner class
		//We can Keep object inside the method 
		public void add() {
			TestClass4 tc4 = new TestClass4();
		}
	}
	//Nested Non-Static Inner Class 
	public class TestClass5{
		public void sub() {
			//Connectivity is Good in SameOuterClass
			//different object can call in different inner class of same outer class by these way......
			TestClass4 tc4 = new TestClass4();
			tc4.show();
			
		}
	}


}



