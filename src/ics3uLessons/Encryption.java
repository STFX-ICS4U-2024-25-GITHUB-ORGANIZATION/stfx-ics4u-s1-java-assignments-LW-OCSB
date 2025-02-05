package ics3uLessons;

public class Encryption {

	public static void main(String[] args) {
	
		// variables
		char myChar = 'f';
		System.out.println(myChar);

		// cast char to int
		System.out.println((int)myChar);
		System.out.println((int)'s');
		System.out.println((int)'G');
		
		
		// DECRYPTION EXAMPLE
		String secretMessage = "ecv";
		int decryptionKey = -2;
		String decryptedMessage = "";
		
		// first letter in secretMessage
		System.out.println(secretMessage.charAt(0));
		System.out.println((int)secretMessage.charAt(0));
		
		// convert first letter to ascii, shift, save to variable
		int temp = (int)secretMessage.charAt(0) - decryptionKey;

		// cast shifted ascii to char, concatenate to decryptedMessage
		decryptedMessage = decryptedMessage + ((char)temp);
		System.out.println(decryptedMessage);
	}
}
