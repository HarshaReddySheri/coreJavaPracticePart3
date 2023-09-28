package comSno8.harsha.StringBuffer_StringBuilder;

/*Java String concept is available //Inside same address the value or data is not updating or changing so it is Immutable  
*why we need StringBuffer & StringBuilder
*
*String is dataType & literal
*
*Class is Non primitive dataType
*
*String is also a Class so it's called dataType
*
*To Store TextValue we use String
*

*changing behavior -> Mutable
*no changing behavior -> Immutable

*for example
*Tonda -> String -> No changing body color
*Oosaravelli -> StringBuffer and StringBuilder -> changing body color

*One Variable (one body) -> data change (color changes) -> in StringBuffer & StringBuilder (Oosaravelli)
*
* 
*/
 
public class TestString {

	public static void main(String[] args) {
		
		//here Only Addresses are compared (==) 
		
		String s1 = "Yadagiri";
												
		String s2 = "Yadagiri";
		//Here Before Updating String Value & addresses is equal
		System.out.println(s1 == s2); //true
		
		s1 = s1 + "Reddy";// s1= YadagiriReddy
		/*
		 * Here After Updating String Value & addresses is not equal 
		 * variable i have taken if String has mutability if their is change of chancing the data ?
		 * s1 & s2 must be equal or same address but here not equal or not a same address
		 * String is declared as Immutable
		 * 
		 * OR
		 * 
		 * Here different variable with same text data has same address location
		 * when you want to updating data in one of variable, it is allocated to different address location
		 * 
 //which mean only changing data or value in one of the variable behavior is not their for String
 //so that String is declared as Immutable
 //Inside same address the value or data is not updating or changing so it is Immutable  
		 *  
		 * s1==s2 get False After updating
		 * 
		 * whenever operation you have do on s1 & s2 address of s1 & s2 must be equal but here the address are changing
		 * == [it deals with address]
		 * .equal [it deals with content comparison]
		 * 
		 * 
		 */
		
		System.out.println(s1 == s2); //false
		
		//we noticed that when two different string variable has same value is stored 
		//then its address is same
		//when the string variable value is change then its addresses also change
		
		
		String s3 = "YadagiriReddy";
		
		System.out.println(s1 == s3); //false
	}

}

//If you want to understand in Memory Point of view watch the string video


