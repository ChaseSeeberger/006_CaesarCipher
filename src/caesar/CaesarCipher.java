package caesar;

import javax.swing.JOptionPane;

public class CaesarCipher {
	
	private String alpha = "abcdefghijklmnopqrstuvwyxz";

	public String encode(String plainText) {
		String message = "";
		int encodeKey = 0;
		int Key2 = 0;
		
		message = "please enter the key: ";
		String key = JOptionPane.showInputDialog(message);
		
		message = "your key is: " + key;
		JOptionPane.showMessageDialog(null, message);
		Integer.parseInt(key);
		
		System.out.println("test, aplha length = " + alpha.length());
		System.out.println("test, first char is " + alpha.charAt(0));
		System.out.println("test, last char is " + alpha.charAt(alpha.length()-1));
		
		for(int i = 0; i < alpha.length(); i++) {
			System.out.println(alpha.charAt(i));
		}
		
		System.out.println("\n \n");
		
		for(int i = 0; i < plainText.length(); i++) {
			encodeKey = i + Key2;
			System.out.println(plainText.charAt(encodeKey));
		}
		
		
		return plainText;
	}

}
