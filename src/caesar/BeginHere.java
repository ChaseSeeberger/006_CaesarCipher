package caesar;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		CaesarCipher myCipher = new CaesarCipher();
		String message = "";
		
		message = "Please enter the plain text to encode:";
		String plainText = JOptionPane.showInputDialog(message);
		
		String codedText = myCipher.encode(plainText);
		JOptionPane.showMessageDialog(null, codedText);
		
	}

}
