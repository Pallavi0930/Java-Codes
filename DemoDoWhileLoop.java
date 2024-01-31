
class DemoDoWhileLoop{
	public static void main(String[] args){

		int num = 1;
		System.out.println(" number from 1 to 25");
		do{
			System.out.print( num + ", ");
			num=num+1;
		}while(num<=25);
		System.out.println();
		int num2 = 25;
		System.out.println(" number from 25 to 1");
		do{
			System.out.print( num2 + ", ");
			num2=num2-1;
		}while(num2>0);

	}
}