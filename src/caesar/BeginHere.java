package caesar;

import javax.swing.JOptionPane;

public class BeginHere {

	static String message;

	public static void main(String[] args) {

		int goAgain = 0;

		while (goAgain == 0) {
			Object[] selectionsArray = { "Encoder", "Decoder", "Cracker", "Exit" };
			String showFirst = "Encoder";
			String selection = (String) JOptionPane.showInputDialog(null, "Message: Select a Utility: ",
					"Title: Doug's Example", JOptionPane.PLAIN_MESSAGE, null, selectionsArray, showFirst);
			if (selection == null)
				selection = "cancelled";
			JOptionPane.showMessageDialog(null, "You have selected: " + selection);

			switch (selection) {
			case "Encoder":
				CaesarCipher myCipher = new CaesarCipher();

				message = "Please enter the plain text to encode:";
				String plainText = JOptionPane.showInputDialog(message).toLowerCase();

				message = "Please enter the key:";
				int key = Integer.parseInt(JOptionPane.showInputDialog(message));
				message = "Your key is: " + key;

				String codedText = myCipher.encode(plainText, key);
				message = "Your secret message is: " + codedText;
				JOptionPane.showMessageDialog(null, message);
				break;

			case "Decoder":
				JOptionPane.showMessageDialog(null, "DECODER SWITCH BLOCK ADD CODE");
				break;

			case "Cracker":
				JOptionPane.showMessageDialog(null, "CRACKER SWITCH BLOCK ADD CODE");
				break;

			case "Exit":
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "DEFAULT SWITCH BLOCK ADD CODE");
				break;
			}
			message = "Do you want to go again?";
			goAgain = JOptionPane.showConfirmDialog(null, message);
		}

	}

}

/*
 * grade checkpoint
 * 
 * 1.encoding JOP jar file do you want to encode decode or crack? ask plain text
 * msg ask for key display encoded message ask if you want to do another msg
 * graceful exit or go again 2.decoding 3.cracking
 * 
 * 
 */