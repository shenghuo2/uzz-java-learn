package cn.shenghuo2.homework2;

import java.util.Scanner;

public class fourValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        int maxNum = nums[0];
        int minNum = nums[0];
        int evenCount = 0;
        int evenSum = 0;

        for (int number : nums) {
            if (number > maxNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }

            if (number % 2 == 0) {
                evenCount++;
                evenSum += number;
            }
        }

        double evenAverage = (evenCount > 0) ? (double) evenSum / evenCount : 0.0;

        System.out.printf("最大值是%d\n", maxNum);
        System.out.printf("最小值是%d\n", minNum);
        System.out.printf("偶数的个数是%d\n", evenCount);
        System.out.printf("偶数的平均值是%.2f\n", evenAverage);

        sc.close();

    }
}
