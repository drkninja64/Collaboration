import Utility.References;

public class Factorial
{
	public Factorial()
	{
		boolean Redo;
		int num;
		do {
			try {
				System.out.print("\nEnter an integer: ");
				num = References.read.nextInt();
				System.out.println("Factorial = " + factorial(num));
				Redo = false;
			} catch (Exception e) {
				System.out.println("Please enter integers only");
				References.read.nextLine();
				Redo = true;
			}
		} while (Redo);
	}

	/**
	 * @param Integer is the number whose factorial is to be calculated
	 * @return Factorial if Integer is between 0 and 170 inclusive, Infinity otherwise
	 */
	private static double factorial(int Integer)
	{
		double Factorial = 1;
		if (Integer < 0 || Integer > 171)   // factorial of a negative number is infinite
			return factorial(171);          // factorial of Integer > 170 is out of range, i.e. Infinity
		for (int i = 2; i <= Integer; ++i)
			Factorial *= i;
		return Factorial;
	}
}
