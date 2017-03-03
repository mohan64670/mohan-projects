
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovDupArray {
	public static  void main(String[] args) {
	
	Integer[] array = new Integer[]{1,2,3,3,4,4,1,2,5,6,7,8,9};
   Set<Integer> removedup = new LinkedHashSet<Integer>(Arrays.asList(array));
   int[] output = new int[removedup.size()];
   int index = 0;
   for( Integer i : removedup ){
	   output[index++] = i;
   }
   System.out.println(Arrays.toString(output));
	}
}
