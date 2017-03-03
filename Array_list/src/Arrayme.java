
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arrayme {
	public static void removedup(String input){
		char[] ch = input.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : ch) {
		    charSet.add(c);
		} 
		
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
     	System.out.println(sb.toString());
		
	}
	public static void main(String[] args) {
		removedup("fgdfhgdfffffgjjjj");
		

	}
}

