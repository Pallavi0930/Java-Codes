import java.util.Arrays;
class InsertionSortDemo{
	public static void main(String[] args){
	try{
	static final a;
	int[] arr = {20,45,23,78,89,34,20,21,90,32};
	for(int i=1;i<arr.length;i++){
		int key = arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>key){
		arr[j+1]=arr[j];
		j=j-1;
		}
		arr[j+1]=key;
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(a);
	}
	catch(Exception e){
	System.out.prinln(e);
	}
	}
}