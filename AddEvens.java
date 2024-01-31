class AddEvens{
	public static void main(String[] args){
	int n=-9;
	long addEven =addEvens(n);
	System.out.println(addEven);
	}
	public static long addEvens(int n)    {
		if(n%2==0){
			if(n<=0){
				return 0;
			}
			else{
			return n+addEvens(n-2);
			}
		}
		else{
			if(n<=0){
				return 0;
			}
			else{
			return (n-1)+addEvens(n-2);
			}
		}
      
    	}
}