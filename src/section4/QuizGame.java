package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0;
		// 2.  Ask the user a question 
		String answer =JOptionPane.showInputDialog("what is the square route of 144");
		// 3.  Use an if statement to check if their answer is correct
		if (answer .equals ("12")) {
			JOptionPane.showMessageDialog(null,"correct");
			score++;
		}else {
			JOptionPane.showMessageDialog(null,"incorrect");
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		String response =JOptionPane.showInputDialog("what is 1+2+3+4+5");
		if (response .equals ("15")) {
			JOptionPane.showMessageDialog(null,"correct");
			score++;
		}else {
			JOptionPane.showMessageDialog(null,"incorrect");
		}
		String number =JOptionPane.showInputDialog("what is (9x8)-(5x4)");
		if (number .equals ("52")) {
			JOptionPane.showMessageDialog(null,"correct");
			score++;
		}else {
			JOptionPane.showMessageDialog(null,"incorrect");
	}
		String letter =JOptionPane.showInputDialog("what is the square route of 1+2+3+4+5+6+7+8");
		if (letter .equals ("6")) {
			JOptionPane.showMessageDialog(null,"correct");
			score++;
		}else {
			JOptionPane.showMessageDialog(null,"incorrect");
		}
		JOptionPane.showMessageDialog(null,"your score is "+ score);
}
}