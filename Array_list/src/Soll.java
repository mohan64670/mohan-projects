import java.util.HashSet;
import java.util.Set;

public class Soll {

	
		public static Set<Integer> findDuplicates(int[] input) { 
			Set<Integer> duplicates = new HashSet<Integer>(); 
			for (int i = 0; i < input.length; i++) { 
				for (int j = 1; j < input.length; j++) { 
					if (input[i] == input[j] && i != j) { // duplicate element found 
						duplicates.add(input[i]); 
						break; 
						} 
					} 
				} 
			return duplicates; 
			}
				
		 public static void main(String[] args) {
			
	         int[] dup = new int[]{1,2,2,3,4,5,6,99,99};
			 Set<Integer> duplicates = findDuplicates(dup);
			 for(Integer i:duplicates){
				 System.out.println("Duplicate elements in array is "+ i);
			 }
			
		}
	}

			  
		    
		 
		   
	


