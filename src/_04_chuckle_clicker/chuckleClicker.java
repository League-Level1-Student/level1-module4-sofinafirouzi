package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener{
public static void main(String[] args) {
	chuckleClicker Chuckle = new chuckleClicker();
	Chuckle.makeButtons();
}//end main

JFrame frame = new JFrame();
JButton jokeButton = new JButton();
JButton punchButton = new  JButton();
JPanel panel = new JPanel();

	public void makeButtons() {
	
	frame.setVisible(true);
	frame.add(panel);
	jokeButton.setText("joke");
	punchButton.setText("punchline");
	jokeButton.addActionListener(this);
	punchButton.addActionListener(this);
	panel.add(jokeButton);
	panel.add(punchButton);
	
	}//end make buttons
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==jokeButton) {
		JOptionPane.showInputDialog("Knock-Knock");
		JOptionPane.showInputDialog("Tank");
		JOptionPane.showMessageDialog(null, "you're welcome.");
		}
		if(buttonPressed==punchButton) {
			JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes? It's because he doesn't want to be spotted.");
		}
	}
}//end class chuckle
