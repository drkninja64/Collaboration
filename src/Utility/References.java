package Utility;

import java.util.Scanner;

public class References
{
	public static final Scanner read = new Scanner(System.in);

	/**
	 * the first set of characters in the string, if number, is converted into integer
	 * @param line is the string to be converted into integer
	 * @return integer if digits found, 0 otherwise
	 */
	public static int lineToInteger(String line) {
		int Sign = 1, Integer = 0;
		for (int i = 0; i < line.length(); ++i) {
			if (line.charAt(i) >= '0' && line.charAt(i) <= '9')
				Integer = Integer * 10 + line.charAt(i) - '0';
			else if (i == 0 && line.charAt(0) == '-')
				Sign = -1;
			else
				break;
		}
		return Sign * Integer;
	}
}
