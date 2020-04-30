package _03_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton = new JButton();
	private JButton secondButton = new JButton();
	private JButton thirdButton, fourthButton, fifthButton = new JButton();
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private AudioClip sound;



	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
createHeader("Jeopardy");
makeScorePanel();
		
		
		// 1. Make the frame show up
frame.setVisible(true);
		// 2. Give your frame a title

		// 3. Create a JPanel variable to hold the header using the createHeader method
JPanel panel = createHeader("Jeopardy");
		// 4. Add the header component to the quizPanel
quizPanel.add(panel);
		// 5. Add the quizPanel to the frame
frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
firstButton = createButton("$200");
		// 7. Add the firstButton to the quizPanel
quizPanel.add(firstButton);
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.
//done
		// 9. Use the secondButton variable to hold a button using the createButton
		// method
secondButton = createButton("$400");
		// 10. Add the secondButton to the quizPanel
quizPanel.add(secondButton);
		// 11. Add action listeners to the buttons (2 lines of code)
firstButton.addActionListener(this);
secondButton.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below
//done
		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
thirdButton = createButton("$600");
thirdButton.addActionListener(this);
fourthButton = createButton("$800");
fourthButton.addActionListener(this);
fifthButton = createButton("1000");
fifthButton.addActionListener(this);

		quizPanel.add(thirdButton);
		quizPanel.add(fourthButton);
		quizPanel.add(fifthButton);
		quizPanel.setVisible(true);
		
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
JButton dollarButton = new JButton();
		// Set the text of the button to the dollarAmount
dollarButton.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
buttonCount = buttonCount+5;
		// Return your new button instead of the temporary button

		return dollarButton;
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
if(buttonPressed==firstButton) {
			// Call the askQuestion() method
 askQuestion("Who played Spider-Man in Infinity War?", "Tom Holland", 200);
		// Complete the code in the askQuestion() method. When you play the game, the score should change.
}
		// If the buttonPressed was the secondButton
if(buttonPressed==secondButton) {
			// Call the askQuestion() method with a harder question
askQuestion("How many majors has Tiger woods won?", "15", 400);
}
if(buttonPressed==thirdButton) {
	askQuestion("How many Chrises in infinity war?", "4", 600);
}
if(buttonPressed==fourthButton) {
	askQuestion("what was the first flavor of icecream?", "Vanilla", 800);
}
if(buttonPressed==fifthButton) {
	askQuestion("What year did the first olympics take place?", "1896", 1000);
}
		// Clear the text on the button that was pressed (set the button text to nothing)
buttonPressed.setText(" ");
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		
		// Remove this temporary message and replace it with a pop-up that asks the user the question
	String answer = JOptionPane.showInputDialog(question);
		
		// Stop the theme music when they have entered their response. Hint: use the sound variable 
		
		// If the answer is correct
if(answer.equalsIgnoreCase(correctAnswer)) {
			// Increase the score by the prizeMoney
score = score + prizeMoney;
			// Pop up a message to tell the user they were correct
JOptionPane.showMessageDialog(null, "you are correct!");
}
else {
		// Otherwise
score = score - prizeMoney;
			// Decrement the score by the prizeMoney
JOptionPane.showMessageDialog(null, "you are incorrect. The correct answer is " + correctAnswer);
			// Pop up a message to tell the user they were wrong and give them the correct answer
}
		// Call the updateScore() method

updateScore();
	}

	public void playJeopardyTheme() {
		try {
			sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
