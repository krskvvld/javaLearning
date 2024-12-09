package javaPro.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class streamMethodFilter {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Cool");
        arrayList.add("World");
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        List<String> filterList = arrayList.stream()
                .filter(element -> element.startsWith("C"))
                .toList();
        System.out.println(filterList);
    }
}