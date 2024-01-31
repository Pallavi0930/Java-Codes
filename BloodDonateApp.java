
import java.util.Scanner;

class BloodDonateApp{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = input.nextInt();

		if(age >=18){
			System.out.println("Enter your weight: ");
			double weight = input.nextDouble();
			if(weight >=50 && weight <=70){
				System.out.println("Eligible to donate blood");
			}
			else{
				System.out.println("Not eligible to donate blood");
			}
		}
		else{
			System.out.println("Not eligible to donate blood");
		}
	} 
}