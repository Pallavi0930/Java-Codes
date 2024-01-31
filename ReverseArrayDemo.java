class ReverseArrayDemo{
	public static void main(String[] args){
		int[] arr1 = {34,45,56,78,32,79,89,90};
		int[] arr2 = {34,45,56,78,-32,79,-89,90};
		ReverseArrayDemo obj = new ReverseArrayDemo();
		int[] reverse1 = obj.getReverseArray(arr1);
		for(int i=0;i<arr1.length;i++){
			System.out.print(reverse1[i]+ " ");
		}
		System.out.println();
		int[] reverse2 = obj.getReverseArray(arr2);
		for(int i=0;i<arr2.length;i++){
			System.out.print(reverse2[i]+ " ");
		}
	}
	public int[] getReverseArray(int[] array){
		int n = array.length;
		int[] rev = new int[n];
		int temp = array.length-1;
		for(int i=0;i<n;i++){
			if(temp>=0){
			rev[i]=array[temp];
			temp--;
			}
		}
		return rev;
		
	}
}