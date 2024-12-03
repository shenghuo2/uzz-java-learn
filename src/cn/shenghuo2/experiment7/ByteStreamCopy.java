package cn.shenghuo2.experiment7;
//3、	转换流的操作：编程实现字节流转换为字符流。
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopy {
    public static void main(String[] args) {
        String sourcePath = "src/cn/shenghuo2/experiment7/FileTraversal.java";
        String destPath = "src/cn/shenghuo2/experiment7/destFile_byteStream.txt";

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
