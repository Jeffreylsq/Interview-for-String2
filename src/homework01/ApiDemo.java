package homework01;
/**
 * ��һ���ַ���
 * @author pc
 *
 */



public class ApiDemo {

	public static void main(String[] args) {

		 String str = "����ѧjava��API������Ҫ����sshjd��ʲôii";
		 String region = "[a-zA-Z]";
		 boolean key = true;
		 for(int i = 0 ; i < str.length() ; i++) {
			 
			 char a = str.charAt(i);
			 String s = String.valueOf(a);
			 if(!s.matches(region)) {
				 if(!key) {
					 System.out.println();
				 }
				 System.out.print(s);
				 key = true;
				 
			 }
			 else if(s.matches(region))
			 {
				 if(key) {
					 System.out.println();
				 }
				 key = false;
				 System.out.print(s);
			 }
			 
		 }
		
				 
	}

}
