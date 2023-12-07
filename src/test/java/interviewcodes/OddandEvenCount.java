package interviewcodes;

public class OddandEvenCount {

	public static void main(String[] args) {
	int Num = 1234;
	
	int evencount = 0;
	int oddcount = 0;
	
	while(Num>0) {
		
		int rem = Num %10;
		
		if(rem%2 == 0) {
			
			evencount++;
		}else {
			
			oddcount++;
		}
		
		Num = Num/10;
	}
  System.out.println("Number of Even Numbers: " + evencount);
  System.out.println("Number of Odd Numbers: " + oddcount);
  
	}

}
