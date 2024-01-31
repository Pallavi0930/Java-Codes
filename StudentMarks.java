
 class StudentMarks {

	public static void main(String[] args){
	String name = "Aarthi";
	int maths = 87 , science = 89, ms =98, cs=98, lang = 88;
	int sum = maths + science + ms + cs + lang;
	double avg = sum / 5;
	System.out.println("Total marks scored: " + sum);
	System.out.println("Average marks of " + name + " is: " + avg);
 }
}