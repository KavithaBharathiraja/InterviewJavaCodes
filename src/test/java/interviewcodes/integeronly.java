package interviewcodes;

public class integeronly {

	public static void main(String[] args) {
	
			String str = "abc123";
			System.out.println(getNumbers(str));
	 
		}
		public static String getNumbers(String str) {
			
			int start = 0;
			
			for(int i =0; i < str.length();i++) {
				
				if(Character.isDigit(str.charAt(i))) 
				{
					start = i;
					break;
					
				}
			}
			
			return str.substring(start);
		}
		
	}


