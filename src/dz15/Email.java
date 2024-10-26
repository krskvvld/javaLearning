package dz15;

public class Email {
    public static void email(String email) {
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                count++;
            }
        }

        int sobachkaIndex = email.indexOf("@");
        int pointIndex = email.indexOf(".");

        for (int i = 0; i < count; i++) {
            System.out.println(email.substring(sobachkaIndex + 1, pointIndex));
            sobachkaIndex = email.indexOf("@", sobachkaIndex + 1);
            pointIndex = email.indexOf(".", pointIndex + 1);
        }

//        String[] arr = email.split(";");
//
//        for (String str : arr) {
//            str = str.trim();
//            System.out.println(str.substring(str.indexOf("@") + 1, str.indexOf(".")));
//        }
    }

    public static void main(String[] args) {
        email("krskvvld@gmail.com; krskvvld@mail.ru; krskvvld@ya.ru;");
    }
}
