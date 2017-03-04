package pl.jwrabel.trainings.javaand2.algorithms;

/**
 * Created by jakubwrabel on 04.03.2017.
 */
public class Encrypting {
	public static String caesar(String text, int offset){
		if(text == null){
			return null;
		}

		char[] chars = text.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			chars[i] += offset;
		}

		return new String(chars);
	}

	public static String vigenere(String text, String password){
		char[] textChars = text.toCharArray();
		char[] originalPassword = password.toCharArray();
		char[] correctLengthPassword = new char[textChars.length];


		////////
		for (int i = 0; i < correctLengthPassword.length; i++) {
			correctLengthPassword[i] = originalPassword[i % originalPassword.length];
		}
		//// LUB
		int passwordIndex = 0;
		for (int i = 0; i < correctLengthPassword.length; i++) {
			if(passwordIndex >= originalPassword.length){
				passwordIndex=0;
			}
			correctLengthPassword[i] = originalPassword[passwordIndex];
			passwordIndex++;
		}

		// wygenerować tablicę

		// zaszyfrować


		return new String(textChars);

	}

	public static char[][] generateVigenereArray(){
		char[][] arrray = new char[26][26];

		for (int i = 0; i < arrray.length; i++) {
			for (int j = 0; j < arrray[0].length; j++) {
				arrray[i][j] = (char) (97 + (j + i) % 26);
			}
		}

		return arrray;
	}

	public static void main(String[] args) {
		char[][] chars = generateVigenereArray();
		for (char[] aChar : chars) {
			for (char c : aChar) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
