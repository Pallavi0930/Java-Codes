
import java.util.Scanner;

class MaxAmongTwo{

	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = s.nextInt();

		System.out.println("Enter second number: ");
		int num2 = s.nextInt();
		
		if(num1 > num2){
			System.out.println(num1 + " is greater than " + num2);
		}
		else if(num1 == num2){
			System.out.println(num1 + " is equal to " + num2);
		}
		else{
			System.out.println(num1 + " is less than " + num2);
		}

	}
}