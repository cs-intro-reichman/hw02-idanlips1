/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		//// Put your code here
		int x = Integer.parseInt(args[0]);
		int divisor = 1;
		int sumOfDivisors = 0;
		String perfectNumber = (x + " is a perfect number since " + x + " = ");
		while (divisor < x) {
			if (x % divisor == 0) {
				perfectNumber = perfectNumber + divisor;
				sumOfDivisors = sumOfDivisors + divisor;
				if (sumOfDivisors < x) {
					perfectNumber = perfectNumber + " + ";
				}

			}
			divisor++;
		}
		if (sumOfDivisors == x) {
			System.out.println(perfectNumber);
		} else {
			System.out.println(x + " is not a perfect number");
		}

	}
}
