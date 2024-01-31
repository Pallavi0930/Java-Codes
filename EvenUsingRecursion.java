class EvenUsingRecursion{
	public static void main(String[] args){
		
		int n=20;
		displayEven(20);
		displayEven(9);

	}
	static void displayEven(int n){
		if(n==2){
			System.out.println(n);
		}
		else{
			displayEven(n-2);
			System.out.println(n);
		}
	}
	
}