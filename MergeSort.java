import java.util.*;

class MergeSort{
	public static void main(String[] args){
		int[] arr = new int[]{23,43,22,34,43,45,54,56};
		merge_sort(arr,0,arr.length-1);
		for(int k=0;k<arr.length;k++){
		    System.out.print(arr[k]+" ");
		}
	}
	static void merge_sort(int[] arr,int l, int r ){
		
		if(l<r){
			int mid = (l+r)/2;
			merge_sort(arr,l,mid);
			merge_sort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	static void merge(int[] arr,int l,int mid ,int r){
		int i=l;
		int j=mid+1;
		int k=l;
		int[] b=new int[arr.length];
		while(i<=mid && j<=r){
			if(arr[i]<arr[j]){
				b[k]=arr[i];
				i++;
			}
			else{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid){
			while(j<=r){
				b[k]=arr[j];
				j++;
				k++;
			}
		}
		else{
			while(i<=mid){
				b[k]=arr[i];
				i++;
				k++;
			}
		}
		for(int z=l;z<r;z++){
			arr[z]=b[z];
		}
	}
}