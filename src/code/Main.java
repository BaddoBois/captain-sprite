package code;

import javax.swing.*;
import java.awt.*;

public class Main {
	
	public boolean gameStarted;
	
	public static void main(String[] args) {
		
		// Make JFrame
		JFrame window = new JFrame("Captain Sprite");
		
		// What happens when you press the X
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// Window size
		window.setBounds(1280, 720, 1280, 720);
		
		// Image
		JLabel image = new JLabel(new ImageIcon("./assets/AAA.png"));
		image.setBounds(1280, 780, 1280, 720);
		image.setVisible(true);
		window.add(image);
		
		// Display the window
		window.setVisible(true);
		
	}
	
}