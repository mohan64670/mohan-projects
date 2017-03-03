

public class Solution {

	public static void main(String[] args) {
        String s1 = "myNameIsMohan";
         for (String w : s1.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
         System.out.println(w);
    }
}
}