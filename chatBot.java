import javax.swing.JOptionPane;

public class chatBot {
	public static void main(String[] args) { // The overall idea of this program is to let the user choose keywords and
												// then respond to those keywords accordingly.

		String userName; // Stores the users name for later use in the program
		String strSize; // Storing the array as a string before converting to integer
		String userInput; // String used for user inputs
		int a = 1;

		JOptionPane.showMessageDialog(null, "Welcome to the ChatBot"); // Introductory Phase
		userName = JOptionPane.showInputDialog("What is your name?"); // Introductory Phase
		JOptionPane.showMessageDialog(null, "Hello " + userName + "!"); // Introductory Phase

		strSize = JOptionPane.showInputDialog("How many keywords would you like?");
		int arraySize = Integer.parseInt(strSize); // parsing the string to an integer so it can be used for the array
													// size. this is what lets the user choose the array size
		String[] keywords = new String[arraySize]; // Creating the keywords array with the 'arraySize' integer
													// determining the size, this is obtained with the user input, then
													// made into an integer, as you can see above.

		for (int i = 0; i < keywords.length; i++) { // Loops through this until the length of the defined array is
													// filled, this took a while to understand
			keywords[i] = JOptionPane.showInputDialog("Enter next keyword: ");
			// System.out.println(Arrays.toString(keywords)); used for debugging and to see
			// visually that the code was working
		}

		do { // do-while loop for repetition until user cancels the program. i have setup an
				// integer of a to equal 1 so that i can break the loop if a certain if
				// statement is completed.
			userInput = JOptionPane.showInputDialog("What would you like to talk about?"); // Getting user input
			for (int i = 0; i < keywords.length; i++) { // a for loop checking every spot in the keywords array for the
														// user input. once it hits the array size it stops.

				if (keywords[i].equals(userInput)) { // if a value from the user input is found inside the array, it
														// prints the message
					userInput = JOptionPane.showInputDialog("What do you like about " + userInput + "?");
				}
			}
			if (userInput.toLowerCase().contains("?")) { // Checking if the users input contains a ?, this works on both
															// questions and loops accordingly.
				JOptionPane.showMessageDialog(null, "I will be asking the questions " + userName + "!");
			}
		} while (a == 1); // Checking if my integer value of 'a' still equals 1, if so, it will loop back
							// around. If not, the program ends.
	}
}

// BUGS
// There are no bugs in the final version of the program which is great. It took
// me a while to fix most of the bugs while still following the spec sheet but
// im happy with the final result.
// For comparison, my code was messy before this version with around 200 lines
// of code. Now it is compressed to 42 lines with no bugs