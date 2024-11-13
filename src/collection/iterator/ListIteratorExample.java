package collection.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        String str = "madam";
        List<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean flag = true;
        while (listIterator.hasNext() && reverseIterator.hasPrevious()) {
            if (!listIterator.next().equals(reverseIterator.previous())) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

}