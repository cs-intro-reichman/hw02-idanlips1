/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		//// Put your code here
		int numOfExperiments = Integer.parseInt(args[0]);
		double birth = Math.random();
		int numOfBoys = 0;
		int numOfGirls = 0;
		int numOfKids = 0;
		int familiesTwo = 0;
		int familiesThree = 0;
		int familiesFour = 0;
		double sumOfKids = 0;
		for (int i = 0; i <= numOfExperiments; i++) {
			numOfBoys = 0;
			numOfGirls = 0;
			numOfKids = 0;
			while (numOfGirls < 1 || numOfBoys < 1) {
				if (birth < 0.5) {
					numOfBoys++;
				} else if (birth > 0.5) {
					numOfGirls++;
				}
				birth = Math.random();
				numOfKids++;
			}
			sumOfKids += numOfKids;
			if (numOfKids == 2) {
				familiesTwo++;
			} else if (numOfKids == 3) {
				familiesThree++;
			} else if (numOfKids >= 4) {
				familiesFour++;
			}

		}
		double average = (sumOfKids / numOfExperiments);
		int max = (int) Math.max(familiesTwo, (int) Math.max(familiesThree, familiesFour));
		System.out.println("Average : " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesTwo);
		System.out.println("Number of families with 3 children: " + familiesThree);
		System.out.println("Number of families with 4 or more children: " + familiesFour);
		if (max == familiesTwo) {
			System.out.println("The most common number of children is 2");
		} else if (max == familiesThree) {
			System.out.println("The most common number of children is 3");
		} else {
			System.out.println("The most common number of children is 4 or more");
		}

	}
}
