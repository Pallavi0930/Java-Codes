
import java.util.Scanner;

class ScannerDemo{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a byte:");
		byte a = s.nextByte();

		System.out.println("Enter a short:");
		short b = s.nextShort();

		System.out.println("Enter an Integer:");
		int c = s.nextInt();

		System.out.println("Enter a Long:");
		long d = s.nextLong();

		System.out.println("Enter a floating point number:");
		float e = s.nextFloat();

		System.out.println("Enter a number of type double:");
		double f = s.nextDouble();
		
		System.out.println("Enter a character:");
		char g = s.next().charAt(0);
		
		System.out.println("Enter either true or false:");
		boolean h = s.nextBoolean();

		System.out.println("Byte: " + a);
		System.out.println("Short: " + b);
		System.out.println("Int: " + c);
		System.out.println("Long: " + d);
		System.out.println("Char: " + e);
		System.out.println("Boolean: " + f);

	
	}
}