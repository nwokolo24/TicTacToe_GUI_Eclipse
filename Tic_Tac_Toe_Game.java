import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tic_Tac_Toe_Game {

	private JFrame frmTicTacToe;
	private JTextField xPlayerScore;
	private JTextField oPlayerScore;
	private int xScore = 0;
	private int oScore = 0;
	private String gameStarter = "X";
	private Color player_X_Color = new Color(41, 145, 132);
	private Color player_O_Color = new Color(87, 65, 157);
	private int b1 = 15;
	private int b2 = 15;
	private int b3 = 15;
	private int b4 = 15;
	private int b5 = 15;
	private int b6 = 15;
	private int b7 = 15;
	private int b8 = 15;
	private int b9 = 15;
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tic_Tac_Toe_Game window = new Tic_Tac_Toe_Game();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tic_Tac_Toe_Game() {
		initialize();
	}
	
	private void nextPlayer() {
		if (gameStarter.equalsIgnoreCase("X")) {
			gameStarter = "O";
		} else {
			gameStarter = "X";
		}
	}
	
	private void winningGame() {
		// Conditions for player X winning the game
		if (b1 == 1 && b2 == 1 && b3 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		else if (b4 == 1 && b5 == 1 && b6 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		else if (b7 == 1 && b8 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		else if (b1 == 1 && b4 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		else if (b2 == 1 && b5 == 1 && b8 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		else if (b3 == 1 && b6 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		else if (b7 == 1 && b5 == 1 && b3 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		else if (b1 == 1 && b5 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xScore++;
			xPlayerScore.setText(String.valueOf(xScore));
		}
		
		
		// Conditions for player O winning the game
		else if (b1 == 0 && b2 == 0 && b3 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		else if (b4 == 0 && b5 == 0 && b6 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		else if (b7 == 0 && b8 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		else if (b1 == 0 && b4 == 0 && b7 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		else if (b2 == 0 && b5 == 0 && b8 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		else if (b3 == 0 && b6 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		else if (b7 == 0 && b5 == 0 && b3 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		else if (b1 == 0 && b5 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			oScore++;
			oPlayerScore.setText(String.valueOf(oScore));
		}
		
		// condition for tie or no winner of the game
		else if (i == 9) {
			JOptionPane.showMessageDialog(frmTicTacToe, "It's a Tie, there is no winner!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setFont(new Font("Dialog", Font.BOLD, 20));
		frmTicTacToe.setBackground(new Color(138, 169, 153));
		frmTicTacToe.setTitle("Tic Tac Toe Game");
		frmTicTacToe.setBounds(100, 100, 500, 350);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(70, 164, 136));
		panel.setBorder(new LineBorder(new Color(96, 180, 148)));
		frmTicTacToe.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.setForeground(new Color(147, 105, 190));
		btn1.setBackground(new Color(145, 79, 197));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn1.setForeground(player_X_Color);
					b1 = 1;
					i++;
				} else {
					btn1.setForeground(player_O_Color);
					b1 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.setForeground(new Color(147, 105, 190));
		btn2.setBackground(new Color(145, 79, 197));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn2.setForeground(player_X_Color);
					b2 = 1;
					i++;
				} else {
					btn2.setForeground(player_O_Color);
					b2 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.setForeground(new Color(147, 105, 190));
		btn3.setBackground(new Color(145, 79, 197));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn3.setForeground(player_X_Color);
					b3 = 1;
					i++;
				} else {
					btn3.setForeground(player_O_Color);
					b3 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Player X");
		lblNewLabel.setForeground(new Color(41, 145, 132));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		xPlayerScore = new JTextField();
		xPlayerScore.setForeground(new Color(72, 142, 130));
		xPlayerScore.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		xPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		xPlayerScore.setText("0");
		panel_5.add(xPlayerScore, BorderLayout.CENTER);
		xPlayerScore.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.setForeground(new Color(147, 105, 190));
		btn4.setBackground(new Color(145, 79, 197));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn4.setForeground(player_X_Color);
					b4 = 1;
					i++;
				} else {
					btn4.setForeground(player_O_Color);
					b4 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.setForeground(new Color(147, 105, 190));
		btn5.setBackground(new Color(145, 79, 197));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn5.setForeground(player_X_Color);
					b5 = 1;
					i++;
				} else {
					btn5.setForeground(player_O_Color);
					b5 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.setForeground(new Color(147, 105, 190));
		btn6.setBackground(new Color(145, 79, 197));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn6.setForeground(player_X_Color);
					b6 = 1;
					i++;
				} else {
					btn6.setForeground(player_O_Color);
					b6 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Player O");
		lblNewLabel_1.setForeground(new Color(87, 65, 157));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		oPlayerScore = new JTextField();
		oPlayerScore.setForeground(new Color(78, 65, 151));
		oPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		oPlayerScore.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		oPlayerScore.setText("0");
		panel_10.add(oPlayerScore, BorderLayout.CENTER);
		oPlayerScore.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.setForeground(new Color(147, 105, 190));
		btn7.setBackground(new Color(145, 79, 197));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn7.setForeground(player_X_Color);
					b7 = 1;
					i++;
				} else {
					btn7.setForeground(player_O_Color);
					b7 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_11.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setForeground(new Color(147, 105, 190));
		btn8.setBackground(new Color(145, 79, 197));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn8.setForeground(player_X_Color);
					b8 = 1;
					i++;
				} else {
					btn8.setForeground(player_O_Color);
					b8 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.setForeground(new Color(147, 105, 190));
		btn9.setBackground(new Color(145, 79, 197));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(gameStarter);
				if (gameStarter.equalsIgnoreCase("X")) {
					btn9.setForeground(player_X_Color);
					b9 = 1;
					i++;
				} else {
					btn9.setForeground(player_O_Color);
					b9 = 0;
					i++;
				}
				nextPlayer();
				winningGame();
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		
		// Reset function reset the text field of the game and the scores too
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(32, 31, 234));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1 = 15;
				b2 = 15;
				b3 = 15;
				b4 = 15;
				b5 = 15;
				b6 = 15;
				b7 = 15;
				b8 = 15;
				b9 = 15;
				i = 0;
			}
		});
		btnReset.setFont(new Font("Lucida Grande", Font.BOLD, 12));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(197, 31, 24));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmTicTacToe = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmTicTacToe, "Confirm Exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.BOLD, 12));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
