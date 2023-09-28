package comSno4.harsha.LambdaExpression;

//FunctionalInteface is introduced because to work with lambda expression & Functional Programming
//functionalInterface introduced in 1.8 java version
//lots of extremely powerful features are released in 1.8 java version 
//they are 
//lambda expression, I/O Stream, Functional Programming

/*
 * lambda has Strong intuition(lambda know every thing and lambda can find every thing)
 *  
 * let's take an example
 * 
 * One Light -> One abstract method(unimplemented method)
 * One room -> Functional interface 
 * One Person -> lambda expression 
 * 
 * whenever a person is instructed to turnOff the light in the room 
 * without confusion the person is directly turnOff the light 
 * because in that room only one light is present
 */
public class FunctionalInterfaceImplementationUsingLambdaExpression {
	public static void main(String[] args) {
		/*
		 * only for functional Interface the lambda expression is introduced but but we
		 * have a added advantage AnonymousFunction are created by using lambda lambda
		 * is a way of reducing number of Code line or Simplify of code is called Lambda
		 * Expression
		 */
		//lambda expression with anonymous function
		//lambda = reference variable of interface + anonymous function + arrow token + function body + semi-colon at end
		//syntax lambda expression has 3 Components: argument list(),arrow token ->, function body{}
		
		Car c2 = (speed, model) -> {
			//function without function Or method name is called anonymous function
			//convert anonymous class to anonymous function by using lambda expression
			
			/*
			 * 
			 * Steps to convert anonymous class to lambda expression for simple understanding
			 *  
			 * 1.remove Interface Instance & remove Method Or function name
			 * 
			 * 2.place a lambda expression treat it as a special identifier or operation (arrow token)
			 * b/w ReferenceVarableOfInterface followed by anonymous function or
			 * round bracket ()symbol then function body 
			 * 
			 * 3. after completion of curly bracket of lambda expression must be ends with semi-colon
			 */
			System.out.println("Driving " + model);
			System.out.println("Car is driving very smoothly at speed " + speed);
			
		};
		
		c2.drive(100, "Audi");
		
		
		Car c3 = (speed, model) -> {
			
			/*
			 * Lambda is simplified version of all up-to now but not in detailed
			 * lambda know every thing  and lambda can find every thing
			 * 
			 * we can work any thing inside the functional body like
			 * if else condition
			 * variable declaration
			 * 
			 * or 
			 * 
			 * whatever we do inside a method you can do it inside anonymous function or method
			 * 
			 * 
		     * for example without function name lambda can find function name
		     * you can declare a data type in a interface for abstract method parameter
		     * lambda can find it's data type of abstract method parameter(int speed)
		     * 
		     * 
		     * 
		     * 
			 */
			
			
			System.out.println("Driving " + model);
			System.out.println("Car is driving very smoothly at speed " + speed);
			
			if(speed>100)
				System.out.println("fast driving");
			else
				System.out.println("slow driving");
		};
		c3.drive(160, "BMW");
		
		
		
	}
}
