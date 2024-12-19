package cn.shenghuo2.experiment8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingApp::createLoginWindow);
    }

    private static void createLoginWindow() {
        JFrame frame = new JFrame("登录");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("用户名");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("密码");
        JPasswordField passwordText = new JPasswordField();

        JButton loginButton = new JButton("确定");
        loginButton.addActionListener(e -> createMainWindow());

        JButton cancelButton = new JButton("取消");
        cancelButton.addActionListener(e -> frame.dispose());

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passwordLabel);
        frame.add(passwordText);
        frame.add(loginButton);
        frame.add(cancelButton);

        frame.setVisible(true);
    }

    private static void createMainWindow() {
        JFrame frame = new JFrame("普通员工界面");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu functionMenu = new JMenu("功能管理");
        JMenuItem reportMenuItem = new JMenuItem("汇报工作");
        JMenuItem changePasswordMenuItem = new JMenuItem("修改密码");

        reportMenuItem.addActionListener(e -> createReportWindow());
        changePasswordMenuItem.addActionListener(e -> createChangePasswordWindow());

        functionMenu.add(reportMenuItem);
        functionMenu.add(changePasswordMenuItem);
        menuBar.add(functionMenu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    private static void createChangePasswordWindow() {
        JFrame frame = new JFrame("修改密码");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel oldPasswordLabel = new JLabel("旧密码:");
        JPasswordField oldPasswordText = new JPasswordField();
        JLabel newPasswordLabel = new JLabel("新密码:");
        JPasswordField newPasswordText = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("确认密码:");
        JPasswordField confirmPasswordText = new JPasswordField();

        JButton changeButton = new JButton("修改");

        frame.add(oldPasswordLabel);
        frame.add(oldPasswordText);
        frame.add(newPasswordLabel);
        frame.add(newPasswordText);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordText);
        frame.add(changeButton);

        frame.setVisible(true);
    }

    private static void createReportWindow() {
        JFrame frame = new JFrame("汇报工作");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);

        // Add components for the report window here

        frame.setVisible(true);
    }
}
