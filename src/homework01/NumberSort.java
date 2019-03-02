package homework01;

import java.util.Arrays;

public class NumberSort {

	public static void main(String[] args) {

		String str = "shsdkjk2879sjd51a3b4";
		String region = "[0-9]";
		
		StringBuilder builder = new StringBuilder();
		
	    for(int i = 0 ; i < str.length() ;i++) {
	    	
	    	char a = str.charAt(i);
	    	String s = String.valueOf(a);
	    	if(s.matches(region)) {
	    		builder.append(s);
	    	}
	    }
	    char [] array = builder.toString().toCharArray();
	    Arrays.sort(array);
		System.out.println(array);
		
	}

}
