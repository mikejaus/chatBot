import javax.swing.JOptionPane;

public class chatBotNew {

	public static void main(String[] args) {

		String userInput;
		String qDetection;
		String userUni;
		String userIT;
		String userProgramming;
		String userJava;
		String userSports;
		String userFood;
		String userWork;
		String userSchool;
		String userMusic;

		String userName;
		int a = 1;

		String[] userInputs = { "Uni", "IT", "Programming", "Java", "Sports", "Food", "Work", "School", "Music"};
		String inputDetect = userInput;
		boolean detected;


		for (String element:userInputs ) {
			if (element.equals(inputDetect)) {
				detected = true;
			}
		}

		JOptionPane.showMessageDialog(null, "Welcome to the Chatterbot");
		userName = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + userName + "!");

        do {
			userInput = JOptionPane.showInputDialog("What would you like to talk about today "+userName+"?");
			if (userInput.toLowerCase().contains("?")) {
				qDetection = JOptionPane.showInputDialog("I will be asking the questions "+userName+"!");
			} else if (userInput.contains("Uni".toLowerCase())) {
				userUni = JOptionPane.showInputDialog("What do you like about university?");

			} else if (userInput.toLowerCase().contains("IT".toLowerCase())) {
				userIT = JOptionPane.showInputDialog("What do you like about IT?");

			} else if (userInput.toLowerCase().contains("Programming".toLowerCase())) {
				userProgramming = JOptionPane.showInputDialog("What do you like about programming?");

			} else if (userInput.toLowerCase().contains("Java".toLowerCase())) {
				userJava = JOptionPane.showInputDialog("What do you like about Java?");

			} else if (userInput.toLowerCase().contains("Sports".toLowerCase())) {
				userSports = JOptionPane.showInputDialog("What do you like about sports?");

			} else if (userInput.toLowerCase().contains("Food".toLowerCase())) {
				userFood = JOptionPane.showInputDialog("What do you like about food?");
				
			} else if (userInput.toLowerCase().contains("Work".toLowerCase())) {
				userWork = JOptionPane.showInputDialog("What do you like about work?");

			} else if (userInput.toLowerCase().contains("School".toLowerCase())) {
				userSchool = JOptionPane.showInputDialog("What do you like about school?");

			} else if (userInput.toLowerCase().contains("Music".toLowerCase())) {
				userMusic = JOptionPane.showInputDialog("What do you like about music?");

			}
            
		} while (a == 1);
		a--;
	}
}