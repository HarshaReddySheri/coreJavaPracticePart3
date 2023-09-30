package comSno1.harsha.InnerClasses1Agenda;

public class OuterClassVariablesDuplicatedInInnerClass {
	public int id = 101;//OuterClassInstanceVariable
	public static void main(String[] args) {
		System.out.println("In Main Method: OuterClassVariablesDuplicatedInInnerClass ");
		
		TestClass4 tc4 = new OuterClassVariablesDuplicatedInInnerClass().new TestClass4();//NestedNonStaticInnerClassObjectCreation
		tc4.show();
		
		TestClass5 tc5 = new OuterClassVariablesDuplicatedInInnerClass().new TestClass5(); //NestedNonStaticInnerClassObjectCreation
		System.out.println(tc5.getEmployeeID());
		tc5.calculateSalary();
		
		TestClass7 tc7 = new OuterClassVariablesDuplicatedInInnerClass.TestClass7(); //NestedStaticInnerClassObjectCreation
		tc7.def();
		
		
		
		
		
	}
	 
	public class TestClass4 extends Agenda4Student{ //can any InnerClass extend any non-abstract class and an abstract class? Yes Yes
		private int id = 102;//InnerClassInstanceVariable
		public void show() {
			int id = 103;//InnerClassLocalVariable
			System.out.println(id);//calling InnerClassLocalVariable
			System.out.println(this.id);//calling InnerClassInstanceVariable
			System.out.println(OuterClassVariablesDuplicatedInInnerClass.this.id);//calling OuterClassInstanceVariable
			System.out.println(getMarks()); //calling non-abstractClass OR extends from Agenda4Student
			giveExam();//calling abstractClass OR extends an abstractClass
		}
		
		public void giveExam() { //implementing abstractClass
			System.out.println("exam given");
			
		}
		
		
	}
	
	
	/*
	 * Agenda-4
	 * ********
	 * 
	 * 1. Can an InnerClass extends any non-abstract class?
	 * Ans: yes it can extend any non-abstract class & we can call non-abstract method inside InnerClass
	 * 
	 * 2. Can an InnerClass extends any abstract class?
	 * Ans:  yes it can extend any abstract class & abstract mean it as (abstract & non-abstract method) we can do unimplemented method to implemented method inside InnerClass
	 * 
	 * 3. Can an InnerClass implement any interface?
	 * Ans: yes it can implement an interface  & we can do unimplemented method to implemented method inside Inner Class.
	 * 
	 * 4. Can we extend any InnerClass by another InnerClass?
	 * Ans: yes, we can extend any InnerClass by another InnerClass inside same OuterClass
	 * 
	 * 5. Can we call innerClasses Outside the OuterClass?
	 * Ans: yes, we can call innerClass outside the outerClass by using objection creation and access it. 
	 */
	
	public class TestClass5 implements Agenda4Employee{ //can we extend any innerClass by another InnerClass? Yes
		private int id = 102;
		public void show() {
			
		}
		@Override
		public int getEmployeeID() {
			return id;
		}

		@Override
		public void calculateSalary() {
			System.out.println("Salary is 1Lakh");
			
		}
		
	}
	public class TestClass6 extends TestClass5{//can we extend any InnerClass by Anothor InnerClass?  Yes
		public void abc(){
			show();
		}
	}
	
	public static class TestClass7 {
		public void def() {
			System.out.println("def");
		}
	}
}
 