package dz6;

public class Employee {
    int id;
    public String surname;
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

    Employee(int id, String surname, int age, int salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    private Employee() {

    }

    public void doublingSalary() {
        salary *= 2;
    }

    public int getSalary() {
        return id;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Karsakov", 23, 1200, "Magenta");
        Employee e2 = new Employee(2, "neKarsakov", 24, 2360);
        // Employee e3 = new Employee();
    }
}