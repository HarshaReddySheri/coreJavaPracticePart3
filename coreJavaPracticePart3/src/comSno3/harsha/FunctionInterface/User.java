package comSno3.harsha.FunctionInterface;


//Create one User class then implementation their Own brand in-it By using anonymousClass
public class User {
	public static void main(String[] args) {
		Car c = new  Car() {
			public void drive() {
				
				System.out.println("using AnonymousClass Way");
				System.out.println();
				
				System.out.println("Audi Drive is Called");
				System.out.println("BWM Drive is Called");
				System.out.println("TATA Drive is Called");
				System.out.println("INNOVA Drive is Called");

			}
		};

		c.drive();
		
		System.out.println();
		System.out.println("using Traditional Way");
		System.out.println();

		//Creating Object for every different Brand class is tough job
		Audi a = new User().new Audi();
		a.drive();
		BWM b = new User().new BWM();
		b.drive();
		TATA T = new User().new TATA();
		T.drive();

	}

	/*
	 * For only one implementation is not a better ideas to create Another class like this
	 * 
	 * will you want to create Another class for different brand like
	 * Audi, BMW, TATA, INNOVA
	 */

public class Audi implements Car{ //The public type Audi must be defined in its own file  because for clarity i placed Audi file here

	@Override
	public void drive() {
		System.out.println("Audi Drive is Called");

	}

}

public class BWM implements Car{ //The public type BWM must be defined in its own file  because for clarity i placed BWM file here

	@Override
	public void drive() {
		System.out.println("BWM Drive is Called");

	}
}
public class TATA implements Car{ //The public type TATA must be defined in its own file  because for clarity i placed TATA file here

	@Override
	public void drive() {
		System.out.println("TATA Drive is Called");

	}

}

}





