package cn.shenghuo2.homework2;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i != 0) {
            }else{
                System.out.println("不是");
                break;
            }
        }
        System.out.println("是");
    }
}
