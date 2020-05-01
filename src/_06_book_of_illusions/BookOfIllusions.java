package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame frame = new JFrame();


String imageTwoURL = "https://www.amnh.org/var/ezflow_site/storage/images/media/amnh/images/explore/ology-images/brain/optical-illusions/op-illusions-listing-hero/3877180-1-eng-US/op-illusions-listing-hero_facebookshare_1200.jpg";
	public void run() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(500, 500);
		// 4. find 2 images and save them to your project’s default package

		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
	    
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel label;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		String imageOneURL = "https://i.pcmag.com/imagery/lineups/02TX6vdBn8dTTVibDmu94JE-1..v_1569492701.jpg";
	    label = loadImageFromComputer(imageOneURL);
		// 8. add your JLabel to the frame
	    frame.add(label);
		// 9. call the pack() method on the frame
	    
		// 10. add a mouse listener to your frame (hint: use *this*)
	    frame.addMouseListener(this);
	    frame.pack();
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");
		// 12. remove everything from the frame that was added earlier
		frame.removeAll();
		JLabel newLabel;
		// 13. load a new image like before (this is more than one line of code)
		newLabel = loadImageFromComputer(imageTwoURL);
		frame.add(newLabel);
		// 14. pack the frame
		frame.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


