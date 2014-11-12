import Utility.NumberText;
import Utility.References;

public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println("Enter what to do: ");
		System.out.println("1. MessageDisplayer");
		System.out.println("2. Factorial");
		System.out.println("3. lineToInteger");
		System.out.println("4. lineToDouble");
		System.out.print("Choice? ");
		int Choice = NumberText.readInt();
		switch (Choice) {
			case 1: {
				new MessageDisplayer();
				break;
			}
			case 2: {
				new Factorial();
				break;
			}
			case 3: {
				System.out.print("Enter a string: ");
				String line = References.read.nextLine();
				System.out.println("Integer = " + NumberText.lineToInteger(line));
				break;
			}
			case 4: {
				System.out.print("Enter a string: ");
				String line = References.read.nextLine();
				System.out.println("Double = " + NumberText.lineToDouble(line));
				break;
			}
			default:
				System.out.println("You potato!");
		}
	}
}
