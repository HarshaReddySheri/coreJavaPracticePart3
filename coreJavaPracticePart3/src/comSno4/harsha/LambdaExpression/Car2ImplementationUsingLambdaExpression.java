package comSno4.harsha.LambdaExpression;

		/*Lambda expression with parameter?
		 * 
	     * single parameter no need of round bracket's
	     * Multiple parameter is need round bracket's
	     * if no parameters round brackets are mandatory
	     * 
	     * lambda expression with statementsInsideFunctionalBody?
	     * single statements no need of curly bracket
	     * multiple statements is need curly bracket
	     */
public class Car2ImplementationUsingLambdaExpression {

	public static void main(String[] args) {
		//soft code
		
		/* when we are working anything inside functional body
		 *  must specify return type 
		 *  
		 *  */
		
		Car2 c2 = () -> {
			int speed = 102;
			System.out.println("Driving tata");
			System.out.println("Cart is driving very smoothly at speed " + speed);
			if(speed>100) 
				System.out.println("speed driving");
			else 
				System.out.println("slow driving");
			return speed;
		};
		System.out.println(c2.getSpeed());
		
		
		
		
		
		
		
		//hard code
		/* when we are not working anything inside functional body
		 * no return type is specify 
		 *  
		 *  */
		Car2 c3 = () -> 102;
		System.out.println(c3  .getSpeed());
		
	}
	
	

}
