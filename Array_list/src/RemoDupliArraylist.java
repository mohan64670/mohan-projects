import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoDupliArraylist {
public static void main(String[] args){
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
	
	Set<Integer> afterrem = new LinkedHashSet<Integer>(num);
	num.clear();
	num.addAll(afterrem);
	System.out.println("list of number after removing duplicates " +num);
	
	}

}
