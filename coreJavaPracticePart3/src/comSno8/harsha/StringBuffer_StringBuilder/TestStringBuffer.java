package comSno8.harsha.StringBuffer_StringBuilder;

public class TestStringBuffer {
	//Strings back end is completely different?
	//when you want to updating data in one of variable, it is allocated to different address location and new String is creating....
	/*
	 *Inside same address data or value change is called Mutable
	 *Inside same address not changing data or value and its creating NewStringWithNewAddress is called Immutable
	 *
	 */
	
//Java come-up with a Mutability String called StringBuffer and StringBuilder

	/*
	 * If any manipulation did on String is not a correct option
	 * if any manipulation were performed here every manipulation has new String were created in backend
	 * 
	 * To face or tackill these problem in backEnd java introduced a StringBuffer and StringBuilder
	 * 
	 * it's being out the concept mutability
	 * only data change no change in address location when you manipulate on String
	 * 
	 * It bring out with the name of StringBuffer & StringBuilder to manipulate...
	 * 
	 * why 2 Mutable String? 
	 * 
	 * StringBuffer  -> for MultiThreaded environment
	 * StringBuilder -> for SingleThreaded environment
	 * 
	 * To avoid race condition java were created two string
	 * Two String are class so it's a non primitive data type 
	 * 
	 */




	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("yadagiri");
		StringBuffer sb2 = new StringBuffer("yadagiri");
		System.out.println(sb1 == sb2);

		sb1 = sb1.append("Reddy");
		System.out.println(sb1 == sb2);

		StringBuffer sb3 = new StringBuffer("yadagiriReddy");
		System.out.println(sb1 == sb3);


	}

}

