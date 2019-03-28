import javax.swing.JOptionPane;

public class BotClass {

	public static void main(String[] args) {

		String userInput;
		String userName;
		int a = 1;

		JOptionPane.showMessageDialog(null, "Welcome to the Chatterbot");

		userName = JOptionPane.showInputDialog("What is your name?"); // Asking user name input
		JOptionPane.showMessageDialog(null, "Hello " + userName + "!"); // Welcoming user

		do {
			userInput = JOptionPane.showInputDialog(
					"What do you like about IT? eg. Programming, Networking, Hacking, Hardware, People"); // 1st
																											// Question
			if (userInput.toLowerCase().contains("?".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions " + userName + "!"); // ? Input
																											// detection

			} else if (userInput.toLowerCase().contains("Programming".toLowerCase())) {
				userInput = JOptionPane.showInputDialog("What language of programming is your favorite?");
				JOptionPane.showMessageDialog(null, "I like " + userInput + " too!");
				a++; // Adding 1 to the value of a to break the while loop

			} else if (userInput.toLowerCase().contains("Hacking".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Make sure its white hat!");
				a++; // Adding 1 to the value of a to break the while loop

			} else if (userInput.toLowerCase().contains("Network".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Networking can be difficult, but very fun");
				a++; // Adding 1 to the value of a to break the while loop

			} else if (userInput.toLowerCase().contains("Hardware".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Hardware engineering is fun but can be very costly");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("People".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "People skills are great to have in the IT industry");
				a++; // Adding 1 to the value of a to break the while loop
			}
		} while (a == 1); // Checking if the variable a = 1 to continue the loop
		a--; // Initialising the value of a back to 1 for the next loop

		do {
			userInput = JOptionPane.showInputDialog("How do you get to uni? e.g. Car, Tram, Bike, Walk, etc.."); // 2nd
																													// Question
			if (userInput.toLowerCase().contains("?")) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions " + userName + "!"); // ? Input
																											// detection

			} else if (userInput.toLowerCase().contains("Car".toLowerCase())) {
				userInput = JOptionPane.showInputDialog("How many years have you been driving?");
				JOptionPane.showMessageDialog(null, "Nice!");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Tram".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "That must be crowded");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Train".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "That must be crowded");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Walk".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Nice! You are healthier than most");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Run".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Nice! You must excercise alot");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Bike".toLowerCase())) {
				userInput = JOptionPane.showInputDialog("How far do you have to ride? (in kilometres)"); // Using < and
																											// > to
																											// determine
																											// different
																											// outputs
				int userDistance = Integer.parseInt(userInput);
				if (userDistance > 5) {
					JOptionPane.showMessageDialog(null, "Wow, thats quite a distance");
				} else if (userDistance < 5) {
					JOptionPane.showMessageDialog(null, "Ah okay thats not too far");
				}
				a++; // Adding 1 to the value of a to break the while loop
			}

		} while (a == 1); // Checking if the variable a = 1 to continue the loop
		a--; // Initialising the value of a back to 1 for the next loop

		do {
			userInput = JOptionPane.showInputDialog("Where do you like to study? e.g. RMIT, Home, Bed, Library etc.."); // 3rd
																														// Question
			if (userInput.toLowerCase().contains("?")) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions " + userName + "!"); // ? Input
																											// detection

			} else if (userInput.toLowerCase().contains("Library".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Thats a great place to study, mainly because its quiet");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("University".toLowerCase())) {
				userInput = JOptionPane.showInputDialog(null, "What number building? i personally like 10"); // Will be
																												// putting
																												// "University"
																												// and
																												// "RMIT"
																												// detection
																												// into
																												// an
																												// array
				JOptionPane.showMessageDialog(null, "Building " + userInput + " is great!");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("RMIT".toLowerCase())) {
				userInput = JOptionPane.showInputDialog(null, "What number building? i personally like 10");
				JOptionPane.showMessageDialog(null, "Building " + userInput + " is great!");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Home".toLowerCase())) {
				JOptionPane.showMessageDialog(null,
						"Being at home makes you more relaxed but you can also get distracted easily"); // Will put
																										// Home, House,
																										// bed and room
																										// into its own
																										// array
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("House".toLowerCase())) {
				JOptionPane.showMessageDialog(null,
						"Being at home makes you more relaxed but you can also get distracted easily");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Room".toLowerCase())) {
				JOptionPane.showMessageDialog(null,
						"Being at home makes you more relaxed but you can also get distracted easily");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Bed".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Comfy!");
				a++; // Adding 1 to the value of a to break the while loop
			} else if (userInput.toLowerCase().contains("Outside".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Being outside is great, fresh air and quiet so you can focus");
				a++; // Adding 1 to the value of a to break the while loop
			}

		} while (a == 1); // Checking if the variable a = 1 to continue the loop
		a--; // Initialising the value of a back to 1 for the next loop

		do {
			userInput = JOptionPane.showInputDialog("Which operating system do you use?"); // 4th Question
			if (userInput.toLowerCase().contains("?")) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions " + userName + "!"); // ? Input
																											// detection

			} else if (userInput.toLowerCase().contains("Windows".toLowerCase())) {
				userInput = JOptionPane.showInputDialog("Which version of windows? e.g. 10, 8, 7, XP"); // Checking
																										// which version
																										// and giving a
																										// comment about
																										// said version
				if (userInput.toLowerCase().contains("10".toLowerCase())) {
					JOptionPane.showMessageDialog(null, "I like windows 10 aswell");
				} else if (userInput.toLowerCase().contains("8".toLowerCase())) {
					JOptionPane.showMessageDialog(null, "I like windows 8 aswell");
				} else if (userInput.toLowerCase().contains("XP".toLowerCase())) {
					JOptionPane.showMessageDialog(null, "Wow, you're a dinosaur");
				} else if (userInput.toLowerCase().contains("7".toLowerCase())) {
					JOptionPane.showMessageDialog(null, "I like windows 7 aswell");
				}
				a++; // Adding 1 to the value of a to break the while loop

			} else if (userInput.toLowerCase().contains("Mac".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "I was created on a mac!");
				a++; // Adding 1 to the value of a to break the while loop

			} else if (userInput.toLowerCase().contains("Linux".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Not many people use linux");
				a++; // Adding 1 to the value of a to break the while loop

			} else if (userInput.toLowerCase().contains("Ubuntu".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Wow, you're a dinosaur");
				a++; // Adding 1 to the value of a to break the while loop
			}

		} while (a == 1); // Checking if the variable a = 1 to continue the loop
		a--; // Initialising the value of a back to 1 for the next loop
	}

}
