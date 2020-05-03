package _08_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements MouseListener {
	int num1 = 0;
	int num2 = 0;
	int answer = 0;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addB = new JButton();
	JButton subB = new JButton();
	JButton mulB = new JButton();
	JLabel label = new JLabel();
	JButton divB = new JButton();
	JTextField textA = new JTextField();
	JTextField textB = new JTextField();
	public void run() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(addB);
		addB.addMouseListener(this);
		addB.setText("add");
		panel.add(subB);
		subB.addMouseListener(this);
		subB.setText("subtract");
		panel.add(divB);
		divB.addMouseListener(this);
		divB.setText("divide");
		panel.add(mulB);
		mulB.addMouseListener(this);
		mulB.setText("multiply");
		panel.add(textA);
		textA.setSize(50, 50);
		textB.setSize(50,50);
		panel.add(textB);
		panel.add(label);
		label.setSize(50, 50);
		frame.pack();
	
	}
	
public void add() {
	answer = num1 + num2;
	label.setText("" + answer);
}
public void subtract() {
	answer = num1-num2;
	label.setText("" + answer);
}
public void multiply() {
	answer = num1*num2;
	label.setText("" + answer);
}
public void divide() {
	answer = num1/num2;
	label.setText("" + answer);
}


@Override
public void mouseClicked(MouseEvent arg0) {
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
	num1 = Integer.parseInt(textA.getText());
	num2 = Integer.parseInt(textB.getText());
	if(buttonPressed==addB) {
		add();
	}
	if(buttonPressed==subB) {
		subtract();
	}
	if(buttonPressed==mulB) {
		multiply();
	}
	if(buttonPressed==divB) {
		divide();
	}
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}




}
