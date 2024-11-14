package cn.shenghuo2.practice4;
// 11.14   周四下午78节
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
            int[] d ={0,1};
            System.out.println(d[2]);
        }
        catch (ArithmeticException e) {
            System.out.println("/ zero error");
        }catch (InputMismatchException e) {
            System.out.println("input must be a number. ");
        }catch (Exception e) {
            System.out.println("unexpect error:");
            e.printStackTrace();
        }finally{
            System.out.println("finally");
            sc.close();
        }
    }
}
