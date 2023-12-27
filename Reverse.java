/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		//// Put your code here
		String word = args[0];
		String reverseWord = "";
		int i = word.length() - 1;
		while (i >= 0) {
			char c = word.charAt(i);
			reverseWord = reverseWord + c;
			i--;
		}
		char middleCharacter = reverseWord.charAt((reverseWord.length() / 2));
		System.out.println(reverseWord);
		System.out.println("The middle character is " + middleCharacter);
	}
}
