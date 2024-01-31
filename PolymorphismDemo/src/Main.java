public class Main {
    public static void main(String[] args) {
        Employee obj = new TechLead("Pallavi",100000,100000);
        float totalSalary = obj.calculateSalary();
        System.out.println(totalSalary);
        Employee obj2 = new SalesManager("Anjali",100000,100000,50000);
        float totalSMSalary = obj2.calculateSalary();
        System.out.println(totalSMSalary);
    }
}