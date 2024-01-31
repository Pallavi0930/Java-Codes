import java.util.Scanner;

class CountOfDigits{
	public static void main(String[] args){
	
	System.out.println("Enter the number:");
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	int ctr =0;
	if(num==0{
		ctr=1;
	}
	else{
		while(num!=0){
			num = num/10;
			ctr++;
		}
	}
	System.out.println("Number of digits: " + ctr);
	}
}