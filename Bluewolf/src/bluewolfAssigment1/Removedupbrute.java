package bluewolfAssigment1;

public class Removedupbrute {
	public static void main(String[] args) {
		int[] num = new int[]{1,2,3,2,5,6,8,9,7,5,100};
		System.out.println("Finding duplicate elements in array using brute force method"); 
		int count = 0;
		for (int i = 0; i < num.length; i++) { 
			for (int j = i + 1; j < num.length; j++) { 
				if (num[i]==(num[j]) ) { 
					System.out.println(num[i]);
				} 
			} 
			count++;
			
		}
		System.out.println("iterations: "+count);
	}


}

