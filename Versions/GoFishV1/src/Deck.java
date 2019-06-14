import java.util.ArrayList;

public class Deck {
	
	// Properties
	ArrayList <Card> deck = new ArrayList <>();
	
	// Don't know what this does but my code doesn't work without it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	
	public ArrayList CreateDeck ()
	{
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
				
				//6
				Card card6H = new Card();
				card6H.cardType = '6';
				card6H.suit = 'H';
				card6H.image = "src/CardsVF/6H.JPG";
				// Add card to list
				deck.add(card6H);
						
				Card card6D = new Card();
				card6D.cardType = '6';
				card6D.suit = 'D';
				card6D.image = "src/CardsVF/6D.JPG";
				// Add card to list
				deck.add(card6D);
						
				Card card6S = new Card();
				card6S.cardType = '6';
				card6S.suit = 'S';
				card6S.image = "src/CardsVF/6S.JPG";
				// Add card to list
				deck.add(card6S);
						
				Card card6C = new Card();
				card6C.cardType = '6';
				card6C.suit = 'C';
				card6C.image = "src/CardsVF/6C.JPG";
				// Add card to list
				deck.add(card6C);
				
				// 7
				Card card7H = new Card();
				card7H.cardType = '7';
				card7H.suit = 'H';
				card7H.image = "src/CardsVF/7H.JPG";
				// Add card to list
				deck.add(card7H);
						
				Card card7D = new Card();
				card7D.cardType = '7';
				card7D.suit = 'D';
				card7D.image = "src/CardsVF/7D.JPG";
				// Add card to list
				deck.add(card7D);
						
				Card card7S = new Card();
				card7S.cardType = '7';
				card7S.suit = 'S';
				card7S.image = "src/CardsVF/7S.JPG";
				// Add card to list
				deck.add(card7S);
						
				Card card7C = new Card();
				card7C.cardType = '7';
				card7C.suit = 'C';
				card7C.image = "src/CardsVF/7C.JPG";
				// Add card to list
				deck.add(card7C);
				
				// 8
				Card card8H = new Card();
				card8H.cardType = '8';
				card8H.suit = 'H';
				card8H.image = "src/CardsVF/8H.JPG";
				// Add card to list
				deck.add(card8H);
						
				Card card8D = new Card();
				card8D.cardType = '8';
				card8D.suit = 'D';
				card8D.image = "src/CardsVF/8D.JPG";
				// Add card to list
				deck.add(card8D);
						
				Card card8S = new Card();
				card8S.cardType = '8';
				card8S.suit = 'S';
				card8S.image = "src/CardsVF/8S.JPG";
				// Add card to list
				deck.add(card8S);
						
				Card card8C = new Card();
				card8C.cardType = '8';
				card8C.suit = 'C';
				card8C.image = "src/CardsVF/8C.JPG";
				// Add card to list
				deck.add(card8C);
				
				// 9
				Card card9H = new Card();
				card9H.cardType = '9';
				card9H.suit = 'H';
				card9H.image = "src/CardsVF/9H.JPG";
				// Add card to list
				deck.add(card9H);
						
				Card card9D = new Card();
				card9D.cardType = '9';
				card9D.suit = 'D';
				card9D.image = "src/CardsVF/9D.JPG";
				// Add card to list
				deck.add(card9D);
						
				Card card9S = new Card();
				card9S.cardType = '9';
				card9S.suit = 'S';
				card9S.image = "src/CardsVF/9S.JPG";
				// Add card to list
				deck.add(card9S);
						
				Card card9C = new Card();
				card9C.cardType = '9';
				card9C.suit = 'C';
				card9C.image = "src/CardsVF/9C.JPG";
				// Add card to list
				deck.add(card9C);
				
				// 10
				Card card10H = new Card();
				card10H.cardType = '0';
				card10H.suit = 'H';
				card10H.image = "src/CardsVF/10H.JPG";
				// Add card to list
				deck.add(card10H);
						
				Card card10D = new Card();
				card10D.cardType = '0';
				card10D.suit = 'D';
				card10D.image = "src/CardsVF/10D.JPG";
				// Add card to list
				deck.add(card9D);
						
				Card card10S = new Card();
				card10S.cardType = '0';
				card10S.suit = 'S';
				card10S.image = "src/CardsVF/10S.JPG";
				// Add card to list
				deck.add(card10S);
						
				Card card10C = new Card();
				card10C.cardType = '0';
				card10C.suit = 'C';
				card10C.image = "src/CardsVF/10C.JPG";
				// Add card to list
				deck.add(card10C);
				
				// J
				Card cardJH = new Card();
				cardJH.cardType = 'J';
				cardJH.suit = 'H';
				cardJH.image = "src/CardsVF/JH.JPG";
				// Add card to list
				deck.add(cardJH);
						
				Card cardJD = new Card();
				cardJD.cardType = 'J';
				cardJD.suit = 'D';
				cardJD.image = "src/CardsVF/JD.JPG";
				// Add card to list
				deck.add(cardJD);
						
				Card cardJS = new Card();
				cardJS.cardType = 'J';
				cardJS.suit = 'S';
				cardJS.image = "src/CardsVF/JS.JPG";
				// Add card to list
				deck.add(cardJS);
						
				Card cardJC = new Card();
				cardJC.cardType = 'J';
				cardJC.suit = 'C';
				cardJC.image = "src/CardsVF/JC.JPG";
				// Add card to list
				deck.add(cardJC);
				
				// Q
				Card cardQH = new Card();
				cardQH.cardType = 'Q';
				cardQH.suit = 'H';
				cardQH.image = "src/CardsVF/QH.JPG";
				// Add card to list
				deck.add(cardQH);
						
				Card cardQD = new Card();
				cardQD.cardType = 'Q';
				cardQD.suit = 'D';
				cardQD.image = "src/CardsVF/QD.JPG";
				// Add card to list
				deck.add(cardQD);
						
				Card cardQS = new Card();
				cardQS.cardType = 'Q';
				cardQS.suit = 'S';
				cardQS.image = "src/CardsVF/QS.JPG";
				// Add card to list
				deck.add(cardQS);
						
				Card cardQC = new Card();
				cardQC.cardType = 'Q';
				cardQC.suit = 'C';
				cardQC.image = "src/CardsVF/QC.JPG";
				// Add card to list
				deck.add(cardQC);
				
				// K
				Card cardKH = new Card();
				cardKH.cardType = 'K';
				cardKH.suit = 'H';
				cardKH.image = "src/CardsVF/KH.JPG";
				// Add card to list
				deck.add(cardKH);
						
				Card cardKD = new Card();
				cardKD.cardType = 'K';
				cardKD.suit = 'D';
				cardKD.image = "src/CardsVF/KD.JPG";
				// Add card to list
				deck.add(cardKD);
						
				Card cardKS = new Card();
				cardKS.cardType = 'K';
				cardKS.suit = 'S';
				cardKS.image = "src/CardsVF/KS.JPG";
				// Add card to list
				deck.add(cardKS);
						
				Card cardKC = new Card();
				cardKC.cardType = 'K';
				cardKC.suit = 'C';
				cardKC.image = "src/CardsVF/KC.JPG";
				// Add card to list
				deck.add(cardKC);
				
				return (deck);
		
	}
	
	
	public Card GivePlayerCard (int deckSize)
	{
		int deckLength = deckSize;
		int randomNumber = (int) ((Math.random()*deckLength) - 0);
		
		Card playerCard = deck.get(randomNumber);
		
		deck.remove(randomNumber);
		
		return (playerCard);
	}
	
}
