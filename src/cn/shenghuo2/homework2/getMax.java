package cn.shenghuo2.homework2;

import java.util.Scanner;

public class getMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b ;
        a = input.nextInt();
        b = input.nextInt();
//        System.out.println(Math.max(a, b));
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
