package cn.shenghuo2.homework2;
// 10.10 周四 下午78节
import java.util.Scanner;

public class runnian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
