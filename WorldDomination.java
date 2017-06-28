package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args, Object ans) {
		// 1. Ask the user if they know how to write code.
		JOptionPane.showMessageDialog(null, "Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (ans.equals("Yes"))
			;
		{
			String ans = JOptionPane.showInputDialog("You will rule the world");
			// 3. Otherwise, wish them good luck washing dishes.
			if (ans.equals("no"))
				;
			String ans = JOptionPane.showInputDialog("Good luck washing dishes");
		}
	}
}
