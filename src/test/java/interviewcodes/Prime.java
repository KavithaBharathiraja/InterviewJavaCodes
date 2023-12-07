package interviewcodes;

public class Prime {

	
		/*This method checks if a given number is prime. 
		 * A prime number is a number that is greater than 1 
		 * and is not divisible by any other number 
		 * except 1 and itself.
		 */
		private static boolean isprime(int number) {
			
			if(number<=1) {
				
				return false;
				
			}
			
				
		    for (int i = 2;i < number; i++) {
		    	
		      if (number % i == 0) {
		    	  
		        return false;
		      }
		    }
		   
		    return true;
		  }
		

		
		public static void main(String[] args) {
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		    System.out.println("Prime numbers:");
		    
		    for (int i = 0; i < array.length; i++) {
		    	
		      if (isprime(array[i])) 
		      {
		        System.out.println(array[i]);
		      }
		    }
			
		}

	}


