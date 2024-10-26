package dz16;

public class _StringBuilder {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }


//    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
//        return sb1.compareTo(sb2) == 0;
//    }

    public static void main(String[] args) {
        System.out.println(equality(new StringBuilder("SB"), new StringBuilder("SB")));
    }
}
