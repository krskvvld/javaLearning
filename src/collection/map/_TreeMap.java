package collection.map;

import java.util.Map;
import java.util.TreeMap;

public class _TreeMap {

    public static void main(String[] args) {
        /**
         * Сортирует по ключу, основан на дереве
         */
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(3, "C");
        treeMap.put(5, "E");
        treeMap.put(2, "B");
        treeMap.put(4, "D");

        System.out.println(treeMap.get(2));

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}