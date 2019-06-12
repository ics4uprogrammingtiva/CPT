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
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Local variables
				
				
				//Disable the button
				btnStartGame.setEnabled(false);
				
				// First step of the set up get the deck class to create a deck
				
				Deck Pool = new Deck();
				
				Card cardAH = new Card();
				cardAH.testCard = 5;
				//deck
				// Second step of the set up
				// Have player get their hand
				for (int i = 0; i <= 7 ;i++)
				{
					// Deal a card to the player's hand
				}
				
				// Then have computer get their hand
				
				// Then have an end turn button to do everthing until the end of the game 
				
				/// IMPORTANT NEVER DISPLAY THE CARDS BEFORE THE GAME HAS CHECKED FOR DOUBLES
				// Check for doubles for player
				// check for doubles for computer
				// display cards in player's hand

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
				
				// If computer hand has a card type of the same then add card to player's hand
				
				// If computer's hand  doesn't have card then add card from deck
				
				// If 
			}
		});
		btnEndTurn.setBounds(10, 557, 124, 23);
		frame.getContentPane().add(btnEndTurn);

		
	}
}

