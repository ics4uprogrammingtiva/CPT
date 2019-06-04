import java.awt.EventQueue;
import javax.swing.ImageIcon;
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
		
		// ADDING an image is hard but I'm trying to resize the image
		/*
		// Try to add an image
		JLabel jLabelObject = new JLabel();
		jLabelObject.setHorizontalAlignment(SwingConstants.CENTER);
		jLabelObject.setIcon(new ImageIcon("src/Cards/AH.JPG"));
		jLabelObject.setBounds(36, 195, 116, 158);
		*/
		// Resize Image
		/*
		JLabel jLabelObject = new JLabel();
		jLabelObject.setIcon(new ImageIcon(new ImageIcon("src/Cards/AH.JPG").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		frame.getContentPane().add(jLabelObject);
		*/
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnStartGame.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnStartGame);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(36, 195, 116, 158);
		frame.getContentPane().add(lblNewLabel);
		
	}
	
	
}

