package comSno1.harsha.InnerClasses1Agenda;

import comSno1.harsha.InnerClasses1Agenda.OuterClassVariablesDuplicatedInInnerClass.TestClass4;

public abstract class Agenda4Student {
	public void takeAttendence() {
		System.out.println("takeAttendence called");
	}
	
	public int getMarks() {
		return 555; //non-abstractClass
	}
	
	public abstract void giveExam();//abstractClass
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {//can we call innerclass outside the outerclass? Yes 
		TestClass4 tc4 = new OuterClassVariablesDuplicatedInInnerClass().new TestClass4();
		tc4.show();
	}
}
