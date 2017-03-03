package bluewolfAssignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollect {
	
	public static void shuffle(Integer[] arr){
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		for (int i = 1; i <= 52; i++) {
		    list.add(i);
		}
		Collections.shuffle(list);
		Integer[] output = list.toArray(new Integer[list.size()]);
		System.out.println("shuffled Deck list: " +Arrays.toString(output));
	}

	public static void main(String[] args) {
		
		Integer[] deck = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
				20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,51,52};
		int length = deck.length;
		if(length != 52)
		{
			String msg ="please mention the correct deck size!";
			IllegalArgumentException improperDeck = new IllegalArgumentException(msg);
			throw improperDeck;
			}
		shuffle(deck);

	}
}
