import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {

		Scanner sncr = new Scanner(System.in);

		String userWord;
		String anotherLine;

		// "" meaning any word
		String firstPart = ("");
		String secondPart = ("");

		System.out.println("Welcome to the Pig Latin Translator!");

		System.out.println("=====================================");

		do {

			System.out.println("Please enter a line to be translated: ");

			// Getting the input from the user
			userWord = sncr.nextLine();
			System.out.println();

			// making all the letters lower case
			String userWordLowerCase = userWord.toLowerCase();

			// used if user word in lower case starts with a vowel then add "way"
			for (int i = 0; i < userWordLowerCase.length(); i++) {
				if ((userWordLowerCase.charAt(0) == 'a') || (userWordLowerCase.charAt(0) == 'e')
						|| (userWordLowerCase.charAt(0) == 'i') || (userWordLowerCase.charAt(0) == 'o')
						|| (userWordLowerCase.charAt(0) == 'u')) {
					System.out.println(userWordLowerCase + "way");
					System.out.println();
					break;
				}
				// used if user word starts with a consonant then moving the consonants to the
				// end of the word with "ay"
				else if ((userWordLowerCase.charAt(i) == 'a') || (userWordLowerCase.charAt(i) == 'e')
						|| (userWordLowerCase.charAt(i) == 'i') || (userWordLowerCase.charAt(i) == 'o')
						|| (userWordLowerCase.charAt(i) == 'u')) {
					firstPart = userWordLowerCase.substring(i);
					secondPart = userWordLowerCase.substring(0, i);
					System.out.println(firstPart + secondPart + "ay");
					break;
				}

			}

			// Checking to see if user wants to enter another word
			System.out.println("Do you want to translate another word? (y/n)");
			anotherLine = sncr.nextLine();
			System.out.println();

		} while (anotherLine.equals("y") || anotherLine.equals("Y"));

		sncr.close();
	}
}
