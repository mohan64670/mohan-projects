import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<Integer>();
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(6);
		num.add(5);
		num.add(9);
		num.add(10);
		num.add(3);
		System.out.println("list of numbers in list " +num);
		int i = 0;
		int j = num.size()-1;
		while (i < j) {
		    int temp = num.get(i);
		    num.set( i, num.get(j));
		    num.set( j, temp);
		    i++; j--;
		}
		System.out.println("list of numbers in list " +num);

	}

}
