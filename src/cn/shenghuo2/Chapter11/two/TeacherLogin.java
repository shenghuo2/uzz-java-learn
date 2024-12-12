package cn.shenghuo2.Chapter11.two;

// 12.12 周四下午78节
import javax.swing.*;
import java.awt.*;

public class TeacherLogin {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("title here");
        f1.setVisible(true);
        f1.setBounds(200,200,600,500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel name = new JLabel("username:");
        JLabel passwd = new JLabel("passwd:");
        JTextField passwdInput = new JTextField(20);
//        name.setBounds(20,20,100,30);
//        passwd.setBounds(20,40,100,30);
//        passwdInput.setBounds(120,80,100,30);
        JButton ok = new JButton("ok");
        JButton cancel = new JButton("cancel");
        f1.setLayout(new FlowLayout());
        f1.add(name);
        f1.add(passwd);
        f1.add(passwdInput);
        f1.add(ok);
        f1.add(cancel);
    }
}
