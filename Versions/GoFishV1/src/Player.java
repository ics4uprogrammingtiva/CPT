import java.util.ArrayList;

public class Player {

	ArrayList <Card> hand = new ArrayList <>();
	int points;
	
	
	
	// Randomly select a card from computer's hand
	public Card SelectARandomCardToAskFor (int computerHandSize)
	{
		int handSize = computerHandSize;
		int randomNumber = (int) ((Math.random()*handSize) - 0);

		Card computerAskCard = hand.get(randomNumber);
		
		//hand.remove(randomNumber);
		
		return (computerAskCard);
	}
	
	

}
