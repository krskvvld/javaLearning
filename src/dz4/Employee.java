package dz4;

public class Employee {
    private int id;
    private String surname;
    private int age;
    private int salary;
    private String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void doublingSalary() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Karsakov", 23, 1200, "Magenta");
        System.out.println(e1.getSalary());
        e1.doublingSalary();
        System.out.println(e1.getSalary());

        System.out.println();

        Employee e2 = new Employee(2, "neKarsakov", 24, 2360, "neMagenta");
        System.out.println(e2.getSalary());
        e2.doublingSalary();
        System.out.println(e2.getSalary());
    }
}