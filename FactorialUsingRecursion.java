class FactorialUsingRecursion{
	public static void main(String[] args){
	int num = 10;
	int factorial = fact(10);
	System.out.println(factorial);
	}
	static int fact(int n){
		if(n==1){
			return n;
		}
		return n*fact(n-1);
	}
}