package Lab_3;

public class Employee {

    public static String Company_name;
    private String name;
    private float Salary;

    void inserValue(String name, float sal) {

        this.name = name;
        this.Salary = sal;
    }

    void display() {

        System.out.println("The name of the Employee is: " + this.name);
        System.out.println("Employee's Salary: " + this.Salary);
    }
    
    public void setname(String newName){
        this.name= newName;

    }
    public void setSalary(float newSalary){
        this.Salary= newSalary;


    }
    public String getname(){
        return this.name;

    }
    public float getSalary(){

        return this.Salary;

    }
    public Employee() {
        System.out.println("Default Construction");
    }

    ///contruction
    public  Employee(String name, float Salary) {

        this.name = name;
        this.Salary = Salary;
        System.out.println("The name of the Employee is: " + this.name);
        System.out.println("Employee's Salary: " + this.Salary);
    }
     


    public Employee(String name) {

        this.name = name;
        System.out.println("The name of the Employee is: " + this.name);
    }



}