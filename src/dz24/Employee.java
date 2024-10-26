package dz24;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}

class TestEmployee {
    public static void showInfo(Employee employee) {
        System.out.println("Name: " + employee.getName() + "\nDepartment: " + employee.getDepartment() + "\nSalary: "
                + employee.getSalary());
    }

    public static void employeeFiltering(ArrayList<Employee> employees, Predicate<Employee> predicate) {
        for (Employee employee : employees) {
            if (predicate.test(employee)) {
                showInfo(employee);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("Vlad", "IT", 1200);
        Employee employee2 = new Employee("Jane", "Magentna", 3010);
        Employee employee3 = new Employee("Jack", "IT", 720);
        Employee employee4 = new Employee("Doe", "Doe", 800);
        Employee employee5 = new Employee("Elena", "Doe", 2000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        employeeFiltering(employees, e -> e.getDepartment().equals("IT") && e.getSalary() > 200);
        System.out.println();
        employeeFiltering(employees, e -> e.getName().startsWith("E") && e.getSalary() != 450);
        System.out.println();
        employeeFiltering(employees, e -> e.getName().equals(e.getDepartment()));
    }
}