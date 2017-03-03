package bluewolfAssignment3;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck52 {
	static void shuffleArray(int[] ar)
	  {
	    // If running on Java 6 or older, use `new Random()` on RHS here
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }
	 public static void main(String args[])
	  {
		 int[] deck = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
					20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
					41,42,43,44,45,46,47,48,49,50,51,52};
		 int arrLen = deck.length;
			if(arrLen != 52)
			{
				String improperDeckMessage ="Not a standard Deck!";
				IllegalArgumentException improperDeck = 
						new IllegalArgumentException(improperDeckMessage);
				throw improperDeck;
			}
		 shuffleArray(deck);
		 System.out.println("after shuffle: "+Arrays.toString(deck));
		
	  }

}
