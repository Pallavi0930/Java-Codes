public class FacultyDetails {
    private String facultyName;
    private String dept;
    private double salary;
    private long accountNumber;
    private String facultyAddress;

    public FacultyDetails(String facultyName, String dept){
        this.facultyName=facultyName;
        this.dept=dept;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFacultyAddress() {
        return facultyAddress;
    }

    public void setFacultyAddress(String facultyAddress) {
        this.facultyAddress = facultyAddress;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getDept() {
        return dept;
    }
}
