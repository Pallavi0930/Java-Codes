import java.util.*;
class BubbleSort{
	public int[] sortMarks(int[] marks){
		int size = marks.length;
		for(int pass=0;pass<size;pass++){
			for(int j=0;j<size-pass-1;j++){
				if(marks[j]>marks[j+1]){
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1]= temp;
				}
			}
		}
	return marks;
	}

	public static void main(String[] args){
	 	int[] studentmarks = {88,93,25,65,78,32,54,90,12,34};
		BubbleSort obj = new BubbleSort();
		int[] sortedmarks = obj.sortMarks(studentmarks);
		System.out.println(Arrays.toString(sortedmarks));
	}
}