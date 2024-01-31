public class Main {
    public static void main(String[] args) {
        FullStackDeveloper obj=new FullStackDeveloper();
        obj.setEmpName("Pallavi");
        obj.setAddress("Abc street, city, state");
        obj.setDept("Software Developer");
        obj.setEmpCode(1001);
        obj.setProject("E-commerce");
        obj.setProjectCode(201);
        obj.setProjectDurationInMonths(6);
        obj.setRoleInProject("Backend Dev");
        System.out.println(obj);
    }
}