public class FacultyDetailsImpl {
    public static void main(String[] args) {
        FacultyDetails obj = new FacultyDetails("Yashi","CSE");
        obj.setSalary(75000);
        obj.setAccountNumber(656562346534L);
        obj.setFacultyAddress("ABC Street, XYZ ");
        System.out.println("Faculty Name: "+obj.getFacultyName());
        System.out.println("Faculty Department: "+obj.getDept());
        System.out.println("Faculty Address: "+obj.getFacultyAddress());
        System.out.println("Faculty Salary: "+obj.getSalary());
        System.out.println("Faculty Account Number: "+obj.getAccountNumber());
    }
}
