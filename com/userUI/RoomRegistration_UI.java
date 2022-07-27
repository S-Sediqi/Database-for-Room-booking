package com.userUI;

import com.Logic.*;
import com.main.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RoomRegistration_UI extends JFrame implements ActionListener {

  // Elements of the UI for User Registration
  private Container c;
  private JLabel title;
  private JLabel roomNumber;
  private JTextField rNumber;
  private JLabel roomName;
  private JTextField rName;
  private JLabel roomLocation;
  private JTextField rLocation;
  private JLabel status;
  private JRadioButton r_open;
  private JRadioButton r_close;
  private ButtonGroup roomStatus;
  private JLabel roomCapacity;
  private JTextField rCapacity;
  private JLabel roomResources;
  private JTextField rResources;
  private JCheckBox checkInfo;
  private JButton save;
  private JButton reset;
  private JTextArea info;
  private JLabel res;
  private JTextArea resadd;
  private JButton loginPage;
  private JButton exitButton;

  // the constructor creates each elements of the User Registration UI
  public RoomRegistration_UI() {
    setTitle("Registration");
    setBounds(300, 90, 900, 600);
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    setResizable(false);

    c = getContentPane();
    c.setLayout(null);

    // Creates a title for the input page
    title = new JLabel("Please Enter Your Information");
    title.setFont(new Font("Arial", Font.PLAIN, 28));
    title.setSize(400, 30);
    title.setLocation(300, 30);
    c.add(title);

    // creates a label for the user first name input box
    roomNumber = new JLabel("Room No.");
    roomNumber.setFont(new Font("Arial", Font.PLAIN, 20));
    roomNumber.setSize(100, 20);
    roomNumber.setLocation(50, 100);
    c.add(roomNumber);

    // creates a field for user to enter the first name
    rNumber = new JTextField();
    rNumber.setFont(new Font("Arial", Font.PLAIN, 15));
    rNumber.setSize(100, 20);
    rNumber.setLocation(200, 100);
    c.add(rNumber);

    // creates a label for the user last name input box
    roomName = new JLabel("Room Name");
    roomName.setFont(new Font("Arial", Font.PLAIN, 20));
    roomName.setSize(120, 20);
    roomName.setLocation(50, 150);
    c.add(roomName);

    // creates a field for user to enter the last name
    rName = new JTextField();
    rName.setFont(new Font("Arial", Font.PLAIN, 15));
    rName.setSize(190, 20);
    rName.setLocation(200, 150);
    c.add(rName);

    // creates a label for the user ID input box
    roomLocation = new JLabel("Location");
    roomLocation.setFont(new Font("Arial", Font.PLAIN, 20));
    roomLocation.setSize(100, 20);
    roomLocation.setLocation(50, 200);
    c.add(roomLocation);

    // creates a field for the user to enter the ID/matriculation number
    rLocation = new JTextField();
    rLocation.setFont(new Font("Arial", Font.PLAIN, 15));
    rLocation.setSize(200, 20);
    rLocation.setLocation(200, 200);
    c.add(rLocation);

    // creates a label for the user type/role area
    status = new JLabel("Room Status");
    status.setFont(new Font("Arial", Font.PLAIN, 20));
    status.setSize(120, 20);
    status.setLocation(50, 350);
    c.add(status);

    // creates a button for the user to register as a teacher
    r_open = new JRadioButton("OPEN");
    r_open.setFont(new Font("Arial", Font.PLAIN, 15));
    r_open.setSelected(true);
    r_open.setSize(90, 20);
    r_open.setLocation(200, 350);
    c.add(r_open);

    // creates a label for the user to register as a student
    r_close = new JRadioButton("CLOSE");
    r_close.setFont(new Font("Arial", Font.PLAIN, 15));
    r_close.setSelected(false);
    r_close.setSize(80, 20);
    r_close.setLocation(290, 350);
    c.add(r_close);

    // creates group for the (teacher/student) buttons
    roomStatus = new ButtonGroup();
    roomStatus.add(r_open);
    roomStatus.add(r_close);

    // creates a label for the user Email input box
    roomCapacity = new JLabel("Room Cap.");
    roomCapacity.setFont(new Font("Arial", Font.PLAIN, 20));
    roomCapacity.setSize(100, 20);
    roomCapacity.setLocation(50, 300);
    c.add(roomCapacity);

    // creates a field for the user to enter Email Address
    rCapacity = new JTextField();
    rCapacity.setFont(new Font("Arial", Font.PLAIN, 15));
    rCapacity.setSize(250, 20);
    rCapacity.setLocation(200, 300);
    c.add(rCapacity);

    // creates a label for the user Password input box
    roomResources = new JLabel("Resources");
    roomResources.setFont(new Font("Arial", Font.PLAIN, 20));
    roomResources.setSize(100, 20);
    roomResources.setLocation(50, 250);
    c.add(roomResources);

    // creates a field for the user to enter Password
    rResources = new JTextField();
    rResources.setFont(new Font("Arial", Font.PLAIN, 15));
    rResources.setSize(250, 20);
    rResources.setLocation(200, 250);
    c.add(rResources);

    // reminds the user to recheck the given data
    checkInfo = new JCheckBox("All information is correct.");
    checkInfo.setFont(new Font("Arial", Font.PLAIN, 15));
    checkInfo.setSize(250, 20);
    checkInfo.setLocation(150, 400);
    c.add(checkInfo);

    // sign up the user: the user data gets stored in a (.txt) file as binary data
    save = new JButton("Save");
    save.setFont(new Font("Arial", Font.PLAIN, 15));
    save.setSize(90, 20);
    save.setLocation(100, 450);
    save.setFocusable(false);
    save.addActionListener(this);
    c.add(save);

    // resets or clears all the boxes for user to put new data
    reset = new JButton("Reset");
    reset.setFont(new Font("Arial", Font.PLAIN, 15));
    reset.setSize(90, 20);
    reset.setLocation(200, 450);
    reset.addActionListener(this);
    c.add(reset);

    // closes this specific input panel for user
    exitButton = new JButton("Exit");
    exitButton.setFont(new Font("Arial", Font.PLAIN, 15));
    exitButton.setSize(90, 20);
    exitButton.setLocation(300, 450);
    exitButton.setFocusable(false);
    exitButton.addActionListener(this);
    c.add(exitButton);

    // after the user registered, this button can open the login panel
    loginPage = new JButton("To Login Page");
    loginPage.setFont(new Font("Arial", Font.PLAIN, 15));
    loginPage.setSize(300, 20);
    loginPage.setLocation(500, 450);
    loginPage.setFocusable(false);
    loginPage.addActionListener(this);
    c.add(loginPage);

    // the area where user sees what data is stored
    info = new JTextArea();
    info.setFont(new Font("Arial", Font.PLAIN, 15));
    info.setSize(300, 300);
    info.setLocation(500, 100);
    info.setLineWrap(true);
    info.setEditable(false);
    c.add(info);

    // warns if the check box in not checked
    res = new JLabel("");
    res.setFont(new Font("Arial", Font.PLAIN, 20));
    res.setSize(500, 25);
    res.setLocation(100, 500);
    c.add(res);

    // creates a text area where user could see the input data(data to be stored)
    resadd = new JTextArea();
    resadd.setFont(new Font("Arial", Font.PLAIN, 15));
    resadd.setSize(200, 75);
    resadd.setLocation(580, 175);
    resadd.setLineWrap(true);
    c.add(resadd);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == save) {
      String str1 = "";
      String room_Data = "";
      String op_cl = "";
    // the terms should be first accepted by the user - can check the input again
        if (checkInfo.isSelected()) {
          // shows if the room is a currently open for booking or closed for all
          if (r_open.isSelected()) {
            str1 = "Room status : OPEN " + "\n";
            op_cl = "OPEN, ";
          } 
          if (r_close.isSelected()) {
            str1 = "Room status : CLOSE " + "\n";
            op_cl = "CLOSE, ";
          }
          // gets the user room details (Number, name and location)
          String str2 = "Room No. : " + rNumber.getText() + "\n"
                    + "Room Name :  " + rName.getText() + "\n"
                    + "Room Location  : " + rLocation.getText() + "\n";

          // gets the room capacity; how many sets are available in the room
          String str3 = "Room cap. : " + rCapacity.getText();
          info.setText(str1 + str2 + str3);
          info.setEditable(false);

          // puts all the room data into a Sting separated with comma - for CSV file
          room_Data = op_cl + rNumber.getText()+", "+
                      rName.getText() +", "+
                      rLocation.getText() + ", "+
                      rCapacity.getText()+ ", " +
                      rResources.getText();

          // creates a room data entry and saves the given data into the ROOM CSV file
          Room_Data_RW inCVS = new Room_Data_RW();
          inCVS.toWriteCSV_Room(room_Data);

          res.setText("Room created Successfully!");
        }  
        if (!checkInfo.isSelected()) {
            info.setText("");
            resadd.setText("");
            res.setText("Please check the box (All information is correct).");
        }
      }  
      // resets and clear all the data from their fields
      else if (e.getSource() == reset) {
        String def = "";
        rNumber.setText(def);
        rName.setText(def);
        rCapacity.setText(def);
        rLocation.setText(def);
        rResources.setText(def);
        res.setText(def);
        info.setText(def);
        checkInfo.setSelected(false);
        resadd.setText(def);
      } 
      else if (e.getSource() == loginPage) {
        new UserLogin_UI();
        dispose();
      }
      // gets the user out of the panel
      else if(e.getSource() == exitButton){
        new Controller();
        dispose();
      }
  }
}