package dz7;

public class FinalStatic {
    private static final double PI = 3.14;

    public static double multiplication(double a, double b, double c) {
        return a * b * c;
    }

    public static void division(double a, double b) {
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public void areaOfCircle(double radius) {
        System.out.println("Площадь: " + PI * Math.pow(radius, 2));
    }

    public static void circumference(double radius) {
        System.out.println("Длина окружности: " + 2 * PI * radius);
    }

    public void showInfo(double radius) {
        System.out.println("Радиус: " + radius);
        areaOfCircle(radius);
        circumference(radius);
    }
}

class FinalStaticTest {
    public static void main(String[] args) {
        FinalStatic fs = new FinalStatic();
        fs.showInfo(10);
    }
}