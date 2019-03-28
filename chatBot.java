import javax.swing.JOptionPane;

public class chatBot {

	public static void main(String[] args) {
		
		String userInput;
		String userName;
		int a = 1;
		
		JOptionPane.showMessageDialog(null, "Welcome to the Chatterbot");
		
		userName = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello "+userName+"!");
		
		do {
			userInput = JOptionPane.showInputDialog("What do you like about IT? eg. Programming, Networking, Hacking, Hardware, People");
			if (userInput.toLowerCase().contains("?".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions "+userName+"!");
				
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
				JOptionPane.showMessageDialog(null, "Hardware engineering is fun but can be very costly");
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
				JOptionPane.showMessageDialog(null, "I will be asking the questions "+userName+"!");
	
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
			} else if (userInput.toLowerCase().contains("Bike".toLowerCase())) {
				userInput = JOptionPane.showInputDialog("How far do you have to ride? (in kilometres)");
				int userDistance = Integer.parseInt(userInput);
				if (userDistance > 5) {
					JOptionPane.showMessageDialog(null, "Wow, thats quite a distance");
				} else if (userDistance < 5) {
					JOptionPane.showMessageDialog(null, "Ah okay thats not too far");
				}
				a++;
			}
			
		} while (a == 1);
		a--;
		
		do {
			userInput = JOptionPane.showInputDialog("Where do you like to study?");
			if (userInput.toLowerCase().contains("?")) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions "+userName+"!");
				
			} else if (userInput.toLowerCase().contains("Library".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Thats a great place to study, mainly because its quiet");
				a++;
			} else if (userInput.toLowerCase().contains("University".toLowerCase())) {
				userInput = JOptionPane.showInputDialog(null, "What number building? i personally like 10");
				JOptionPane.showMessageDialog(null, "Building "+userInput+" is great!");
				a++;
			} else if (userInput.toLowerCase().contains("RMIT".toLowerCase())) {
				userInput = JOptionPane.showInputDialog(null, "What number building? i personally like 10");
				JOptionPane.showMessageDialog(null, "Building "+userInput+" is great!");
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
			userInput = JOptionPane.showInputDialog("Which operating system do you use?");
			if (userInput.toLowerCase().contains("?")) {
				JOptionPane.showMessageDialog(null, "I will be asking the questions "+userName+"!");
				
			} else if (userInput.toLowerCase().contains("Windows".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Windows is great!");
				a++;
			
			} else if (userInput.toLowerCase().contains("Mac".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "I was created on a mac!");
				a++;
				
			} else if (userInput.toLowerCase().contains("Linux".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Not many people use linux");
				a++;
				
			} else if (userInput.toLowerCase().contains("Ubuntu".toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Wow, you're a dinosaur");
				a++;
			}
			
		} while (a == 1);
		a--;
	}
		
}
