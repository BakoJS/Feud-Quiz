package quizzing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Quiz6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz6 window = new Quiz6();
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
	public Quiz6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 441);
		frame.setTitle("Quiz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frame.dispose();
				Quiz.NewScreen();
				Quiz2.score = 0;
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(21, 33, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel lblQuestionHow = new JLabel("Question 5: Most used loop?");
		lblQuestionHow.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestionHow.setForeground(new Color(102, 0, 153));
		lblQuestionHow.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuestionHow.setBounds(66, 53, 330, 63);
		frame.getContentPane().add(lblQuestionHow);
		
		JLabel label_1 = new JLabel("Score: " + Quiz2.score);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(311, 28, 96, 30);
		frame.getContentPane().add(label_1);
		
		JButton btnYears = new JButton("While Loop");
		btnYears.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz2.score +=30;
				frame.dispose();
				Quiz7.NewScreen();
			}
		});
		btnYears.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnYears.setBounds(62, 191, 140, 63);
		frame.getContentPane().add(btnYears);
		
		JButton btnYears_1 = new JButton("Do While Loop");
		btnYears_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz2.score +=20;
				frame.dispose();
				Quiz7.NewScreen();
			}
		});
		btnYears_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnYears_1.setBounds(247, 191, 140, 63);
		frame.getContentPane().add(btnYears_1);
		
		JButton btnYears_2 = new JButton("In the Loop");
		btnYears_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz2.score +=10;
				frame.dispose();
				Quiz7.NewScreen();
			}
		});
		btnYears_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnYears_2.setBounds(62, 299, 140, 63);
		frame.getContentPane().add(btnYears_2);
		
		JButton btnYears_3 = new JButton("For loop");
		btnYears_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Quiz2.score +=50;
				frame.dispose();
				Quiz7.NewScreen();
			}
		});
		btnYears_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnYears_3.setBounds(247, 299, 140, 63);
		frame.getContentPane().add(btnYears_3);
	}

}
