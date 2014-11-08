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

        /* added for factorial purposes */
        System.out.print("\nEnter an integer: ");
        int Int = read.nextInt();
        System.out.println("Factorial = " + Factorial(Int));
    }

    /**
     * Asks user to enter a message
     * @return The inputted message -> "inputted" ??
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

    /**
     * @param Integer is the number whose factorial is to be calculated
     * It's recursive if factorial is out of range or infinite
     */
    private static double Factorial(int Integer)
    {
        double Fact = 1;
        if (Integer < 0 || Integer > 171)   // factorial of a negative number is infinite
            return Factorial(171);  // factorial of Integer >= 171 is out of range, i.e. Infinity
        else
        {
            for (int i = 2; i <= Integer; ++i)
                Fact *= i;
            return Fact;
        }
    }
}
