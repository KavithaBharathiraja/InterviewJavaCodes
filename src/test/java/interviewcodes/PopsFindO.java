package interviewcodes;

public class PopsFindO {
	
	/*program to find first non repeatable character in a string 
	ex: String s="pops" 
	output is "o" */

	public static void main(String[] args) {
		
		String S = "ppops";
		
		//int count = 0;
		
		for(int i=0; i<S.length(); i++) {
			
			int count = 0;
			
		for(int j =0; j< S.length(); j++) {
			
			if(S.charAt(i)==S.charAt(j)) {
				
				count++;
			}
		}
			
		if(count==1) { //for repetive charactor
		//if(count > 1) {	
			System.out.println(" " +S.charAt(i));
			break;
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
