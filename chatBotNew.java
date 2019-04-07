import java.util.Arrays;

import javax.swing.JOptionPane;

public class chatBot {
	public static void main(String[] args) {

			String userName;
			String strSize;
			String userInput;
			int a = 1;

			JOptionPane.showMessageDialog(null, "Welcome to the ChatBot"); // Introductory Phase
			userName = JOptionPane.showInputDialog("What is your name?"); // Introductory Phase
			JOptionPane.showMessageDialog(null, "Hello "+userName+"!"); // Introductory Phase

			do {
				strSize = JOptionPane.showInputDialog("How many keywords would you like? (1 - 10)");
				int arraySize = Integer.parseInt(strSize);

				if (arraySize == 1) {
					Object[] userInputs = new Object[1];
					String arrayInput = JOptionPane.showInputDialog("Keyword 1: ");
					userInputs[0] = arrayInput;
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 2) {
					Object[] userInputs = new Object[2];
					String arrayInput = JOptionPane.showInputDialog("Keyword 1: ");
					String arrayInput2 = JOptionPane.showInputDialog("Keyword 2: ");
					userInputs[0] = arrayInput;
					userInputs[1] = arrayInput2;
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 3) {
					Object[] userInputs = new Object[3];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 4) {
					Object[] userInputs = new Object[4];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					userInputs[3] = "Java";
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 5) {
					Object[] userInputs = new Object[5];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					userInputs[3] = "Java";
					userInputs[4] = "Sports";
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 6) {
					Object[] userInputs = new Object[6];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					userInputs[3] = "Java";
					userInputs[4] = "Sports";
					userInputs[5] = "Food";
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 7) {
					Object[] userInputs = new Object[7];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					userInputs[3] = "Java";
					userInputs[4] = "Sports";
					userInputs[5] = "Food";
					userInputs[6] = "Work";
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 8) {
					Object[] userInputs = new Object[8];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					userInputs[3] = "Java";
					userInputs[4] = "Sports";
					userInputs[5] = "Food";
					userInputs[6] = "Work";
					userInputs[7] = "School";
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 9) {
					Object[] userInputs = new Object[9];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					userInputs[3] = "Java";
					userInputs[4] = "Sports";
					userInputs[5] = "Food";
					userInputs[6] = "Work";
					userInputs[7] = "School";
					userInputs[8] = "Music";
					System.out.println(Arrays.toString(userInputs));
					a--;
					
				} else if (arraySize == 10) {
					Object[] userInputs = new Object[10];
					userInputs[0] = "Uni";
					userInputs[1] = "IT";
					userInputs[2] = "Programming";
					userInputs[3] = "Java";
					userInputs[4] = "Sports";
					userInputs[5] = "Food";
					userInputs[6] = "Work";
					userInputs[7] = "School";
					userInputs[8] = "Music";
					userInputs[9] = "Driving";
					System.out.println(Arrays.toString(userInputs));

					userInput = JOptionPane.showInputDialog("What would you like to talk about today "+userName+"?");
					if (userInput.toLowerCase().contains("?")) {
						JOptionPane.showMessageDialog(null, "I will be asking the questions "+userName+"!");
					} else if (Arrays.asList(userInputs).contains(userInput)) {
						System.out.println("Detected");
					}
				} else {
					JOptionPane.showMessageDialog(null, "That is not a valid input "+userName+"!");
				}
			} while (a == 1);
	}
}