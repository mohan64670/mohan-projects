package bluewolfAssigment1;

import java.util.HashSet;
import java.util.Set;

public class FinddupMore {

	public static Integer finddup(int[] array){
	
		Set<Integer> set = new HashSet<Integer>();
			for(Integer arrayele: array){
				if(!set.add(arrayele)){
					return arrayele+1;
				}
			}
			throw new RuntimeException("didn't find any repeated integer"); 
	}
	
	public static void main(String[] args) {
		int[] dup = new int[]{6,5,9,8,2,3,4,6,9,7};
		int redup = finddup(dup);
		System.out.println("Duplicate elements in array is " +redup);
	}
		

}

	


