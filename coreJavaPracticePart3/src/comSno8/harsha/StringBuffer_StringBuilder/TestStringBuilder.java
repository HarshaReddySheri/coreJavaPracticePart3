package comSno8.harsha.StringBuffer_StringBuilder;

/*
 * String available from 1.0 version
 * StringBuffer also available from 1.0 version
 * StringBuilder is available from 1.5 version
 * 
 * 
 * Only one Mutable String were introduced in beginning from multiThreaded environmental
 * By these we get some problems named as race condition
 * 
 * when you working under multiThreading environmental we used Synchronized KW but is degrade the performance
 * when we working in multiThreading performance of one thread will go on but remaining Threads were stop due to Synchronized
 * 
 * To improve the performance java comeUp with a new String named StringBuilder
 * When you want to work on only SingleThreadEnvironment use it
 * 
 * StringBuffer --> low performance due to multiThreaded & Synchronized Method
 * StringBuilder --> High performance due to SingleThreaded & no Synchronized method
 * 
 * StringBuffer & StringBuilder are not a literal because you can't assign directly like
 * StringBuffer sb = "hello" They are Simply classes
 * 
 * Actually StringBuffer & StringBuilder are exactly same but usage is different (synchronized & other one is  not Synchronized)
 * 
 * Both are twin --> (one has mole & other one is no mole)
 * 
 * Manipulation
 * ************
 * 
 * Addition(last,mid, first) 
 * Deletion
 * Updation
 * are done by StringBuilder & StringBuffer but not with String
 * 
 */
public class TestStringBuilder {


	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("yadagiri");//24
		StringBuilder sb2 = new StringBuilder("yadagiri");//37
		System.out.println(sb1 == sb2);//false

		sb1 = sb1.append("Reddy");//24
		System.out.println(sb1 == sb2);//false

		StringBuilder sb3 = new StringBuilder("yadagiriReddy");//57
		System.out.println(sb1 == sb3);//false
		System.out.println("Same address location here value is changed - proved that its Mutable");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Same address location here is no value is changed these go newStringWithDifferentLocation - proved that its Immutable");
		
		String s1 = "Yadagiri";//60
		String s2 = "Yadagiri";//60
		System.out.println(s1 == s2); //true
		s1 = s1 + "Reddy";// s1= YadagiriReddy //64
		System.out.println(s1 == s2); //false
		String s3 = "YadagiriReddy"; //74
		System.out.println(s1 == s3); //false
		
		
	}
}

/* 
 * StringBuffer & StringBuilder always confusion i.e, which is fast and which is slow ?
 * 
 * Here Tip I followed
 * for example 
 * To build are Building every Building were constructed by builder
 * If any project allowed to Builder -> He/She works very Faster & He wentOut because He is associated with high income
 * 
 * If He get's money He search for new project's
 * so that StringBuilder also faster
 * faster Proportional to NoMultiThreading Proportional to it's not a ThreadSafe
 * 
 * These are introduced lately
 * suitable for high performance
 * 
 * Builder doesn't care about quality only goal for fast..
 *  
 * 
 *  
 */


