package collection.list;

import java.util.ArrayList;

public class _ArrayList {

    public static void main(String[] args) {
        /**
         * Реализован на основе массива, быстрый для получения элеменат по индексу,
         * быстрый для вставки по индексу, ordered
         */
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList.get(2));

        for (String str : arrayList) {
            System.out.print(str + " ");
        }
    }

}