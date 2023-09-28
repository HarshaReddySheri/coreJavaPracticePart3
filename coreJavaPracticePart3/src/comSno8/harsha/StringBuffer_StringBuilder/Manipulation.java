package comSno8.harsha.StringBuffer_StringBuilder;

public class Manipulation {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		/*
		 * System.out.println(sb.insert(0, "Reddy")); 
		 * System.out.println(sb.insert(4,"Reddy")); 
		 * System.out.println(sb.deleteCharAt(0));
		 * System.out.println(sb.delete(0, 3));
		 * System.out.println(sb.reverse());
		 * 
		 */
		
		sb.ensureCapacity(100); 
		
		System.out.println(sb.capacity()); 
		
		//System.out.println(sb);
		
		
	}

}
