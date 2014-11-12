package Utility;

public class NumberText
{
	/**
	 * the first set of characters in the string, if number, is converted into integer
	 * @param line is the string to be converted into integer
	 * @return integer if digits found, 0 otherwise
	 */
	public static int lineToInteger(String line)
	{
		int Sign = 1, Integer = 0;
		for (int i = 0; i < line.length(); ++i)
			if (line.charAt(i) >= '0' && line.charAt(i) <= '9')
				Integer = Integer * 10 + line.charAt(i) - '0';
			else if (i == 0 && line.charAt(0) == '-' && line.length() > 1)
				Sign = -1;
			else
				break;
		return Sign * Integer;
	}

	/**
	 * the first set of characters in the string, if number, is converted into double
	 * @param line is the string to be converted into double
	 * @return double if digits found, 0.0 otherwise
	 */
	public static double lineToDouble(String line)
	{
		int Sign = 1, i;
		double Double = 0.0;
		for (i = 0; i < line.length(); i++) {
			if (line.charAt(i) >= '0' && line.charAt(i) <= '9')
				Double = Double * 10 + line.charAt(i) - '0';
			else if (i == 0 && line.charAt(0) == '-' && line.length() > 1)
				Sign = -1;
			else
				break;
		}
		if (line.charAt(i) == '.')
			for (int j = 1; i < line.length(); j++) {
				i++;
				if (line.charAt(i) >= '0' && line.charAt(i) <= '9')
					Double += (line.charAt(i) - '0') / power(10,j);
				else
					break;
			}
		return Sign * Double;
	}

	/**
	 * calculates x to the power y
	 * @param x is mantissa
	 * @param y is exponent
	 * @return Power
	 */
	public static double power(int x, int y)
	{
		double Power = 1;
		for (int i = 0; i < y; ++i)
			Power *= x;
		return Power;
	}

	/**
	 * reads an integer and clears input buffer, asks for an integer again on error
	 * @return integer input by the user (not inputted)
	 */
	public static int readInt()
	{
		int Integer;
		for (;;) {
			try {
				Integer = References.read.nextInt();
				References.read.nextLine();
				return Integer;
			} catch (Exception e) {
				System.out.println("\nPlease enter an integer:");
				References.read.nextLine();
			}
		}
	}
}
