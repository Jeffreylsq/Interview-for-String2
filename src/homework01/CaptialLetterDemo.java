package homework01;

public class CaptialLetterDemo{

	public static void main(String[] args) {
		
           
		
		String str = "every night in my dreams, i see you , i feel you. that is how I know you go on.";
		
		StringBuilder builder = new StringBuilder();
		String region = "[\\.]";
		String [] array = str.split(region);
		for(int i = 0 ; i < array.length ; i++) {
			char a = 0;
			String c = "";
			String s = array[i];
			if(i == 0)
			{
				a = Character.toUpperCase(s.charAt(0));
				c = s.substring(1);
			}else {
				a = Character.toUpperCase(s.charAt(1));
				c = s.substring(2);
			}
			
			builder.append((a + c) + " . ");
			
		}
		
		System.out.println(builder);

		
	}

}
