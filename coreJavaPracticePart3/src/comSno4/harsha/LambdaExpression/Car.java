package comSno4.harsha.LambdaExpression;

//FunctionalInterface ==> Any interface which has only SingleAbstractMethod & UnlimitedNonAbstractMethod is called FunctionalInterface
//FunctionalInterface is introduced because to work with lambda expression & functional Programming..
//for example all FunctionalInterface are showed in Package java.util.function
//FunctionalInterface must be annotate with @
@FunctionalInterface
public interface Car {
	//before java 1.8 only abstract method
	void drive(int speed, String model); //SingleAbstractMethodInterface
	
	
    //////////////////////////////////////////////////////////////////
	//After java 1.8 both abstract method & non-abstract method
	
	//non abstract method they are
	//default,private,static
	
	//Only one abstract method & unlimited Or N numbers of non abstract methods can use inside FunctionalInterface
	
	default void honk() {
		
	}
	
	private void light() {
		
	}
	
	static void breaks() {
		
	}
	//////////////////////////////////////////////////////////////////
}
