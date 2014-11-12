import Utility.References;

public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println("Enter what to do: ");
		System.out.println("1. MessageDisplayer");
		System.out.println("2. Factorial");
		System.out.print("Choice? ");
		int Choice = References.readInt();
		switch (Choice)
		{
			case 1:
				new MessageDisplayer();
				break;
			case 2:
				new Factorial();
				break;
			default:
				System.out.println("You potato!");
		}
	}
}
