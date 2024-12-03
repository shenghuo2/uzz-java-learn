package cn.shenghuo2.practice7;

import java.io.FileInputStream;
import java.io.InputStream;

public class Example09 {
    public static void main(String[] args) throws Exception {
        InputStream is = null; // 这input也没用到🤔
        try {
            // 创建一个字节输入流
            FileInputStream fis = new FileInputStream("src/cn/shenghuo2/practice2/Example01.java");
            int b = 0;
            while (true){
                b = fis.read();
                if (b == -1){
                    break;
                }
                System.out.print((char)b);
            }
        }finally {
            if (is != null){
                is.close();
            }
        }
    }
}
