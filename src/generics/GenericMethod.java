package generics;

public class GenericMethod {
    public static void main(String[] args) {
        GenMethod1<String> gm1 = new GenMethod1<>();
        System.out.println(gm1.methodName("S"));
        System.out.println(gm1.methodName(2));

        GenMethod2<String> gm2 = new GenMethod2<>();
        System.out.println(gm2.methodName("S"));
        // System.out.println(gm2.methodName(2));
    }
}

class GenMethod1<T> {
    private T t;

    public <T> T methodName(T t) {
        return t;
    }
}

class GenMethod2<T> {
    private T t;

    public T methodName(T t) {
        return t;
    }
}