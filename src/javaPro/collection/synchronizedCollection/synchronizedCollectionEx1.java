package javaPro.collection.synchronizedCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class synchronizedCollectionEx1 {
    /**
     * Получаются из традиционных коллекций благодаря их обёртвыванию.
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al1.add(i);
        }
        List<Integer> al2 = Collections.synchronizedList(al1);

        Runnable runnable = () -> {
            al2.addAll(al1);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(al2);
    }
}
