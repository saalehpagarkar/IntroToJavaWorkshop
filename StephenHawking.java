package day3;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {

		// 2. ask the user for a sentence
		String ans2 = JOptionPane.showInputDialog("Type a sentence");
		// 3. call the speak method below and send it the sentence
		speak(ans2);
		// 4. repeat steps 2 and 3 a lot of times
		// 2.
		String ans = JOptionPane.showInputDialog("Type a sentence");
		// 3.

	}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}