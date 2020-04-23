package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton trickButton = new JButton();
JButton treatButton = new JButton();

public void run() {
	frame.add(panel);
	panel.add(treatButton);
	panel.add(trickButton);
	frame.setVisible(true);
	treatButton.addMouseListener(this);
	treatButton.setText("Treat");
	trickButton.setText("Trick");
	trickButton.addMouseListener(this);
	frame.pack();
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();

	if(treatButton==buttonPressed) {
		showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRfTIngnSIZJrX-mFtXoFzSlPxRYY6mocbnLzn4G81B6O8l5VE9&usqp=CAU");
	}
	if(trickButton==buttonPressed) {
		showPictureFromTheInternet("https://www.haleslabradoodles.com/wp-content/uploads/2020/02/Daydreamer-scaled-1583x1583.jpg");
	}
	frame.pack();
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}


}//end class
