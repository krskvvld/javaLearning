package collection.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(-3);
//        list.add(8);
//        list.add(12);
//        list.add(-8);
//        list.add(0);
//        list.add(5);
//        list.add(10);
//        list.add(1);
//        list.add(150);
//        list.add(-30);
//        list.add(19);
//        Collections.sort(list);
//        int index = Collections.binarySearch(list,12);
//        System.out.println(index);

        Employee emp1 = new Employee(1, "Vlad", 100000);
        Employee emp2 = new Employee(2, "Anna", 50000);
        Employee emp3 = new Employee(3, "Vanya", 100000);
        Employee emp4 = new Employee(2, "Vlad", 75000);
        Employee emp5 = new Employee(5, "Masha", 200000);
        Employee emp6 = new Employee(6, "Vlad", 150000);
        Employee emp7 = new Employee(7, "Petya", 230000);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        System.out.println(employees);
        Collections.sort(employees);
        int index = Collections.binarySearch(employees, emp4);
        System.out.println(index);
        System.out.println(employees);

//        int[] arr = {2, 6, 1, 0, -2, 98, -21, 0};
//        Arrays.sort(arr);
//        int ind = Arrays.binarySearch(arr, 2);
//        System.out.println(ind);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        int result = this.id - otherEmployee.id;
        if (result == 0) {
            result = this.name.compareTo(otherEmployee.name);
        }
        return result;
    }
}
