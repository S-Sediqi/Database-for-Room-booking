package com.userUI;

import javax.swing.*;

import com.main.Controller;

import java.awt.*;
import java.awt.event.*;

public class RoomBooking_UI extends JFrame implements ActionListener {
    
    private Container c;
    private JLabel title;
    private JButton searchButton;
    private JTextField searchText;
    private JComboBox filter;
    private JButton exitListPanel;
    private String filterChoice;

    public RoomBooking_UI() {
        setTitle("Registration");
        setBounds(300, 90, 1000, 600);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
    
        c = getContentPane();
        c.setLayout(null);
    

        // Creates a title for the input page
        title = new JLabel("FH Room Booking page");
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        title.setSize(400, 30);
        title.setLocation(200, 30);
        c.add(title);

        // creates a search button, which will search the given parameter
        searchButton = new JButton("Search");
        searchButton.setFont(new Font("Arial", Font.PLAIN, 15));
        searchButton.setSize(100, 24);
        searchButton.setLocation(100, 74);
        searchButton.setFocusable(false);
        searchButton.addActionListener(this);
        c.add(searchButton);

        // creates a field for the user to put the search term/text
        searchText = new JTextField();
        searchText.setFont(new Font("Arial", Font.PLAIN, 15));
        searchText.setSize(150, 20);
        searchText.setLocation(200, 76);
        c.add(searchText);

        // creates the filter option for the user
        String filterOptions[] = {"Number", "Name", "Floor"};
        filter = new JComboBox(filterOptions);
        filter.addActionListener(this);
        filter.setFont(new Font("Arial", Font.PLAIN, 15));
        filter.setSize(80, 20);
        filter.setLocation(400, 72);
        c.add(filter);

        // closes this specific input panel for user
        exitListPanel = new JButton("Exit");
        exitListPanel.setFont(new Font("Arial", Font.PLAIN, 15));
        exitListPanel.setSize(100, 20);
        exitListPanel.setLocation(800, 500);
        exitListPanel.setFocusable(false);
        exitListPanel.addActionListener(this);
        c.add(exitListPanel);

        setVisible(true);

    }

    public void setFilter(String str_in) {
        this.filterChoice = str_in;
    }
    public String getFilter() {
        return this.filterChoice;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == filter) {
            setFilter((String) filter.getSelectedItem());
        }
        if (e.getSource() == searchButton) {
            
        }
        if (e.getSource() == exitListPanel) {
            new Controller();
            dispose();
        }

    }
}