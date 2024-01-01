import java.util.Random;

public class OneOfEachStats {
	public static void main(String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
		Random generator = new Random(seed);
		double birth = generator.nextDouble();
		int numOfBoys = 0;
		int numOfGirls = 0;
		int numOfKids = 0;
		int familiesTwo = 0;
		int familiesThree = 0;
		int familiesFour = 0;
		double sumOfKids = 0;
		for (int i = 0; i < T; i++) {
			numOfBoys = 0;
			numOfGirls = 0;
			numOfKids = 0;
			while (numOfGirls < 1 || numOfBoys < 1) {
				if (birth < 0.5) {
					numOfBoys++;
				} else if (birth > 0.5) {
					numOfGirls++;
				}
				birth = generator.nextDouble();
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
		double average = (sumOfKids / T);
		int max = (int) Math.max(familiesTwo, (int) Math.max(familiesThree, familiesFour));
		System.out.println("Average : " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesTwo);
		System.out.println("Number of families with 3 children: " + familiesThree);
		System.out.println("Number of families with 4 or more children: " + familiesFour);
		if (max == familiesTwo) {
			System.out.println("The most common number of children is 2.");
		} else if (max == familiesThree) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}

}
