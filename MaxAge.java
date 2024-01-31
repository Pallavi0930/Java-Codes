class MaxAge{
	public static void main(String[] args){
	MaxAge obj = new MaxAge();
	int[] ageArray = {23,24,25,34,33,35,36,27,28};
	int maxAge = obj.getMaxAge(ageArray);
	System.out.println(maxAge);
	}
	public int getMaxAge(int[] age){
		int max = age[0];
		for(int i=1;i<age.length;i++){
			if(age[i]>max){
				max = age[i];
			}
		}
		return max;
	}
}