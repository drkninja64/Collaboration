import Utility.References;

public class MessageDisplayer
{
	public MessageDisplayer()
	{
		opMsg(ipMsg());
	}

	/**
	 * Asks user to enter a message
	 * @return The message entered by the user
	 */
	private static String ipMsg()
	{
		System.out.print("Please enter your message: ");
		return References.read.nextLine();
	}

	/**
	 * Displays the message with obviousness
	 * @param Message the message to be displayed
	 */
	private static void opMsg(String Message)
	{
		System.out.print("Your message was: ");
		System.out.println(Message);
	}
}
