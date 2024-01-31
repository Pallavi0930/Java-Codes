import java.util.Arrays;
public class OakBridgeSchoolDemo {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        if(math.length>0 & science.length>0 & english.length>0){
			int[] totalMarks = new int[math.length];
			for(int i=0;i<math.length;i++){
				totalMarks[i] = math[i] + science[i] + english[i];
			}
			return totalMarks;
		}
		else{
			return null;
		}
    }
    // Write the logic to calculate the average marks using recursion
	
   public double calculateAverageScienceMarks (int[] science,int len)
    {
		if(len<0){
			return 0.0;
		}
		if(len==1){
		return science[0];
		}
		else{
			
			return (calculateAverageScienceMarks(science,len-1)+science[len-1])/10.0;
		}
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
       		if(len<0){
			return 0.0;
		}
		if(len==1){
		return english[0];
		}
		else{
			return (calculateAverageEnglishMarks(english,len-1)+english[len-1])/10.0;
		}
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len){
		if(len<0){
			return 0.0;
		}
		if(len==1){
		return math[0];
		}
		else{
			return (calculateAverageMathMarks(math,len-1)+math[len-1])/10.0;
		} 
	}

    //Write the logic to find the top score in the class using recursion
	int highest =0;
    public int findTopScore(int [] totalMarks,int len){
        if(len<=0){
			return 0;
		}
		else{
			if(highest < totalMarks[len-1]){
				highest=totalMarks[len-1];
				
			}
			findTopScore(totalMarks,len-1);
			return highest;
		}
    }

    public static void main(String[] args) {

        // Initialize the OakBridgeSchool class object
		OakBridgeSchoolDemo obj = new OakBridgeSchoolDemo();

        // Call the appropriate methods and display the output
		 int[] math  = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
       		 int[] science ={80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
       		 int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
		int[] totalMarks = obj.calculateTotalMarks(math,science,english);
		int topScore = obj.findTopScore(totalMarks,totalMarks.length);
		double avgScienceMarks = obj.calculateAverageScienceMarks(science,science.length);
		double avgEnglishMarks = obj.calculateAverageEnglishMarks(english,english.length);
		double avgMathMarks = obj.calculateAverageMathMarks(math,math.length);
		System.out.println(Arrays.toString(totalMarks));
		System.out.println(topScore);
		System.out.println(avgScienceMarks);
		System.out.println(avgEnglishMarks);
		System.out.println(avgMathMarks);

    }
}