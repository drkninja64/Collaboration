import java.util.Scanner;

/**
 * Created by Sajag on 11/7/2014.
 */
public class MainClass {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args){
        String IpMessage;
        IpMessage = ipMsg();
        opMsg(IpMessage);
    }

    /**
     * Asks user to enter a message
     * @return The inputted message
     */
    private static String ipMsg(){
        System.out.print("Please enter your message: ");
        return read.nextLine();
    }

    /**
     * Displays the message with obviousness
     * @param Message the message to be displayed
     */
    private static void opMsg(String Message){
        System.out.println("Your message was:");
        System.out.println(Message);
    }
}
