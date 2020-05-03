package _09_latest_tweet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tweet implements MouseListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField text = new JTextField();
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(text);
		button.setText("Search the Twitterverse");
		
		frame.pack();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==button) {
			System.out.println("tweet, tweet");
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
