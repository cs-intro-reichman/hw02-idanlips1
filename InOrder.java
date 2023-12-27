/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		/// Write your code here
		int firstNumber = (int) (Math.random() * 10);
		System.out.print(firstNumber + " ");
		int randomNumber = (int) (Math.random() * 10);
		while (randomNumber >= firstNumber) {
			System.out.print(randomNumber + " ");
			firstNumber = randomNumber;
			randomNumber = (int) (Math.random() * 10);
		}
	}
}
