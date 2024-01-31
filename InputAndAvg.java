import java.util.Scanner;
class InputAndAvg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum =0;
		for(int i = 0 ;i<10;i++){
			int num = sc.nextInt();
			sum+=num;
		}
		double avg =sum/10.0;
		System.out.println("Average of given numbers is:"+avg);

	}
}