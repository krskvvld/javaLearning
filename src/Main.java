public class Main {
    public static void main(String[] args) {
        _Abstract _abstract = new NotAbstract();
        NotAbstract notAbstract = new NotAbstract();

        System.out.println(_abstract.name);
        _Abstract.show();
        System.out.println(notAbstract.name);
        NotAbstract.show();
    }
}

abstract class _Abstract {
    String name = "Vlad";

    static void show() {
        System.out.println("Vlad");
    }
}

class NotAbstract extends _Abstract {
    String name = "neVlad";

    static void show() {
        System.out.println("neVlad");
    }
}