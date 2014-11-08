import Utility.References;

public class Factorial {

    public Factorial(){
        System.out.print("\nEnter an integer: ");
        int Int = References.read.nextInt();
        System.out.println("Factorial = " + factorial(Int));
    }

    /**
     * @param Integer is the number whose factorial is to be calculated
     * It's recursive if factorial is out of range or infinite
     */
    private static double factorial(int Integer)
    {
        double Fact = 1;
        if (Integer < 0 || Integer > 171)   // factorial of a negative number is infinite
            return factorial(171);  // factorial of Integer >= 171 is out of range, i.e. Infinity
        else
        {
            for (int i = 2; i <= Integer; ++i)
                Fact *= i;
            return Fact;
        }
    }
}
