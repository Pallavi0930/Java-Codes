import java.util.Scanner;

class AddUserInput{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = s.nextInt();

		System.out.println("Enter second number: ");
		int num2 = s.nextInt();

		System.out.println("Sum of numbers is: " + (num1 + num2));

	}
}