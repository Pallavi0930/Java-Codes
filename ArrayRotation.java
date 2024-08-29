import java.util.*;
class ArrayRotation{
	public static void rotate(int[] arr, int step){
		int n= step % arr.length;
		reverse(arr,0,arr.length-1);
		reverse(arr,0,n-1);
		reverse(arr,n,arr.length-1);
	}
	public static int[] reverse(int[] arr, int l,int r){
		while(l<r){
			swap(arr,l,r);
			l++;
			r--;
		}
		return arr;
	}
	public static void swap(int[] arr, int start,int end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
	}
   	public static void main(String[] args) {
       		 int[] arr = new int[]{12,23,32,34,21};
      		 rotate(arr,3);
       		 for(int a:arr){
           			 System.out.print(a+" ");
        		}
    	}
}