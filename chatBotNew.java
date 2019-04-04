import javax.swing.JOptionPane;

public class chatBotNew {

	public static void main(String[] args) {

		String userInput;
		String qDetection;
		String userWork;
		String userUni;
		String userIT;

		String userName;
		int a = 1;

		JOptionPane.showMessageDialog(null, "Welcome to the Chatterbot");

		userName = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + userName + "!");

        do {
			userInput = JOptionPane.showInputDialog("So, what would you like to talk about today "+userName+"?");
			if (userInput.toLowerCase().contains("?")) {
				qDetection = JOptionPane.showInputDialog("I will be asking the questions "+userName+"!");
			} else if (userInput.toLowerCase().contains("Uni".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about university?");

			} else if (userInput.toLowerCase().contains("IT".toLowerCase())) {
				userIT = JOptionPane.showInputDialog("What do you like about IT?");

			} else if (userInput.toLowerCase().contains("Programming".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about programming?");

			} else if (userInput.toLowerCase().contains("Java".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about Java?");

			} else if (userInput.toLowerCase().contains("Sports".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about sports?");

			} else if (userInput.toLowerCase().contains("Hacking".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about University?");
				
			} else if (userInput.toLowerCase().contains("Hacking".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about University?");

			} else if (userInput.toLowerCase().contains("Hacking".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about University?");

			} else if (userInput.toLowerCase().contains("Hacking".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about University?");

			}
            
		} while (a == 1);
		a--;
	}
}