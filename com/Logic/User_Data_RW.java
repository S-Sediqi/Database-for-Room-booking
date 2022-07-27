package com.Logic;

import java.io.*;

public class User_Data_RW {

    private String path = "com\\DataBase\\USER_DATA.csv";

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
    public void toReadingCSV_User() {
        try {
            BufferedReader file_out = new BufferedReader(new FileReader(path));
            file_out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
