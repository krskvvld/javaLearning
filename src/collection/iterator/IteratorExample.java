package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Vlad");
        arrayList.add("Dima");
        arrayList.add("Igor");
        arrayList.add("Masha");
        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();

    }
}