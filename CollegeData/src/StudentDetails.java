public class StudentDetails {
    private String studentName;
    private int studentRollNo;
    private int studentFees;
    private double studentMarks;
    public StudentDetails(String studentName,int studentRollNo,int studentFees,double studentMarks){
        this.studentName=studentName;
        this.studentFees=studentFees;
        this.studentMarks=studentMarks;
        this.studentRollNo=studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentFees() {
        return studentFees;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public double getStudentMarks() {
        return studentMarks;
    }
}
