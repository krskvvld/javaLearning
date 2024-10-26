package dz9.p4;

import dz9.p1.*;
import dz9.p1.p2.*;
import dz9.p1.p2.p3.*;
import dz9.p4.p5.E;

import static dz9.p1.p2.B.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        a.name = "Vlad";
        a.age = 23;

        B b = new B();
        System.out.println(count);
        System.out.println(B.count);
        System.out.println(b.count);

        C c = new C();
        c.department = "Magenta";

        E e = new E();
        e.x = 5;
    }
}
