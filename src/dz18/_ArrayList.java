package dz18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _ArrayList {
    public static void abc(String... str) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void main(String[] args) {
        abc("Hello", "World", "Hello", "World", "Name", "Ok", "OK");
    }
}
