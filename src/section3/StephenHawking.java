package section3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	
	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		
	
	// 4. Use a for loop to repeat steps #2 and #3, a lot of times
		String adjective =JOptionPane.showInputDialog("Please enter an adjective");
		String liquid =JOptionPane.showInputDialog("Please enter a liquid");
		String bodypart =JOptionPane.showInputDialog("Please enter a body part");
		String verb =JOptionPane.showInputDialog("Please enter a verb");
		String place =JOptionPane.showInputDialog("Please enter a place");
		String sentance= "Piranhas are more "+ adjective+ " during the day, so cross the river at night. Piranhas are attracted to \n fresh "+ liquid+ " and will most likely take a bite out of your "+ bodypart+ " if you "+ verb+ ". Whatever you do, if you have an open wound, try to find another way to get back to the "+ place+ ". Good luck!";
	// 2. ask the user for a sentence
	//	String sentance =JOptionPane.showInputDialog("please write a sentance");
	// 3. call the speak method below and send it the sentence
		speak(sentance);
	}
	

	
	
	
	
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
