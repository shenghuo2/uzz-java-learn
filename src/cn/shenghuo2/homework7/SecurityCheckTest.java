package cn.shenghuo2.homework7;
//实验5：异常处理
import java.util.Scanner;

class DangerException extends Exception {
    public DangerException(String itemName) {
        super(itemName + "属于危险品");
    }
}

class Machine {
    private final String[] dangerKeywords = {"枪支", "弹药", "刀具", "汽油", "硫酸"};

    public void check(String name) throws DangerException {
        for (String keyword : dangerKeywords) {
            if (name.contains(keyword)) {
                throw new DangerException(name);
            }
        }
        System.out.println(name + "通过安检");
    }
}

public class SecurityCheckTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine();

        String itemName = scanner.nextLine();

        try {
            machine.check(itemName);
        } catch (DangerException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
