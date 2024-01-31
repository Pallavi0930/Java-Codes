import java.util.Scanner;

class CalculatorApp{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();


		System.out.println(" Enter the following symbols for calculation");
		System.out.println(" 1.For additon enter +");
		System.out.println(" 2.For substraction enter -");
		System.out.println(" 3.For multiplication enter *");
		System.out.println(" 4.For division enter / \nNote: For division second number should not be 0");
		System.out.println(" 5.For modulous enter %");
			
		char c = sc.next().charAt(0);

		switch(c){
			case '+':
			System.out.println("Sum is: "+(num1+num2));
			break;
			case '-':
			System.out.println("Difference is: "+(num1-num2));
			break;
			case '*':
			System.out.println("Product is: "+(num1*num2));
			break;
			case '/':
			System.out.println("Quotient is: "+(num1/num2));
			break;
			case '%':
			System.out.println("Remainder is: "+(num1%num2));
			break;
			default:
			System.out.println("Invalid Input");




		}



	}
}