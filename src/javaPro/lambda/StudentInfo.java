package javaPro.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Vlad", 'm', 24, 2, 4.8);
        Student st2 = new Student("Sasha", 'f', 24, 2, 5);
        Student st3 = new Student("Valera", 'm', 19, 4, 4.1);
        Student st4 = new Student("Vlad", 'm', 21, 1, 3.4);
        Student st5 = new Student("Masha", 'f', 22, 4, 3.9);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });

        printStudentsInfo(students, (Student s) -> {
            return s.age > 21;
        });
        System.out.println();
        printStudentsInfo(students, s -> s.avgGrade >= 4);

    }

    static void printStudentsInfo(ArrayList<Student> students, Predicate<Student> predicate) {
        for (Student student : students) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
    }
}
