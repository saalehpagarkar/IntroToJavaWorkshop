package day3;

import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random(1).nextInt(100);
		// 2. Print out the random variable above
		System.out.println("random" + random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++)
			;
		// 1. ask the user for a guess using a pop-up window, and save their response
		String ans1 = JOptionPane.showInputDialog("guess a number from 1 to 100");
		// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int num = Integer.parseInt(ans1);
		// 5. if the guess is correct
		// 6. win
		if (ans1.equals("random"))
			;
		JOptionPane.showMessageDialog(null, "you win!");
		// 7. if the guess is high
		// 8. tell them it's too high
		if (ans1.equals("ans1>random"))
			;
		JOptionPane.showMessageDialog(null, "your answer was to high");
		// 9. if the guess is low
		// 10. tell them it's too low
		if (ans1.equals("ans1<random"))
			;
		JOptionPane.showMessageDialog(null, "you failed.>:)");
		// 12. tell them they lose
	}

}
