package javaPro.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class _LinkedHashMap {

    public static void main(String[] args) {
        /**
         * Сохраняет порядок вставки объектов по ключам, основан на хэш-таблице + связанный список
         */
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        linkedHashMap.put(5, "C");
        linkedHashMap.put(4, "D");
        linkedHashMap.put(3, "E");

        System.out.println(linkedHashMap.get(2));

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}