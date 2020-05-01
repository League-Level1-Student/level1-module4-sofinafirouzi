package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
public static void main(String[] args) {
	typingTutor tutor = new typingTutor();
	tutor.run();
	tutor.generateRandomLetter();
	
	
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
char currentLetter;

public void run() {
	frame.add(panel);
	frame.setVisible(true);
	panel.add(label);
	currentLetter = generateRandomLetter();
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setText(currentLetter + " ");
	frame.addKeyListener(this);
	frame.pack();
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println(arg0.getKeyChar());

	
	if(currentLetter==arg0.getKeyChar()) {
		System.out.println("you're correct");
		frame.setBackground(Color.green);
	}
	else {
		System.out.println("you're incorrect");
		frame.setBackground(Color.red);
	}
	
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + " ");
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
