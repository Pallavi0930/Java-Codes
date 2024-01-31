class ReverseString{
	public String getReverse(String str){
		str = str.toLowerCase();
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev += str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args){
		String name = "Pallavi";
		ReverseString obj = new ReverseString();
		String reverse = obj.getReverse(name);
		System.out.println(reverse);
	}
}