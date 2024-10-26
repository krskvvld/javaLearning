package dz1;

public class DataTypes {
    public static void main(String[] args) {
        byte b1 = 0b1100;
        byte b2 = 014;
        byte b3 = 12;
        byte b4 = 0xC;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 0b10100010100;
        short s2 = 02424;
        short s3 = 1300;
        short s4 = 0x514;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0b0;
        int i3 = 00;
        int i2 = 0;
        int i4 = 0x0;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 0b111010110111100110100010101l;
        long l2 = 0726746425;
        long l3 = 123456789L;
        long l4 = 0x75BCD15L;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }
}