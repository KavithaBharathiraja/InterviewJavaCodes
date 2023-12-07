package interviewcodes;

public class Sum_pair_Value {

	public static void main(String[] args) {
		
			int[] arr = {1,2,4,3,5,0}; // out put (1,4),(2,3),(5,0)
			
			int n = arr.length;
			
			int sum =5;
			
			PairOfSum(arr,n,sum);
			
		 
			}
			public static void PairOfSum(int arr[],int n, int sum) {
				
				for(int i =0; i <= n; i++) {
					
					for(int j = i+1; j < n; j++) {
						
						if(arr[i] + arr[j] == sum)
							
							 System.out.println("(" + arr[i] + ", "+ arr[j] + ")");
		                             
					}
				}
			}
	}
