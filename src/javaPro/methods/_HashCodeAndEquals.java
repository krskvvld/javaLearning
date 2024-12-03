package javaPro.methods;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _HashCodeAndEquals {
    public static void main(String[] args) {
        Map<Student, Double> hashmap = new HashMap<>();
        Student st1 = new Student("Vlad", "Karsakov", 3);
        Student st2 = new Student("John", "Mask", 2);
        Student st3 = new Student("Masha", "Doe", 5);
        hashmap.put(st1, 4.12);
        hashmap.put(st2, 5.0);
        hashmap.put(st3, 4.07);
        System.out.println(hashmap);
        Student st4 = new Student("Vlad", "Karsakov", 3);
        boolean result = hashmap.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.equals(st4));
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}