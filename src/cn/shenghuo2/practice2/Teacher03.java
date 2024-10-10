package cn.shenghuo2.practice2;
// 10.10 周四 下午78节

public class Teacher03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%dx%d=%d\t", i, j, i*j);
            }
            System.out.println();
        }
    }
}
