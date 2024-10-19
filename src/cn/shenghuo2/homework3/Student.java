package cn.shenghuo2.homework3;

//张三 85.5 李四 92
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] tokens = input.split(" ");
        if (tokens.length % 2 != 0) {
            System.out.println("输入格式错误，请确保每对姓名和分数之间用空格分隔。");
            return;
        }

        for (int i = 0; i < tokens.length; i += 2) {
            String name = tokens[i];
            String scoreStr = tokens[i + 1];
            double score = Double.parseDouble(scoreStr);
            System.out.printf("stu%d:name=%s,score=%.1f\n", (i / 2) + 1, name, score);
        }
    }
}
