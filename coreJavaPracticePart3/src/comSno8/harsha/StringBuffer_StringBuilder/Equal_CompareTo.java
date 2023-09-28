package comSno8.harsha.StringBuffer_StringBuilder;

public class Equal_CompareTo {
	
	/*
	 * tonda 
	 ******************************
	 *
	 * is not possible for adding red, green, blue, yellow if address is 10 for tonda
	 * 
	 * tonda is in white i want tonda in red color 
	 * it is not possible to bring in address 10
	 * [ data change = address change]
	 * 
	 * Oosarivilli --> Stored color
	 * (variable)  --> data or value
	 *********************************
	 *
	 *if we add new color then Oosarivilli be a Oosarivelli
	 *no change init variable be variable (StringBuffer & StringBuilder)
	 *
	 *if address is 10 for Oosarivelli 
	 *if you add blue, green, yellow
	 *it address always 10
	 *
	 */

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		System.out.println(sb1.compareTo(sb2)); //DataCompare
		System.out.println(sb1.equals(sb2)); //addressCompare
		/*
		 * Important
		 ************
	 *1.JAVAVERSION
		 *String & StringBuffer is released in 1.0 version
		 *but StringBuffer has some problem init, like performance related problems
		 *
		 *By StringBuffer in String Threaded environment for mutability & performance degrade problem occurs
		 *so that StringBuilder is released in 1.5 version.
		 *
	*2.STORAGEAREA
		 *Sting are stored in StringConstantPool that is indirectly stored in heap memory but String has separate area.
		 *For StringBuffer & StringBuilder we create object so for these heap area for storage
		 *
	 *3.MUTABILITY
		 *String is immutable StringBuffer & StringBuilder are Mutable
		 * lemodification String
		 *
	 *4.THREAD SAFE
		 *String has ThreadSafe i.e multiple thread can access String by default immutable are ThreadSafe
		 *
		 *ThreadSafe mean?
		 *
		 *data can't be change in particular address location
		 *
		 *if you want change data then you go for new address location
		 *
		 *for example (address 10)
		 *
		 *At any given of time only one thread will operate OnIt
		 *use String in MultiThreaded environment
		 *
		 *some exStream condition like race over may possible
		 *that time you need to create synchronized KW explicitly
		 *
		 *StringBuffer is also ThreadSafe
		 *StringBuilder is not a ThreadSafe
	 *5. SYNCHRONIZED
	     *
	     *NO implicitly Synchronized in String
	     *YES implicitly Synchronized in StringBuffer
	     *NO implicitly Synchronized in StringBuilder
	     *
	 *6. PERFORMANCE
	     *String has lower or Slower performance
	     *because everyTime 
	     *when you change it create a new string so that it slower performance
	     *
	     *StringMemory --> waste, reuse
	     *
	     *Two String are create with same data -> it is optimized memory
	     *When you manipulated memory gonna waste
	     *
	     *StringBuffer is faster 
	     *StringBuilder is SuperFaster..............
	     *
	  *7 CAPACITY
	     * 
	     * NO concept (not applicable ) in String because we store address init
	     * 
	     * StringBuffer & StringBuilder has default capacity is 16
	     * 
	  *8 BestSuited for 
	     *If not having modification are less or no modifications
	     *then use String -> it automatically it increase performance
	     *
	     *If modification have more in multiThreaded use Buffer
	     *If modification have more in SingleThreaded use Builder
	     *
	   *9 Additional method
	     * String
	     * --> Concat, Equal & EqualsIgnoreCase
	     * StrinBuffer & Builder
	     * --> Reverse, Append, Deleton, Insertion & Comparision
		 */
	}

}
