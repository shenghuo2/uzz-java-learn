package cn.shenghuo2.homework7;
//实验5：异常处理

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] data = input.split(" ");
        int sum = 0;
        int count = 0;

        for (String item : data) {
            try {
                int number = Integer.parseInt(item);
                if (number > 0) {
                    sum += number;
                    count++;
                } else if (number == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                // 忽略非整数输入
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%.1f\n", average);
        } else {
            System.out.println("0.0");
        }
    }
}
