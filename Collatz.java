// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

	    int seedsToGoOver = Integer.parseInt(args[0]);
		String mode = args[1];

		// edge case where input isn't valid (not verbose or concise)
		if (!mode.equals("c") && !mode.equals("v")){
			throw new IllegalArgumentException("Invalid mode: " + mode);
		}

		// nested loop which goes over all seeds from 1-N
		// then it prints all the sequences if verbose else only the summary
		for (int j = 0; j < seedsToGoOver; j++) {
			int i = j+1;
			int count = 1;
			// we must include the first run at the very least
			// that is for the first seed and the count starting from 1 is also needed
			// otherwise we would have to do some junky additions later on
			while (i != 1 || count <= 1) {
				if (mode.equals("v")) {
					System.out.print(i + " ");
				}
				// even or odd rules for the sequence
				if (i%2 != 0) {
					i *= 3;
					i++;
				} else {
					i /= 2;
				}
				count++;
				
			}
			if (mode.equals("v")) {
				// As the inner loop ends when i reaches 1
				// we need to print the 1 at the end and the count after it
				System.out.print("1 ");
				System.out.print("(" + count + ")");
				System.out.println();
			}
		}
		System.out.println("Every one of the first " + seedsToGoOver + " hailstone sequences reached 1.");
	}
}
