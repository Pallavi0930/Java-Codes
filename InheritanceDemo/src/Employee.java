 class Employee {
    private int empCode;
    private String empName;
     private String address;
     private String dept;
    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "empCode=" + empCode +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
