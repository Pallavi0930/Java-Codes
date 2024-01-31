import java.util.Arrays;
class SortedNames{
	public String[] getSortedNames(String[] names){
		if(names.length>0){
			for(int i=0;i<names.length-1;i++){
				for(int j=i+1;j<names.length;j++){
					if(names[i].compareTo(names[j])>0){
						String temp = names[i];
						names[i] =names[j];
						names[j] = temp;
					}
				}
			}
			return names;
		}
		else{
			return null;
		}
	}
	public static void main(String[] args){
		SortedNames obj = new SortedNames();
		String[] str = {"Shyam","Pallavi","Nisha","Shikha","Harsh"};
		System.out.println(Arrays.toString(obj.getSortedNames(str)));
	}
}
// {Pallavi,Anjali,Harsh,Yashi}
//		i=0 j=0  j=1  j=2 j=3  {anjali,pallavi,harsh,yashi}
//		i=1  j=1 j=2 j=3     {anjali,harsh,pallavi,yashi}
   