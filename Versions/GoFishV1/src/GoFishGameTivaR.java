import java.awt.EventQueue;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class GoFishGameTivaR {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoFishGameTivaR window = new GoFishGameTivaR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GoFishGameTivaR() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setPreferredSize(new Dimension(1280, 720));
		frame.setBounds(100, 100, 893, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("GO Fish!");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitle.setBounds(315, 11, 232, 39);
		frame.getContentPane().add(lblTitle);
		
		// Image Slots 
		// Ace
		JLabel cardSlotA = new JLabel();
		cardSlotA.setBounds(10, 79, 89, 112);
		cardSlotA.setHorizontalAlignment(SwingConstants.CENTER);
		// This is going to be put in the location of where the image is displayed 
		cardSlotA.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource("/CardsVF/AH.jpg")));
		frame.getContentPane().add(cardSlotA);
		
		JButton btnAskForA = new JButton("Ask For Ace");
		btnAskForA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAskForA.setEnabled(false);
		btnAskForA.setBorderPainted(false);
		btnAskForA.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAskForA.setBounds(10, 45, 89, 23);
		frame.getContentPane().add(btnAskForA);
		
		// 2
		JLabel cardSlot2 = new JLabel();
		cardSlot2.setBounds(109, 74, 89, 112);
		cardSlot2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(cardSlot2);
		
		JButton btnAskFor2 = new JButton("Ask For 2");
		btnAskFor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor2.setBorderPainted(false);
		btnAskFor2.setEnabled(false);
		btnAskFor2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor2.setBounds(109, 45, 89, 23);
		frame.getContentPane().add(btnAskFor2);
		
		// 3
		JLabel cardSlot3 = new JLabel();
		cardSlot3.setBounds(208, 74, 89, 112);
		cardSlot3.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot3.setVisible(false);
		frame.getContentPane().add(cardSlot3);
		
		JButton btnAskFor3 = new JButton("Ask For 3");
		btnAskFor3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor3.setBorderPainted(false);
		btnAskFor3.setEnabled(false);
		btnAskFor3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor3.setBounds(208, 45, 89, 23);
		frame.getContentPane().add(btnAskFor3);
		
		// 4
		JLabel cardSlot4 = new JLabel();
		cardSlot4.setBounds(307, 74, 89, 112);
		cardSlot4.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot4.setVisible(false);
		frame.getContentPane().add(cardSlot4);
		
		JButton btnAskFor4 = new JButton("Ask For 4");
		btnAskFor4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor4.setBorderPainted(false);
		btnAskFor4.setEnabled(false);
		btnAskFor4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor4.setBounds(307, 45, 89, 23);
		frame.getContentPane().add(btnAskFor4);
		
		// 5
		JLabel cardSlot5 = new JLabel();
		cardSlot5.setBounds(406, 74, 89, 112);
		cardSlot5.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot5.setVisible(false);
		frame.getContentPane().add(cardSlot5);
		
		JButton btnAskFor5 = new JButton("Ask For 5");
		btnAskFor5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor5.setBorderPainted(false);
		btnAskFor5.setEnabled(false);
		btnAskFor5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor5.setBounds(406, 45, 89, 23);
		frame.getContentPane().add(btnAskFor5);
		
		// 6
		JLabel cardSlot6 = new JLabel();
		cardSlot6.setBounds(505, 74, 89, 112);
		cardSlot6.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot6.setVisible(false);
		frame.getContentPane().add(cardSlot6);
		
		JButton btnAskFor6 = new JButton("Ask For 6");
		btnAskFor6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor6.setBorderPainted(false);
		btnAskFor6.setEnabled(false);
		btnAskFor6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor6.setBounds(505, 45, 89, 23);
		frame.getContentPane().add(btnAskFor6);
		
		// 7
		JLabel cardSlot7 = new JLabel();
		cardSlot7.setBounds(10, 197, 89, 112);
		cardSlot7.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot7.setVisible(false);
		frame.getContentPane().add(cardSlot7);
		
		JButton btnAskFor7 = new JButton("Ask For 7");
		btnAskFor7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor7.setBorderPainted(false);
		btnAskFor7.setEnabled(false);
		btnAskFor7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor7.setBounds(10, 226, 89, 23);
		frame.getContentPane().add(btnAskFor7);
		
		// 8
		JLabel cardSlot8 = new JLabel();
		cardSlot8.setBounds(109, 197, 89, 112);
		cardSlot8.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot8.setVisible(false);
		frame.getContentPane().add(cardSlot8);
		
		JButton btnAskFor8 = new JButton("Ask For 8");
		btnAskFor8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor8.setBorderPainted(false);
		btnAskFor8.setEnabled(false);
		btnAskFor8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor8.setBounds(109, 226, 89, 23);
		frame.getContentPane().add(btnAskFor8);
		
		//9
		JLabel cardSlot9 = new JLabel();
		cardSlot9.setBounds(208, 197, 89, 112);
		cardSlot9.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot9.setVisible(false);
		frame.getContentPane().add(cardSlot9);
		
		JButton btnAskFor9 = new JButton("Ask For 9");
		btnAskFor9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor9.setBorderPainted(false);
		btnAskFor9.setEnabled(false);
		btnAskFor9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor9.setBounds(208, 226, 89, 23);
		frame.getContentPane().add(btnAskFor9);
		
		// 10
		JLabel cardSlot10 = new JLabel();
		cardSlot10.setBounds(307, 197, 89, 112);
		cardSlot10.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlot10.setVisible(false);
		frame.getContentPane().add(cardSlot10);
		
		JButton btnAskFor10 = new JButton("Ask For 10");
		btnAskFor10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskFor10.setBorderPainted(false);
		btnAskFor10.setEnabled(false);
		btnAskFor10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAskFor10.setBounds(307, 226, 89, 23);
		frame.getContentPane().add(btnAskFor10);
		
		// J
		JLabel cardSlotJ = new JLabel();
		cardSlotJ.setBounds(406, 197, 89, 112);
		cardSlotJ.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlotJ.setVisible(false);
		frame.getContentPane().add(cardSlotJ);
		
		JButton btnAskForJ = new JButton("Ask For Jack");
		btnAskForJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskForJ.setBorderPainted(false);
		btnAskForJ.setEnabled(false);
		btnAskForJ.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAskForJ.setBounds(406, 226, 89, 23);
		frame.getContentPane().add(btnAskForJ);
		
		JLabel cardSlotQ = new JLabel();
		cardSlotQ.setBounds(505, 197, 89, 112);
		cardSlotQ.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlotQ.setVisible(false);
		frame.getContentPane().add(cardSlotQ);
		
		JButton btnAskForQ = new JButton("Ask For Queen");
		btnAskForQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskForQ.setBorderPainted(false);
		btnAskForQ.setEnabled(false);
		btnAskForQ.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAskForQ.setBounds(505, 226, 89, 23);
		frame.getContentPane().add(btnAskForQ);
		
		JLabel cardSlotK = new JLabel();
		cardSlotK.setBounds(604, 177, 89, 112);
		cardSlotK.setHorizontalAlignment(SwingConstants.CENTER);
		cardSlotK.setVisible(false);
		frame.getContentPane().add(cardSlotK);
		
		JButton btnAskForK = new JButton("Ask For King");
		btnAskForK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAskForK.setBorderPainted(false);
		btnAskForK.setEnabled(false);
		btnAskForK.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnAskForK.setBounds(604, 148, 89, 23);
		frame.getContentPane().add(btnAskForK);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Global Variables
		// First step of the set up get the deck class to create a deck
		// Known as complicated variables
		Deck Pool = new Deck();
		
		// ArrayList for the deck
		ArrayList <Card> cardDeck = new ArrayList <>();
		
		// Cards to remove
		ArrayList <Card> cardsToRemove = new ArrayList<>();
		
		Pool.CreateDeck();
		
		// Set up player and computer 
		Player P1 = new Player();
		Player Com = new Player();
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Button to start the game
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Local variables
				boolean isGameOver;
				boolean checkPlayer;
				int numberOfPlayerCards;
				int numberOfComputerCards;
				int deckSize;
				
				
				
				//Disable the buttons
				btnStartGame.setEnabled(false);
				btnAskForA.setEnabled(false);
				btnAskFor2.setEnabled(false);
				btnAskFor3.setEnabled(false);
				btnAskFor4.setEnabled(false);
				btnAskFor5.setEnabled(false);
				btnAskFor6.setEnabled(false);
				btnAskFor7.setEnabled(false);
				btnAskFor8.setEnabled(false);
				btnAskFor9.setEnabled(false);
				btnAskFor10.setEnabled(false);
				btnAskForJ.setEnabled(false);
				btnAskForQ.setEnabled(false);
				btnAskForK.setEnabled(false);

				System.out.println("Step one");
				
				
				// Have player get their hand
				for (int i = 0; i <= 7 ;i++)
				{
					deckSize = Pool.deck.size();
					// Deal a card to the player's hand
					Card newCard = Pool.GivePlayerCard(deckSize);
					System.out.println("Original cards:" + newCard.GetCardType());
					P1.hand.add(newCard);
					
					
				}
				
				// Then have computer get their hand
				for (int i = 0; i <= 6 ;i++)
				{
					deckSize = Pool.deck.size();
					// Deal a card to the computer's hand
					Card newCard = Pool.GivePlayerCard(deckSize);
					
					Com.hand.add(newCard);
					
				}
				
				// Then have an end turn button to do everthing until the end of the game 
				
				/// IMPORTANT NEVER DISPLAY THE CARDS BEFORE THE GAME HAS CHECKED FOR DOUBLES
				
				
				// Look up array list boolean contains
				
				System.out.println("Step two");
				///////// DOUBLES
				// Check for doubles for player
				numberOfPlayerCards = (P1.hand.size());
				checkPlayer = true;
					Card cardX;
					Card cardY;
					char typeX;
					char typeY;
					
					System.out.println("Hand size" + P1.hand.size());
					
					// Problem is in this loop I'm going to look at how I did it for bubble sort
					//
					//
					///
					///
					///
					////
					////
					////
					////
					/////
					///
					////
					
					for (int x = 0; x < numberOfPlayerCards; x++)
					{
						System.out.println("Step two point one");
						cardX = P1.hand.get(x);
						
						for(int y = 1; y < numberOfPlayerCards; y++)
						{
							System.out.println("Step two point ");
							cardY = P1.hand.get(x);
							
							// To compare types
							typeX = cardX.GetCardType();
							System.out.println("typeX:" + typeX);
							typeY = cardY.GetCardType();
							System.out.println("typeY:" + typeY);
							if (typeX == typeY)
							{
								P1.points = (P1.points +1);
								
								System.out.println("Step two point 4");
								// Discard both cards
								P1.hand.remove(x);
								P1.hand.remove(y);
								//numberOfPlayerCards = (numberOfPlayerCards -1);
								
								// Disable the option for selecting the card to ask for
								if (typeX == 'A')
								{
									btnAskForA.setEnabled(false);
									cardSlotA.setVisible(false);

								}
								else if (typeX == '2')
								{
									btnAskFor2.setEnabled(false);
									cardSlot2.setVisible(false);
								}
								else if (typeX == '3')
								{
									btnAskFor3.setEnabled(false);
									cardSlot3.setVisible(false);
								}
								else if (typeX == '4')
								{
									btnAskFor4.setEnabled(false);
									cardSlot4.setVisible(false);
								}
								else if (typeX == '5')
								{
									btnAskFor5.setEnabled(false);
									cardSlot5.setVisible(false);
								}
								else if (typeX == '6')
								{
									btnAskFor6.setEnabled(false);
									cardSlot6.setVisible(false);
								}
								else if (typeX == '7')
								{
									btnAskFor7.setEnabled(false);
									cardSlot7.setVisible(false);
								}
								else if (typeX == '8')
								{
									btnAskFor8.setEnabled(false);
									cardSlot8.setVisible(false);
								}
								else if (typeX == '9')
								{
									btnAskFor9.setEnabled(false);
									cardSlot9.setVisible(false);
								}
								else if (typeX == '0')
								{
									btnAskFor10.setEnabled(false);
									cardSlot10.setVisible(false);
								}
								else if (typeX == 'J')
								{
									btnAskForJ.setEnabled(false);
									cardSlotJ.setVisible(false);
								}
								else if (typeX == 'Q')
								{
									btnAskForQ.setEnabled(false);
									cardSlotQ.setVisible(false);
								}
								else if (typeX == 'K')
								{
									btnAskForK.setEnabled(false);
									cardSlotK.setVisible(false);
								}
								
								
								
							}
							numberOfPlayerCards = (P1.hand.size());	
							System.out.println("Hand size" + P1.hand.size());
						}
					}
					
				
				// Check for double end 
				
				// check for doubles for computer
					System.out.println("Step three");
			///////// DOUBLES
				// Check for doubles for player
				numberOfComputerCards = Com.hand.size();
					Card cardR;
					Card cardZ;
					for (int r = 0; r < numberOfComputerCards; r++)
					{
							
						cardR = Com.hand.get(r);
							
						for(int z = 0; z < numberOfComputerCards; z++)
						{
							cardZ = Com.hand.get(z);
							
							if (cardR.GetCardType() == cardZ.GetCardType())
							{
								Com.points = (P1.points +1);
									
								// Discard both cards
								Com.hand.remove(r);
								Com.hand.remove(z);	
									
							}
										
						}
					}
						
					
					// Check for double end
				
				// display cards in player's hand
					System.out.println("Step four");
				
				for (int i = 0; i< numberOfPlayerCards; i++)
				{
					Card currentDisplayCard;
					char currentDisplayType;
					String currentImage;
					currentDisplayCard = P1.hand.get(i);
					
					currentDisplayType = currentDisplayCard.GetCardType();
					currentImage = currentDisplayCard.GetImage();
					
					if (currentDisplayType == 'A')
					{
						cardSlotA.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskForA.setEnabled(true);
						cardSlotA.setVisible(true);
					}
					else if (currentDisplayType == '2')
					{
						cardSlot2.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor2.setEnabled(true);
						cardSlot2.setVisible(true);
					}
					else if (currentDisplayType == '3')
					{
						cardSlot3.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor3.setEnabled(true);
						cardSlot3.setVisible(true);
					}
					else if (currentDisplayType == '4')
					{
						cardSlot4.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor4.setEnabled(true);
						cardSlot4.setVisible(true);
					}
					else if (currentDisplayType == '5')
					{
						cardSlot5.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor5.setEnabled(true);
						cardSlot5.setVisible(true);
					}
					else if (currentDisplayType == '6')
					{
						cardSlot6.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor6.setEnabled(true);
						cardSlot6.setVisible(true);
					}
					else if (currentDisplayType == '7')
					{
						cardSlot7.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor7.setEnabled(true);
						cardSlot7.setVisible(true);
					}
					else if (currentDisplayType == '8')
					{
						cardSlot8.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor8.setEnabled(true);
						cardSlot8.setVisible(true);
					}
					else if (currentDisplayType == '9')
					{
						cardSlot9.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor9.setEnabled(true);
						cardSlot9.setVisible(true);
					}
					else if (currentDisplayType == '0')
					{
						cardSlot10.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskFor10.setEnabled(true);
						cardSlot10.setVisible(true);
					}
					else if (currentDisplayType == 'J')
					{
						cardSlotJ.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskForJ.setEnabled(true);
						cardSlotJ.setVisible(true);
					}
					else if (currentDisplayType == 'Q')
					{
						cardSlotQ.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskForQ.setEnabled(true);
						cardSlotQ.setVisible(true);
					}
					else if (currentDisplayType == 'K')
					{
						cardSlotK.setIcon(new ImageIcon(GoFishGameTivaR.class.getResource(currentImage)));
						btnAskForK.setEnabled(true);
						cardSlotK.setVisible(true);
					}
					
					System.out.println("I finished");
					
				}
					
			}
		});
		btnStartGame.setBounds(10, 11, 124, 23);
		frame.getContentPane().add(btnStartGame);
		
		JButton btnEndTurn = new JButton("End Turn");
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Variables
				
				// If the user has zero cards then call the end game funtion
				// End game function ends the game disables buttons and checks to see who wins
				
				// Else
				//  Do the computers turn first and then do the users things and repeat for each turn
				
				// Randomly select a card type from computer's hand
				
				// If the playerHand has a card type of the same then remove card from player's hand and add it to computer
				
				// If player's hand doesn't have card then add card from deck
				
				// Check for doubles of any card type
				
				// after
				
				// If user has zero cards call end game function (See above)
				
				// Allow player to select a card from their hand 
				// Enable all of the buttons of cards currently in the users hand
				
				// If computer hand has a card type of the same then add card to player's hand
				
				// If computer's hand  doesn't have card then add card from deck
				
				// If 
			}
		});
		btnEndTurn.setBounds(10, 557, 124, 23);
		frame.getContentPane().add(btnEndTurn);
		

	}
}

