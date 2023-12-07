package interviewcodes;

public class Pops {

	public static void main(String[] args) {
		String s = "POPS";
		 
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
 
			for (int j = 0; j < s.length(); j++) {
				
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
 
			}
			//( if you want repitative char)
			//if(count > 1) {
			if (count == 1) {
				System.out.println("Print the Non Repitive char : " + s.charAt(i));
				break;
			}
 
		}
	}
	}


