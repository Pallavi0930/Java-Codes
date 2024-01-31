
class ProductUsingWhile{

	public static void main(String[] args){
		int product =1;
		int num =1;
		while(num<=5){
			product *= num;
			num++;
		}
		System.out.println("Product is : " + product);
	}

}