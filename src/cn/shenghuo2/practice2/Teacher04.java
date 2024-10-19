package cn.shenghuo2.practice2;
// 2024.10.17 周四 78节
public class Teacher04 {
    public static void main(String[] args) {
        int[] aa = {1,2,3}; // 定义并赋值
        // 用for打印
        System.out.println("Example1:");
        for (int x:aa){
            System.out.print(x+",");
        }
        // 用新建方法打印
        System.out.println("\nExample2:");
        printArray(aa);
        // 获取arr最大值
        System.out.println("\nExample3:");
        System.out.println("arr max:"+getArrayMax(aa));
    }
    static void printArray(int[] arr){
        for (int x:arr){
            System.out.print(x+",");
        }
    }
    static int getArrayMax(int[] arr){
            int max = arr[0];
            for (int x:arr){
                if(x>max){
                    max = x;
                }
            }
            return max;
    }
}
