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
		frame.setBounds(100, 100, 893, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("GO Fish!");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitle.setBounds(315, 11, 232, 39);
		frame.getContentPane().add(lblTitle);
		
		// Try to add an image
		//Test Image
		String test = "src/CardsVF/AH.JPG";
		JLabel testImageOfCard = new JLabel();
		testImageOfCard.setBounds(99, 218, 89, 112);
		testImageOfCard.setHorizontalAlignment(SwingConstants.CENTER);
		testImageOfCard.setIcon(new ImageIcon(test));
		frame.getContentPane().add(testImageOfCard);
		
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Local variables
				
				//Disable the button
				btnStartGame.setEnabled(false);
				
				// First step of the set up get the deck class to create a deck
				
				Deck Pool = new Deck();
				
				//deck
				// Second step of the set up
				// Have player get their hand
				
				// Then have computer get their hand
				
				// Then have an end turn button to do everthing until the end of the game 

			}
		});
		btnStartGame.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnStartGame);
		
		JButton btnEndTurn = new JButton("New button");
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
			}
		});
		btnEndTurn.setBounds(10, 557, 89, 23);
		frame.getContentPane().add(btnEndTurn);
		
	}
}

