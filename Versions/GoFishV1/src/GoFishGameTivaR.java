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

			}
		});
		btnStartGame.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnStartGame);
		
	}
}

