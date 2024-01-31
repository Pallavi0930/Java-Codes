class ArrayDemo{
	public static void main(String[] args){

		int[] arr = {10,20,30,40,50,9,12,13,25};
		System.out.println("Element at index "+ 0 + " = " + arr[0]);
		System.out.println("Element at index "+ 1 + " = " + arr[1]);
		System.out.println("Element at index "+ 2 + " = " + arr[2]);
		System.out.println("Element at index "+ 3 + " = " + arr[3]);
		System.out.println("Element at index "+ 4 + " = " + arr[4]);
		System.out.println("Element at index "+ 5 + " = " + arr[5]);
		System.out.println("Element at index "+ 6 + " = " + arr[6]);
		System.out.println("Element at index "+ 7 + " = " + arr[7]);
		System.out.println("Element at index "+ 8 + " = " + arr[8]);


		System.out.println("Print Array Using For Loop");
		for(int i =0;i<arr.length;i++){
			System.out.println("Element at index "+ i + " = " + arr[i]);
		}
		
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("Sum is: " + sum);
		double avg = (double)sum/arr.length;
		System.out.println("Average of elements is:  " + avg);
		int lowest = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<lowest){
				lowest=arr[i];
			}
		}
		System.out.println("Lowest element is:  " + lowest);

	}
}