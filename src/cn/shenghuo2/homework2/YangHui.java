package cn.shenghuo2.homework2;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入行数 n
        int n = scanner.nextInt();

        // 定义一个二维数组来存储杨辉三角的值
        int[][] triangle = new int[n][n];

        // 构造杨辉三角
        for (int i = 0; i < n; i++) {
            // 每行的第一个和最后一个元素为 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // 填充内部的值
            for (int j = 1; j < i; j++) {
                // 当前值等于上一行的左上角和正上方的值之和
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // 打印杨辉三角形，使用制表符进行格式化
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println(); // 换行
        }

        scanner.close();
    }
}
