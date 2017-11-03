package caesar;

public class CaesarCipher {

	public String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.:'";

	public String encode(String plainText, int key) {
		String secretText = "";
		int index, keyAdded = 0;
		for (int i = 0; i < plainText.length(); i++) {
			if (plainText.charAt(i) != ' ') {
				index = alpha.indexOf(plainText.charAt(i));
				keyAdded = (index + key) % alpha.length();
				secretText = secretText + alpha.charAt(keyAdded);
			} else {
				secretText = secretText + " ";
			}
		}
		return secretText;
	}

	public String decode(String plainText, int key) {
		String secretText = "";
		int index, keyAdded = 0;
		for (int i = 0; i < plainText.length(); i++) {
			if (plainText.charAt(i) != ' ') {
				index = alpha.indexOf(plainText.charAt(i));
				keyAdded = (index + key * -1) % alpha.length();
				secretText = secretText + alpha.charAt(keyAdded);
			} else {
				secretText = secretText + " ";
			}
		}
		return secretText;
	}

	public String[] cracker(String plainText) {
		String secretText = "";
		int index, keyAdded = 0;
		String[] crackerList = new String[alpha.length()];
		int key = 0;

		while (key < alpha.length()) {
			secretText = "";
			for (int i = 0; i < plainText.length(); i++) {
				if (plainText.charAt(i) != ' ') {
					index = alpha.indexOf(plainText.charAt(i));
					keyAdded = (index + key) % alpha.length();
					secretText = secretText + alpha.charAt(keyAdded);
				} else {
					secretText = secretText + " ";
				}
				crackerList[key] = secretText;
			}
			key = key + 1;
		}

		return crackerList;
	}
}