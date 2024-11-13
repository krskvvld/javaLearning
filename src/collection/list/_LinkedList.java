package collection.list;

import java.util.LinkedList;

public class _LinkedList {

    public static void main(String[] args) {
        /**
         * Двунаправленный список (элементы хранят ссылки на предыдущий и следующий элементы), ordered,
         * быстрый для добавления и удаления элементов
         */

        Student st1 = new Student("Vlad", 2);
        Student st2 = new Student("Masha", 1);
        Student st3 = new Student("Vanya", 4);
        Student st4 = new Student("Vlad", 3);
        Student st5 = new Student("Petya", 2);

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);
    }

}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }
}