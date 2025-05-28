public class Main {
    public static void main(String[] args) {
        I1 i1 = new I1() {
            @Override
            public void abc(boolean b) {
                System.out.println(b);
            }
        };
        i1.abc(true);
        I1 i2 = System.out::println;
        i2.abc(false);
    }
}

interface I1 {
    void abc(boolean b);

    static String age(int age) {
        return age < 18 ? "<18"
                : age == 18 ? "==18"
                : ">18";
    }

    default void g() {
        System.out.println("G");
    }
}

class A {
    String name;
    Integer age;

    public A(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    void abc() {
        System.out.println("NoABC");
    }
}

class B extends A {
    String str;

    @Override
    void abc() {
        System.out.println("ABC");
    }

    public B(String name, Integer age, String str) {
        super(name, age);
        this.str = str;
    }
}

class Example {
    static void show() {
    }

    void show(int x) {
    }
}