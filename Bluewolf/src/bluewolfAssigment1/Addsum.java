package bluewolfAssigment1;

import java.util.Arrays;

public class Addsum {
	static void getMin(int[] arr){
		 for(int i=0;i<arr.length;i++){
	            boolean isDistinct = false;
	            for(int j=0;j<i;j++){
	                if(arr[i] == arr[j]){
	                    isDistinct = true;
	                    break;
	                }
	            }
	            if(!isDistinct){
	                System.out.print(Arrays.toString(arr)); //arr[i]+" "
	            }
	        }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,2,7,2,4,7,8,2,3};
        Addsum.getMin(nums);
		
	}

}
