package javaPro.collection.list;

import java.util.LinkedList;
import javaPro.collection.Student;

public class _LinkedList {

    public static void main(String[] args) {
        /**
         * Двунаправленный список (элементы хранят ссылки на предыдущий и следующий элементы), ordered,
         * быстрый для добавления и удаления элементов в начало списка
         */

        Student st1 = new Student(1, "Vlad");
        Student st2 = new Student(2, "NeVlad");
        Student st3 = new Student(3, "Sasha");
        Student st4 = new Student(4, "Vlad");
        Student st5 = new Student(5, "NeSasha");


        LinkedList<javaPro.collection.Student> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);
    }

}