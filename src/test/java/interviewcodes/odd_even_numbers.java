package interviewcodes;

public class odd_even_numbers {

	public static void main(String[] args) {
		
		int []array = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Odd Numbers");
		
		for(int i =0; i< array.length; i++) {
			
			if(array[i]%2 != 0) {
				
				System.out.println(array[i]);
			}
		}
		
		System.out.println();
		
		System.out.println("Even Numbers");
		
        for(int i =0; i< array.length; i++) {
			
			if(array[i]%2 == 0) {
				
				System.out.println(array[i]);
			}
			
		}
		

	}

}
