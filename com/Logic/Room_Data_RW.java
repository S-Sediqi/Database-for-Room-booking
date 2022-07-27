package com.Logic;

import java.io.*;

public class Room_Data_RW {

    private String path = "com\\Database\\ROOM_DATA.csv";

    public Room_Data_RW() {
    }

    // This method saves the room data into ROOM CSV file
    public void toWriteCSV_Room(String room_Input) {
        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(path, true));
            bWriter.write("\n"+room_Input);
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This method reads the data from the ROOM CSV file
    public void toReadCSV_Room() {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(path));
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
