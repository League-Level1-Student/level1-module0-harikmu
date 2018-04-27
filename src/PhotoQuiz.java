
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String image = ("https://img.purch.com/h/1400/aHR0cDovL3d3dy5saXZlc2NpZW5jZS5jb20vaW1hZ2VzL2kvMDAwLzA4OS85NjAvb3JpZ2luYWwvY29tbW9uLW9jdG9wdXMuanBn");
		// 2. create a variable of type "Component" that will hold your image
		Component imageHolder;
		// 3. use the "createImage()" method below to initialize your Component
		imageHolder = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(imageHolder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String o = JOptionPane.showInputDialog("How many tentacles does an octopus have?");
		// 7. print "CORRECT" if the user gave the right answer
		if (o.equals("8")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(imageHolder);
		// 10. find another image and create it (might take more than one line of code)
		String image2 = ("https://img.aws.livestrongcdn.com/ls-article-image-673/ds-photo/getty/article/144/172/484499602.jpg");
		Component imageHolder2;
		imageHolder2 = createImage(image2);
		// 11. add the second image to the quiz window
		quizWindow.add(imageHolder2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String d = JOptionPane.showInputDialog("What is the name of this fruit?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (d.equals("Dragonfruit")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
