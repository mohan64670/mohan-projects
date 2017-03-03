package bluewolfAssignment3;

import java.util.Arrays;
import java.util.Random;

public class Deck {
	public static void shuffleCards(int[] deckOfCards)
	{
		int arrLen = deckOfCards.length;
		if(arrLen != 52)
		{
			String improperDeckMessage ="Not a standard Deck!";
			IllegalArgumentException improperDeck = 
					new IllegalArgumentException(improperDeckMessage);
			throw improperDeck;
		}
		Random randomGenerator = new Random();
		for(int cardCount = 0; cardCount < arrLen; cardCount++)
		{
			int randIndex = randomGenerator.nextInt(arrLen);
			swap(deckOfCards, cardCount, randIndex);
		}
		System.out.println("array list: "+ Arrays.toString(deckOfCards));
	}
	private static void swap(int[] arr, int indexToSwap, int randomIndex)
	{
		int arrLen = arr.length;
		if(indexToSwap >= arrLen || randomIndex >= arrLen)
		{
			IndexOutOfBoundsException ex = new IndexOutOfBoundsException();
			throw ex;
		}
		int tempVal = arr[indexToSwap];
		arr[indexToSwap] = arr[randomIndex];
		arr[randomIndex] = tempVal;
	
	}
	public static void main(String[] args) {
		int[] deck = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
				20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,51,52};
		shuffleCards(deck);
		
	}
	
}


