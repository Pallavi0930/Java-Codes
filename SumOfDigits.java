import java.util.Scanner;

class SumOfDigits{
	public static void main(String[] args){
	System.out.println("Enter the number:");
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	int sum = 0;
	while(num>0){
		int quot = num/10;
		int rem = num%10;
		sum += rem;
		num=quot;
		
	}
	System.out.println("Sum of digits: " + sum);
	}
}