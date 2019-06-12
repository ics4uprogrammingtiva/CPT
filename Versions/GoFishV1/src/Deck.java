import java.util.ArrayList;
public class Deck {
	
	// Properties
	int numberOfCardsInDeck = 1;
	
	// To test out if I'm doing classes correctly
	int test = 5;
	
	/*
	// Broken stuff
	Card cardAH = new Card();
	cardAH.testCard = 5;
	//System.out.println(cardAH.suit);
	*/
	
	/*
	// Serious
	// Create deck
	ArrayList <Card> deck = new ArrayList <Card>();
	// Assign stuff 
	Card cardAH = new Card();
	//cardAH.testCard = 1;
	//cardAH.testCard = 3;
	/* 
	/*
	//DealCard
	// Must randomly generate a card and must return it to the player
	public dealCard (card) {
		
		Card cardAH = new Card(A.H);
		System.out.println(cardAH.suit);
		return AH
	}
	*/
	
	// Don't know what this does but my code doesn't work without it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create deck
		ArrayList <Card> deck = new ArrayList <Card>();
		// Assign all of the values to all 52 cards
		
		// First card template
		Card cardAH = new Card();
		cardAH.cardType = 'A';
		cardAH.suit = 'H';
		cardAH.image = "src/CardsVF/AH.JPG";
		// Add card to list
		deck.add(cardAH);
		
		Card cardAD = new Card();
		cardAD.cardType = 'A';
		cardAD.suit = 'D';
		cardAD.image = "src/CardsVF/AD.JPG";
		// Add card to list
		deck.add(cardAD);
		
		Card cardAS = new Card();
		cardAS.cardType = 'A';
		cardAS.suit = 'S';
		cardAS.image = "src/CardsVF/AS.JPG";
		// Add card to list
		deck.add(cardAS);
		
		Card cardAC = new Card();
		cardAC.cardType = 'A';
		cardAC.suit = 'C';
		cardAC.image = "src/CardsVF/AC.JPG";
		// Add card to list
		deck.add(cardAC);
		
		// 2
		Card card2H = new Card();
		card2H.cardType = '2';
		card2H.suit = 'H';
		card2H.image = "src/CardsVF/2H.JPG";
		// Add card to list
		deck.add(card2H);
		
		Card card2D = new Card();
		card2D.cardType = '2';
		card2D.suit = 'D';
		card2D.image = "src/CardsVF/2D.JPG";
		// Add card to list
		deck.add(card2D);
		
		Card card2S = new Card();
		card2S.cardType = '2';
		card2S.suit = 'S';
		card2S.image = "src/CardsVF/2S.JPG";
		// Add card to list
		deck.add(card2S);
		
		Card card2C = new Card();
		card2C.cardType = 'A';
		card2C.suit = 'C';
		card2C.image = "src/CardsVF/2C.JPG";
		// Add card to list
		deck.add(card2C);
		
		// 3
		Card card3H = new Card();
		card3H.cardType = '3';
		card3H.suit = 'H';
		card3H.image = "src/CardsVF/3H.JPG";
		// Add card to list
		deck.add(card3H);
				
		Card card3D = new Card();
		card3D.cardType = '3';
		card3D.suit = 'D';
		card3D.image = "src/CardsVF/2D.JPG";
		// Add card to list
		deck.add(card2D);
				
		Card card3S = new Card();
		card3S.cardType = '3';
		card3S.suit = 'S';
		card3S.image = "src/CardsVF/3S.JPG";
		// Add card to list
		deck.add(card3S);
				
		Card card3C = new Card();
		card3C.cardType = '3';
		card3C.suit = 'C';
		card3C.image = "src/CardsVF/3C.JPG";
		// Add card to list
		deck.add(card3C);
		
		// 4
		Card card4H = new Card();
		card4H.cardType = '4';
		card4H.suit = 'H';
		card4H.image = "src/CardsVF/4H.JPG";
		// Add card to list
		deck.add(card3H);
				
		Card card4D = new Card();
		card4D.cardType = '4';
		card4D.suit = 'D';
		card4D.image = "src/CardsVF/4D.JPG";
		// Add card to list
		deck.add(card4D);
				
		Card card4S = new Card();
		card4S.cardType = '4';
		card4S.suit = 'S';
		card4S.image = "src/CardsVF/4S.JPG";
		// Add card to list
		deck.add(card4S);
				
		Card card4C = new Card();
		card4C.cardType = '4';
		card4C.suit = 'C';
		card4C.image = "src/CardsVF/4C.JPG";
		// Add card to list
		deck.add(card4C);
		
		// 5
		Card card5H = new Card();
		card5H.cardType = '5';
		card5H.suit = 'H';
		card5H.image = "src/CardsVF/5H.JPG";
		// Add card to list
		deck.add(card5H);
				
		Card card5D = new Card();
		card5D.cardType = '5';
		card5D.suit = 'D';
		card5D.image = "src/CardsVF/5D.JPG";
		// Add card to list
		deck.add(card5D);
				
		Card card5S = new Card();
		card5S.cardType = '5';
		card5S.suit = 'S';
		card5S.image = "src/CardsVF/5S.JPG";
		// Add card to list
		deck.add(card5S);
				
		Card card5C = new Card();
		card5C.cardType = '5';
		card5C.suit = 'C';
		card5C.image = "src/CardsVF/5C.JPG";
		// Add card to list
		deck.add(card5C);
		
		/*
		// 6
		Card card6H = new Card();
		card6H.cardType = '6';
		card6H.suit = 'H';
		card6H.image = "src/CardsVF/5H.JPG";
		// Add card to list
		deck.add(card5H);
				
		Card card5D = new Card();
		card5D.cardType = '5';
		card5D.suit = 'D';
		card5D.image = "src/CardsVF/5D.JPG";
		// Add card to list
		deck.add(card5D);
				
		Card card5S = new Card();
		card5S.cardType = '5';
		card5S.suit = 'S';
		card5S.image = "src/CardsVF/5S.JPG";
		// Add card to list
		deck.add(card5S);
				
		Card card5C = new Card();
		card5C.cardType = '5';
		card5C.suit = 'C';
		card5C.image = "src/CardsVF/5C.JPG";
		// Add card to list
		deck.add(card5C);
		*/
		
	}

}
