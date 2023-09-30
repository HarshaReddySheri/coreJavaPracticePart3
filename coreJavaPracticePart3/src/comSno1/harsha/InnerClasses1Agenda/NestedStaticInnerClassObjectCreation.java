package comSno1.harsha.InnerClasses1Agenda;

import comSno1.harsha.InnerClasses1Agenda.OuterClassVariablesDuplicatedInInnerClass.TestClass7;

public class NestedStaticInnerClassObjectCreation {

	public static void main(String[] args) {
		TestClass7 tc7 = new OuterClassVariablesDuplicatedInInnerClass.TestClass7(); //NestedStaticInnerClassObjectCreation
		tc7.def();
		//Here we don't use new KW, so we don't need object creation for static
	}
	
	/*
	 * let make a difference of object creation between static & non static
	 * 
	 * NON-Static
	 * ***********
	 * TestClass5 tc5 = new TestClass1.new TestClass5();
	 *  //Here we do use new KW, so we do need object creation for static
	 *
	 * Static
	 * ******
	 * TestClass5 tc5 = new TestClass1.TestClass5();
	 *  //Here we don't use new KW, so we don't need object creation for static
	 */
}
