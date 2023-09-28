package comSno4.harsha.LambdaExpression;


public class FunctionalInterfaceImplementationUsingTraditionalMethod implements Car{
	
	public static void main(String[] args) {
		 FunctionalInterfaceImplementationUsingTraditionalMethod tm = new FunctionalInterfaceImplementationUsingTraditionalMethod();
		 tm.drive(160, "Tata");
	}

	@Override
	public void drive(int speed, String model) {
		System.out.println("Driving " + model);
		System.out.println("Car is driving very smoothly at speed " + speed);
		
		if(speed>100)
			System.out.println("fast driving");
		else
			System.out.println("slow driving");
		
	}

	
}
