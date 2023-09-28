
package comSno4.harsha.LambdaExpression;

public class FunctionalInterfaceImplementationUsingAnonymousClass {
	public static void main(String[] args) {
		Car c4 = new Car() {
			@Override
			public void drive(int speed, String model) {
				System.out.println("Driving " + model);
				System.out.println("Car is driving very smoothly at speed " + speed);

				if(speed>100)
					System.out.println("fast driving");
				else
					System.out.println("slow driving");
			}

		};
		c4.drive(60, "Tata");
	}

}
