package cn.shenghuo2.practice2;

public class Teacher01 {
    public static void main(String[] args) {
        byte a = -11, b =3;
//        byte e = a;
        ++b;
        System.out.println(b); //4
        int d = b+++5;
        System.out.println(b); //5
        System.out.println(d); //9 (先算了b+5=9) 再算的b++
        double c = 11.1%3;
        System.out.println(c); //2.0999999999999996
    }
}
