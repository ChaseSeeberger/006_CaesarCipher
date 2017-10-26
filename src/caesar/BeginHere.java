package caesar;

import java.util.Scanner;

public class BeginHere {
	
	static Scanner kbd = new Scanner(System.in);
	
	public static void main(String[] args) {

		CaesarCipher myCipher = new CaesarCipher();
		
		System.out.println("Please enter the plain text to encode:");
		String plainText = kbd.nextLine().toLowerCase();
		
		System.out.println("Please enter the key:");
		int key = kbd.nextInt();
		System.out.println("Your key is: " + key);
		
		String codedText = myCipher.encode(plainText, key);
		System.out.println("Your secret message is: " + codedText);
		

	}

}

/*grade checkpoint 
 * 
 * 1.encoding
 * 	JOP
 * 	jar file
 * 	do you want to encode decode or crack?
 * 	ask plain text msg
 * 	ask for key
 * 	display encoded message
 * 	ask if you want to do another msg
 * 	graceful exit or go again
 * 2.decoding
 * 3.cracking 
 * 
 * 
 */