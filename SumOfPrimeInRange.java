import java.util.Scanner;
class SumOfPrimeInRange {
	public static void main(String[] args){
		SumOfPrimeInRange obj = new SumOfPrimeInRange();
		int sumOfPrime = obj.sumOfPrime();
		System.out.println("Sum is: " + sumOfPrime);
	}
	int getInput(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	int sumOfPrime(){
		System.out.println("Enter lower limit: ");
		int l = getInput();
		System.out.println("Enter upper limit: ");
		int u = getInput();
		int sum = 0;
		for(int i = l ; i<=u;i++){
		int ctr = 1;
			for( int j = 2 ; j<=i/2 ; j++){
				if(i%j==0){
				ctr = 0;
				}
			}
			if(ctr ==1){
				sum += i;
				System.out.print(i + " ");
			}
		}
		return sum;	
	}
}