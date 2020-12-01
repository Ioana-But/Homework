public class Employee extends Person{

    private int employeeCode;

    public Employee(String name, int age, int employeeCode) {
        super(name, age);
        this.employeeCode = employeeCode;
    }
}
