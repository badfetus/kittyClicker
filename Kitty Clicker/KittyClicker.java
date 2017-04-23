import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class KittyClicker {

	private JFrame frmKittyClicker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KittyClicker window = new KittyClicker();
					window.frmKittyClicker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KittyClicker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKittyClicker = new JFrame();
		frmKittyClicker.setTitle("Kitty Clicker");
		frmKittyClicker.setResizable(false);
		frmKittyClicker.getContentPane().setBackground(new Color(204, 255, 102));
		frmKittyClicker.setBounds(100, 100, 640, 480);
		frmKittyClicker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKittyClicker.getContentPane().setLayout(null);
		
		Label TotalPurrs = new Label("Total Purrs:");
		TotalPurrs.setBackground(new Color(255, 255, 255));
		TotalPurrs.setForeground(new Color(255, 102, 255));
		TotalPurrs.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 20));
		TotalPurrs.setBounds(0, 0, 126, 33);
		frmKittyClicker.getContentPane().add(TotalPurrs);
		
		Label PurrCounter = new Label("SCORE");
		PurrCounter.setForeground(new Color(255, 102, 255));
		PurrCounter.setBackground(new Color(255, 255, 255));
		PurrCounter.setAlignment(Label.CENTER);
		PurrCounter.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 20));
		PurrCounter.setBounds(122, 0, 512, 33);
		frmKittyClicker.getContentPane().add(PurrCounter);
		
		ImageIcon Cat1= new ImageIcon("Cat1.png");
		ImageIcon Cat2= new ImageIcon("cat2.png");
		ImageIcon Cat3= new ImageIcon("cat3.png");
		ImageIcon Cat4= new ImageIcon("cat4.png");
		ImageIcon Cat5= new ImageIcon("cat5.png");
		ImageIcon Cat6= new ImageIcon("cat6.png");
		ImageIcon Cat7= new ImageIcon("cat7.png");

		JLabel CatLabel = new JLabel(Cat1);
		CatLabel.setBounds(0, 302, 155, 149);
		frmKittyClicker.getContentPane().add(CatLabel);
		
		
	}
}
