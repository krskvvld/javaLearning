package dz12;

public class Month {
    public static void _switch(int num) {
        switch (num) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("В месяца 31 день");
                break;
            case 2:
                System.out.println("В месяце 29 дней");
                break;
            case 4, 6, 9, 11:
                System.out.println("В месяце 30 дней");
                break;
            default:
                System.out.println("Введите корректный номер месяца");

//                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("В месяца 31 день");
//                case 2 -> System.out.println("В месяце 29 дней");
//                case 4, 6, 9, 11 -> System.out.println("В месяце 30 дней");
//                default -> System.out.println("Введите корректный номер месяца");
        }
    }

    public static void main(String[] args) {
        _switch(0);
        _switch(1);
        _switch(2);
        _switch(3);
        _switch(4);
        _switch(5);
        _switch(6);
        _switch(7);
        _switch(8);
        _switch(9);
        _switch(10);
        _switch(11);
        _switch(12);
        _switch(13);
    }
}
