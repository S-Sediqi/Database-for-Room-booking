package com.userUI;

import javax.swing.*;

import com.main.Controller;

import java.awt.*;
import java.awt.event.*;

public class UserLogin_UI extends JFrame implements ActionListener{
    
    private Container c;
    private JLabel title;
    private JLabel userID;
    private JLabel userPass;
    private JTextField userIDField;
    private JTextField userPassField;
    private JRadioButton admin;
    private JRadioButton teacher;
    private JRadioButton student;
    private ButtonGroup userGroup;
    private JLabel loginExecution;
    private JButton loginButton;
    private JButton cancelButton;
    private JButton registrationPage;

    public String checkUserID = "1234";
    public String checkPassword = "pass";

    public UserLogin_UI(){
        
        setTitle("Login Panel");
        setBounds(300, 90, 400, 350);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        // Creates a title for the login page
        title = new JLabel("Please Enter Your Information");
        title.setFont(new Font("Arial", Font.PLAIN, 18));
        title.setSize(250, 25);
        title.setLocation(80, 10);
        c.add(title);
        
        // creates a label for the user name
        userID = new JLabel("username: ");
        userID.setFont(new Font("Arial", Font.PLAIN, 20));
        userID.setSize(100, 20);
        userID.setLocation(50, 50);
        c.add(userID);

        // creates a field for user to enter (username)
        userIDField = new JTextField();
        userIDField.setFont(new Font("Arial", Font.PLAIN, 15));
        userIDField.setSize(190, 20);
        userIDField.setLocation(150, 50);
        c.add(userIDField);

        // creates a label for the user Password
        userPass = new JLabel("password: ");
        userPass.setFont(new Font("Arial", Font.PLAIN, 20));
        userPass.setSize(100, 20);
        userPass.setLocation(50, 100);
        c.add(userPass);

        // creates a field for user to enter Password
        userPassField = new JTextField();
        userPassField.setFont(new Font("Arial", Font.PLAIN, 15));
        userPassField.setSize(190, 20);
        userPassField.setLocation(150, 100);
        c.add(userPassField);

        // creates a label for the user to register as a student
        admin = new JRadioButton("Admin");
        admin.setFont(new Font("Arial", Font.PLAIN, 15));
        admin.setSelected(false);
        admin.setSize(80, 20);
        admin.setLocation(50, 140);
        c.add(admin);

        // creates a button for the user to register as a teacher
        teacher = new JRadioButton("Teacher");
        teacher.setFont(new Font("Arial", Font.PLAIN, 15));
        teacher.setSelected(true);
        teacher.setSize(80, 20);
        teacher.setLocation(150, 140);
        c.add(teacher);

        // creates a label for the user to register as a student
        student = new JRadioButton("Student");
        student.setFont(new Font("Arial", Font.PLAIN, 15));
        student.setSelected(false);
        student.setSize(80, 20);
        student.setLocation(250, 140);
        c.add(student);

        // creates group for the (teacher/student) buttons
        userGroup = new ButtonGroup();
        userGroup.add(admin);
        userGroup.add(teacher);
        userGroup.add(student);

        loginExecution = new JLabel("waiting...");
        loginExecution.setFont(new Font("Arial", Font.PLAIN, 15));
        loginExecution.setSize(250, 25);
        loginExecution.setLocation(50, 260);
        c.add(loginExecution);

        // creates a button for login command input
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
        loginButton.setSize(100, 25);
        loginButton.setLocation(90, 220);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        c.add(loginButton);

        // cancels the login process and exit the panel
        cancelButton = new JButton("Exit");
        cancelButton.setFont(new Font("Arial", Font.PLAIN, 15));
        cancelButton.setSize(100, 25);
        cancelButton.setLocation(210, 220);
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(this);
        c.add(cancelButton);

        // after the login a validated this button allows the user to Room Booking page
        registrationPage = new JButton("Registration");
        registrationPage.setFont(new Font("Arial", Font.PLAIN, 15));
        registrationPage.setSize(220, 25);
        registrationPage.setLocation(90, 180);
        registrationPage.setFocusable(false);
        registrationPage.addActionListener(this);
        c.add(registrationPage);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == loginButton) {
            /* 
            String str1 = userIDField.getText();
            String str2 = userPassField.getText();
            if ( str1.equals(checkUserID) && str2.equals(checkPassword) ) {
                loginExecution.setText("Login successful !");
            } else {
                loginExecution.setText("! wrong username or password !");
            }
            */
            if (admin.isSelected()) {
                new Controller();
                dispose();
            }
            if (teacher.isSelected()) {
                
            }
            if (student.isSelected()) {
                new RoomList_UI();
                dispose();
            }
        } 

        if (e.getSource() == registrationPage) {
            new UserSelfReg_UI();
            dispose();
        }

        if(e.getSource() == cancelButton){
            new Controller();
            dispose();
        }
    }
}
