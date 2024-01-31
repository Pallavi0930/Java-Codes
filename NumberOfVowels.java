// WAP to find number of vowels in each name

class NumberOfVowels{
	public static void main(String[] args){
		String name = "Pallavi,Anjali,Priyanka,Sameer,Tarun,Suraj,Harathi";
		String[] names = name.toLowerCase().split(",");
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+" ");
		}
		
		for(int i=0;i<names.length;i++){
			int ctr =0;
			for(int j=0;j<names[i].length();j++){
				if(names[i].charAt(j)=='a' | names[i].charAt(j)=='e' | names[i].charAt(j)=='i' | names[i].charAt(j)=='o' |  names[i].charAt(j)=='u'){
					ctr++;
				}
			}
			System.out.println("Number of vowels in "+names[i]+" are : "+ ctr);
		}
	}
}