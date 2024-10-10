package cn.shenghuo2.homework2;

import java.util.Scanner;

public class addThreeNumberValue {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
//        System.out.println(a);
        if (num<100 | num>999) {
            System.out.println("ERROR");
        }
        else {
            int result = num/100+ 678/10%10 +num%10;
            System.out.println(result);
        }
    }
}
