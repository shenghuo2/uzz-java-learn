package cn.shenghuo2.experiment7.two;
// 2、	输入输出流的操作：利用字节流和缓冲字节流实现文件的复制，并比较二者的效率。
import java.io.*;

public class FileCopyComparison {
    public static void main(String[] args) {
        String sourcePath = "src/cn/shenghuo2/experiment7/FileTraversal.java";
        String destByteStreamPath = "src/cn/shenghuo2/experiment7/two/destFile_byteStream.txt";
        String destBufferedStreamPath = "src/cn/shenghuo2/experiment7/two/destFile_bufferedStream.txt";

        // 字节流复制文件
        long startTime = System.currentTimeMillis();
        copyFileWithByteStream(sourcePath, destByteStreamPath);
        long endTime = System.currentTimeMillis();
        System.out.println("Byte Stream Copy Time: " + (endTime - startTime) + "ms");

        // 缓冲字节流复制文件
        startTime = System.currentTimeMillis();
        copyFileWithBufferedByteStream(sourcePath, destBufferedStreamPath);
        endTime = System.currentTimeMillis();
        System.out.println("Buffered Byte Stream Copy Time: " + (endTime - startTime) + "ms");
    }

    public static void copyFileWithByteStream(String sourcePath, String destPath) {
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

    public static void copyFileWithBufferedByteStream(String sourcePath, String destPath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {
            int byteData;
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
