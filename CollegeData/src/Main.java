public class Main {
    public static void main(String[] args) {
        StudentDetails obj = new StudentDetails("Pallavi",191030,400000,75.5);
        System.out.println("Student Name: "+obj.getStudentName());
        System.out.println("Student Rolls Number: "+obj.getStudentRollNo());
        System.out.println("Student Fees: Rs. "+obj.getStudentFees());
        System.out.println("Student Marks: "+obj.getStudentMarks()+"%");
    }
}