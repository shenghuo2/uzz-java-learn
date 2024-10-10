package cn.shenghuo2.homework2;

import java.util.Scanner;

//输入一个正整数n,1<n<100,计算1!+2!+3! +……+n!的和。
public class jieCheng {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int result = 0;
        for (int j = 1; j <= n; j++) {
            int temp = 1;
            for (int i = 1; i <= j; i++) {
                temp *=i;
            }
            result += temp;
        }

        System.out.println(result);
    }
}
