package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker {
public static void main(String[] args) {
	makeButtons();
}//end main
	public static void makeButtons() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	JButton jokeButton = new JButton();
	JButton punchButton = new  JButton();
	jokeButton.setText("joke");
	punchButton.setText("punchline");
	panel.add(jokeButton);
	panel.add(punchButton);
	
	}//end make buttons
}//end class chuckle
