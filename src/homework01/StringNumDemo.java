package homework01;

public class StringNumDemo {

	public static void main(String[] args) {

		String str = "·şÎ¢¶ËÔÆÈë¼ÓÓ­»¶|welcome join us";
		
		String [] array = str.split("\\|");
		
		StringBuilder builder = new StringBuilder(array[0]);
		builder.reverse();
		System.out.println(builder + array[1]);
		
		String region = "[a-zA-Z]";
		int index = 0 ;
		for(int i = 0 ; i < array[1].length() ; i++) {
			String a = String .valueOf(array[1].charAt(i));
			if(a.matches(region)) {
				index++;
			}
		}
		System.out.println("Total number of letter:" + index);
		
	}

}
