package javaPro.lambda;

public class LambdaEx {
    static void def(I i) {
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        def(s -> s.length());
    }
}

interface I {
    int abc(String s);
}