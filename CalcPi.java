// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {

		int lenOfSequence = Integer.parseInt(args[0]);
		double sum = 0;
		
		// loop that sums the sequence of odd number inverses
		for (int i = 0; i < lenOfSequence; i++) {
			// checks if even or odd placement of the sequence
			// then adds or substracts accordingly
			if (i % 2 == 0) {
				sum += 1 / ((double) 2 * i + 1);
			} else {
				sum -= 1 / ((double) 2 * i + 1);
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4 * sum);
	}
}
