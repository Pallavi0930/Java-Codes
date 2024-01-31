class DemoForLoop{

	public static void main(String[] args){


		for(int num = 0;num<=50;num++){
			System.out.print(num + ", ");
		}
		System.out.println();	
		for(int num = 50;num>0;num--){
			System.out.print(num + ", ");
		}
		System.out.println();	
		System.out.println("Multiples of 8 in between the range 1 to 200");
		for(int i=8;i<200;i=i+8){
			System.out.print(i + ", ");
		}
	}

}