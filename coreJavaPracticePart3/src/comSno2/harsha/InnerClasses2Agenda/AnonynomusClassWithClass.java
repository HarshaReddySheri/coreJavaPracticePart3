package comSno2.harsha.InnerClasses2Agenda;

//At what situation Anonymous class are needed ?
//creation of another class and anonymous class is completely same But here Creating with other class makes confusion so that we go for anonymous class.....

public class AnonynomusClassWithClass {
	
	private int id =100;
	public static void main(String[] args) {
		
		//if we want to updated the print method instead of creating another class better to go with Anonymous  class
		class0 c0 = new class0(){
			public void print() {
				System.out.println("updated print method is called");
			}
		};
		
		c0.show();
		c0.print();
		
		
		
		//another class Object creation
		class2 c2 = new class2();
		c2.show();
		c2.print();
	}

}
class class0{
	public void show() {
		System.out.println("show method is called");
	}
	public void print() {
		System.out.println("print method is called");
	}
}


class class2 extends class0{
	public void print() {
		System.out.println("updated print method is called");
	}
}