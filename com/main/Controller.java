package com.main;
import javax.swing.*;

import com.userUI.*;

import java.awt.*;
import java.awt.event.*;

public class Controller extends JFrame implements ActionListener{

    private Container c;
    private JLabel title;
    private JLabel command;
    private JButton loginCommandButton;
    private JButton registerCommandButton;
    private JButton roomCreatingButton;
    private JButton closeProgramButton;

    public Controller() {

        setTitle("FH Room Booking System");
        setBounds(300, 90, 400, 280);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);

        // creates the title for the main Controlling panel
        title = new JLabel("Welcome to FH Room Booking Panel");
        title.setFont(new Font("Arial", Font.PLAIN, 18));
        title.setSize(300, 25);
        title.setLocation(40, 10);
        c.add(title);

        // comments the selected button's action
        command = new JLabel("waiting...");
        command.setFont(new Font("Arial", Font.PLAIN, 15));
        command.setSize(250, 25);
        command.setLocation(50, 200);
        c.add(command);

        // creates a button for initiating/opening login panel
        loginCommandButton = new JButton("Login");
        loginCommandButton.setFont(new Font("Arial", Font.PLAIN, 18));
        loginCommandButton.setSize(120, 30);
        loginCommandButton.setLocation(50, 80);
        loginCommandButton.setFocusable(false);
        loginCommandButton.addActionListener(this);
        c.add(loginCommandButton);

        // creates a button for initiating/opening the registration panel
        registerCommandButton = new JButton("Register");
        registerCommandButton.setFont(new Font("Arial", Font.PLAIN, 18));
        registerCommandButton.setSize(120, 30);
        registerCommandButton.setLocation(200, 80);
        registerCommandButton.setFocusable(false);
        registerCommandButton.addActionListener(this);
        c.add(registerCommandButton);

        // creates a button for closing the whole program 
        closeProgramButton = new JButton("CLOSE PROGRAM");
        closeProgramButton.setFont(new Font("Arial", Font.PLAIN, 18));
        closeProgramButton.setSize(270, 30);
        closeProgramButton.setLocation(50, 160);
        closeProgramButton.setFocusable(false);
        closeProgramButton.addActionListener(this);
        c.add(closeProgramButton);

        // creates a button for admin to create/enter room data
        roomCreatingButton = new JButton("Create Room");
        roomCreatingButton.setFont(new Font("Arial", Font.PLAIN, 18));
        roomCreatingButton.setSize(270, 30);
        roomCreatingButton.setLocation(50, 120);
        roomCreatingButton.setFocusable(false);
        roomCreatingButton.addActionListener(this);
        c.add(roomCreatingButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginCommandButton) {
            // opens the login panel foe the user 
            new UserLogin_UI();
            dispose();
        } 
        else if(e.getSource() == registerCommandButton){
            // opens the registration panel for the user
            new UserRegistration_UI();
            dispose();
        }
        else if (e.getSource() == roomCreatingButton) {
            // opens the panel for admin to create a room
            new RoomRegistration_UI();
            dispose();
        }
        else if(e.getSource() == closeProgramButton){
            System.exit(0);
            //dispose();
        }
    }
}


