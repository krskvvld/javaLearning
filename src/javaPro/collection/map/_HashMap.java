package javaPro.collection.map;

import java.util.HashMap;
import java.util.Map;

public class _HashMap {

    public static void main(String[] args) {
        /**
         * Структура данных, элементами котороый являютый парый ключ/значение.
         * Not ordered, методы работают быстро.
         */
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(3, "C");
        hashMap.put(5, "E");
        hashMap.put(2, "B");
        hashMap.put(4, "D");

        System.out.println(hashMap.get(2));

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}