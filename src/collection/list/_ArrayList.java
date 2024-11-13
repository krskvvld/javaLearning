package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _ArrayList {
    /**
     * В основе ArrayList лежит массив Object, можно получить элемент по индексу, является ordered.
     * Изначально capacity = 10 (если не указан явно). Если при добавлении нового элемента выйти
     * за границы, создаётся новый ArrayList с capacity *= 1.5

     * Методы: add(DataType element) -> boolean
     *         add(int index, DataType element) -> boolean

     *         get(int index) -> DataType

     *         set(int index, DataType) -> DataType

     *         remove(Object element) -> boolean
     *         remove(int index) -> DataType
     *
     *         addAll(ArrayList aL) -> boolean
     *         addAll(int index, ArrayList aL) -> boolean
     *
     *         clear() -> void
     *
     *         indexOf() -> int
     *         lastIndexOf() -> int
     *
     *         size() -> int
     *
     *         isEmpty() -> boolean
     *
     *         contains() -> boolean
     *
     *         toString() -> String
     *
     *         asList(DataType[]) -> List<DataType>
     *
     *         removeAll(Collection<?> c) -> boolean
     *
     *         retainAll(Collection<?> c) -> boolean
     */

    public static void main(String[] args) {
        _retainAll();
    }

    //Метод ArrayList для добавления элементов
    public static void _add() {
        //Последовательное добавление
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Vlad");
        arrayList1.add("neVlad");
        System.out.println(arrayList1);

        //Добавление по индексу
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Vlad");
        arrayList2.add("neVlad");
        arrayList2.add(0, "snovaNeVlad");
        System.out.println(arrayList2);
    }

    //Метод ArrayList для получения элемента по индексу
    public static void _get() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Vlad");
        arrayList.add("neVlad");
        System.out.println(arrayList.get(1));
    }

    //Метод ArrayList для замены элемента по индексу
    public static void _set() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Vlad");
        arrayList.add("neVlad");
        System.out.println(arrayList);
        arrayList.set(1, "snovaNeVlad");
        System.out.println(arrayList);
    }

    //Метод ArrayList для удаления элемента
    public static void _remove() {
        //По индексу
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Vlad");
        arrayList1.add("neVlad");
        System.out.println(arrayList1);
        arrayList1.remove(1);
        System.out.println(arrayList1);

        //По значению элемента
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Vlad");
        arrayList2.add("neVlad");
        System.out.println(arrayList2);
        arrayList2.remove("Vlad");
        System.out.println(arrayList2);
    }

    //Метод ArrayList для добавления значений из другого ArrayList
    public static void _addAll() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("C");
        arrayList1.add("B");
        arrayList1.add("D");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("N");
        arrayList2.add("O");
        arrayList2.add("P");

        //В конец ArrayList
        arrayList2.addAll(arrayList1);

        //Добавление по индексу
        arrayList2.addAll(0, arrayList1);
        System.out.println(arrayList2);
    }

    //Метод ArrayList для очистки ArrayList
    public static void _clear() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("D");
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }

    //Метод ArrayList для нахождения первого вхождение заданного значения
    public static void _indexOf() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("B");
        System.out.println(arrayList.indexOf("B"));
    }

    //Метод ArrayList для нахождения последнего вхождение заданного значения
    public static void _lastIndexOf() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("B");
        System.out.println(arrayList.lastIndexOf("B"));
    }

    //Метод ArrayList для получения размера ArrayList
    public static void _size() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("B");
        System.out.println(arrayList.size());
    }

    //Метод ArrayList для проверки на заполненность
    public static void _isEmpty() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("B");
        System.out.println(arrayList.isEmpty());
    }

    //Метод ArrayList для проверки наличия определенного элемента или подстроки
    public static void _contains() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("B");
        System.out.println(arrayList.contains("C"));
    }

    //Метод ArrayList для преобразования массива в список
    public static void _asList() {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] sbArray = {sb1, sb2, sb3, sb4};

        List<StringBuilder> sbList = Arrays.asList(sbArray);
        System.out.println(Arrays.toString(sbArray));
        System.out.println(sbList);

        sbArray[0] = new StringBuilder("E");
        System.out.println(Arrays.toString(sbArray));
        System.out.println(sbList);

        sbList.set(0, new StringBuilder("F"));
        System.out.println(Arrays.toString(sbArray));
        System.out.println(sbList);
    }

    //Метод ArrayList для удаления элементов списка, которые содержатся в списке,
    //переданном в качестве аргумента
    public static void _removeAll() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Vlad");
        arrayList1.add("Dima");
        arrayList1.add("Igor");
        arrayList1.add("Igor");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Vlad");
        arrayList2.add("Igor");
        arrayList2.add("Dima");

        arrayList1.removeAll(arrayList2);

        System.out.println(arrayList1);
    }

    //Метод ArrayList для удаления элементов списка, которые не содержатся в списке,
    //переданном в качестве аргумента
    public static void _retainAll() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Vlad");
        arrayList1.add("Dima");
        arrayList1.add("Igor");
        arrayList1.add("Masha");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Vlad");
        arrayList2.add("Igor");
        arrayList2.add("Dima");

        arrayList1.retainAll(arrayList2);

        System.out.println(arrayList1);
    }

}