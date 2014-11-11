import Utility.References;

public class MainClass {

	public static void main(String[] args){
		System.out.print("Enter a string: ");
		String line = References.read.nextLine();
		System.out.println(References.lineToInteger(line));
	}
}
