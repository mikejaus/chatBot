import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		
		String userInput;
		String userName;
		int a = 1;
		
		JOptionPane.showMessageDialog(null, "Welcome to the Chatterbot");
		userName = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello "+userName+"!");
		
		do {
			userInput = JOptionPane.showInputDialog("What do you like about IT?");
			if (userInput.toLowerCase().contains("?".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions"+userName+"!");
				
			} else if (userInput.toLowerCase().contains("Programming".toLowerCase())) {
				userInput = JOptionPane.showInputDialog("What language of programming is your favorite?");
				JOptionPane.showMessageDialog(null, "I like "+userInput+" too!");
				a++;
				
			} else if (userInput.toLowerCase().contains("Hacking".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Make sure its white hat!");
				a++;
				
			} else if (userInput.toLowerCase().contains("Network".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Networking can be difficult, but very fun");
				a++;
				
			} else if (userInput.toLowerCase().contains("Hardware".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Hardware engineers are smart");
				a++;
			} else if (userInput.toLowerCase().contains("People".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "People skills are great to have in the IT industry");
				a++;
			}
		} while (a == 1);
		a--;
		
		do {
			userInput = JOptionPane.showInputDialog("How do you get to uni? e.g. Car, Tram, etc...");
			if (userInput.toLowerCase().contains("?")) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions"+userName+"!");
	
			} else if (userInput.toLowerCase().contains("Car".toLowerCase())) {
				userInput = JOptionPane.showInputDialog("How many years have you been driving?");
				JOptionPane.showMessageDialog(null, "Nice!");
				a++;
			} else if (userInput.toLowerCase().contains("Tram".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "That must be crowded");
				a++;
			} else if (userInput.toLowerCase().contains("Train".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "That must be crowded");
				a++;
			} else if (userInput.toLowerCase().contains("Walk".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Nice! You are healthier than most");
				a++;
			} else if (userInput.toLowerCase().contains("Run".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Nice! You must excercise alot");
				a++;
			}
			
		} while (a == 1);
		a--;
		
		do {
			userInput = JOptionPane.showInputDialog("Where do you like to study?");
			if (userInput.toLowerCase().contains("?")) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions"+userName+"!");
				
			} else if (userInput.toLowerCase().contains("Library".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Thats a great place to study, mainly because its quiet");
				a++;
			} else if (userInput.toLowerCase().contains("University".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Thats a great place to study, mainly because its quiet");
				a++;
			} else if (userInput.toLowerCase().contains("RMIT".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Thats a great place to study, mainly because its quiet");
				a++;
			} else if (userInput.toLowerCase().contains("Home".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Being at home makes you more relaxed but you can also get distracted easily");
				a++;
			} else if (userInput.toLowerCase().contains("House".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Being at home makes you more relaxed but you can also get distracted easily");
				a++;
			} else if (userInput.toLowerCase().contains("Room".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Being at home makes you more relaxed but you can also get distracted easily");
				a++;
			} else if (userInput.toLowerCase().contains("Bed".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Comfy!");
				a++;
			} else if (userInput.toLowerCase().contains("Outside".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Being outside is great, fresh air and quiet so you can focus");
				a++;
			}
			
		} while (a == 1);
		a--;
		
		do {
			userInput = JOptionPane.showInputDialog("Question");
			if (userInput.toLowerCase().contains("Field".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Phrase");
			}
			
			
		} while (a == 1);
			
	}
		
}
