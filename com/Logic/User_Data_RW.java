package com.Logic;

import java.io.*;
import java.util.*;

public class User_Data_RW {

    private String path = "com\\Database\\USER_DATA.csv";
    private final static String COMMA_DELIMITER = ",";

    private ArrayList<ArrayList<String>> userList = new ArrayList<>();
    private ArrayList<String> uID_List = new ArrayList<>();
    private ArrayList<String> uJob_List = new ArrayList<>();
    private ArrayList<String> uFName_List = new ArrayList<>();
    private ArrayList<String> uLName_List = new ArrayList<>();
    private ArrayList<String> uEmail_List = new ArrayList<>();
    private ArrayList<String> uPass_List = new ArrayList<>();

    public User_Data_RW() {
    }
    
    // This method gets the String data from user input UI and stores it in the user CSV file 
    public void toWriteCSV_User(String user_Input) { 
        try {
            BufferedWriter file_in = new BufferedWriter(new FileWriter(path, true));
            file_in.write("\n"+user_Input);
            file_in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // This method reads the data back from the USER CSV file
    public void toReadCSV_User() {
        try {
            BufferedReader file_out = new BufferedReader(new FileReader(path));

            String csvline = "";
            while ( (csvline = file_out.readLine()) != null ) {
                String[] dataLine = csvline.split(COMMA_DELIMITER);

                // saving each data of User into a separate ArrayList
                uID_List.add(dataLine[0]);
                uJob_List.add(dataLine[1]);
                uFName_List.add(dataLine[2]);
                uLName_List.add(dataLine[3]);
                uEmail_List.add(dataLine[4]);
                uPass_List.add(dataLine[5]);
            }
            // adding all ArrayLists to the one ArrayList 
            // the new/big ArrayList will save other ArrayLists as its elements
            userList.add(uID_List);
            userList.add(uJob_List);
            userList.add(uFName_List);
            userList.add(uLName_List);
            userList.add(uEmail_List);
            userList.add(uPass_List);
            for (ArrayList<String> i : userList) {
                System.out.println(i);
            }
            
            file_out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
