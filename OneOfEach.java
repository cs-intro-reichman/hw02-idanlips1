/*
#feedback

1. Please pay attention that your code doesn’t handle a case where you get the value 0.5.
could be fixed by changing one of the conditions to <= instead of <.
*/



/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		//// Put your code here
		double birth = Math.random();
		int numOfBoys = 0;
		int numOfGirls = 0;
		int numOfKids = 0;
		while (numOfGirls < 1 || numOfBoys < 1 ) {
			if (birth < 0.5) {
				System.out.print("b ");
				numOfBoys++;
			} else if (birth > 0.5) {
				System.out.print("g ");
				numOfGirls++;
			}
			birth = Math.random();
			numOfKids++;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + numOfKids + " children");
	}
}
