package Lab_3;

public class Main {
    public static void main(String[] args) {

       /* 
        Employee emp1 = new Employee();
        Employee.Company_name = "Google";
        emp1.inserValue("Abdullah Al Aman", 570000);
        emp1.display();

        Employee emp2 = new Employee();
        Employee emp3 = new Employee("Nahiyan Rahman", 56000);
        Employee emp4 = new Employee("Supti Saha");
        */

        Employee emp5 = new Employee();
        Employee.Company_name= "Google";
        emp5.setname("Supti Saha");
        emp5.setSalary(120000);


        System.out.println(emp5.getSalary());
        String name = emp5.getname();
        System.out.println((name));
    }

}
