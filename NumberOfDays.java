
import java.util.Scanner;

class NumberOfDays{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month:");
		String month = sc.next().toLowerCase();
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		int day =0; 
		switch(month){
	 		
			case "january":
			case "march":
			case "may":
			case "july":
			case "august":
			case "october":
			case "december":
				day = 31;
				break;
			case "february":
				if((year % 4 ==0) && (!(year%100==0) || (year%400==0))){
					day =29;
					break;
				}
				else{
					day = 28;
					break;
				}
			case "april":
			case "june":
			case "september":
			case "november":
				day=30;
				break;
			default:
				System.out.println("Invalid Input");
				break;

		}
		System.out.println(month + " has "+ day+" days.");
	
	}
}