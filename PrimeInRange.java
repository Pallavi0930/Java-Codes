import java.util.Scanner;
class PrimeInRange{

	public static void main(String[] args){
	
		PrimeInRange obj = new PrimeInRange();
		obj.checkPrime();
	}
	
	int getInput(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	void checkPrime(){
		System.out.println("Enter lower limit: ");
		int l = getInput();
		System.out.println("Enter upper limit: ");
		int u = getInput();
		
		for(int i = l ;i<=u;i++){
                                        	boolean counter = true;				// 10 11 12 13 14 15 ..... 29 30    30  13
			for(int j = 2 ; j <= i/2 ; j++){			// 2 3 4 5 ......14
				if(i%j ==0){
					counter = false;
					break;
				}
				
			}
			if(counter == true){
				System.out.println( i + " is a prime number");
			}
			else{
				System.out.println( i + " is not a prime number");
			}
		}
	}

}