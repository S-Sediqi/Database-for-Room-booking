package com.Logic;

import java.io.*;
import java.util.*;

public class Room_Data_RW {

    private String path = "com\\Database\\ROOM_DATA.csv";
    private final static String COMMA_DELIMITER = ",";

    private ArrayList<ArrayList<String>> roomList = new ArrayList<>();
    private ArrayList<String> rStatus_List = new ArrayList<>();
    private ArrayList<String> rNo_List = new ArrayList<>();
    private ArrayList<String> rName_List = new ArrayList<>();
    private ArrayList<String> rLocation_List = new ArrayList<>();
    private ArrayList<String> rCapacity_List = new ArrayList<>();
    private ArrayList<String> rResources_List = new ArrayList<>();

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
            
            String csvline = "";
            while ( (csvline = bReader.readLine()) != null ) {
                String[] dataLine = csvline.split(COMMA_DELIMITER);

                // saving each data of room into a separate ArrayList
                rStatus_List.add(dataLine[0]);
                rNo_List.add(dataLine[1]);
                rName_List.add(dataLine[2]);
                rLocation_List.add(dataLine[3]);
                rCapacity_List.add(dataLine[4]);
                rResources_List.add(dataLine[5]);
            }
            // adding all ArrayLists to the one ArrayList 
            // the new/big ArrayList will save other ArrayLists as its elements
            roomList.add(rStatus_List);
            roomList.add(rNo_List);
            roomList.add(rName_List);
            roomList.add(rLocation_List);
            roomList.add(rCapacity_List);
            roomList.add(rResources_List);
            for (ArrayList<String> i : roomList) {
                System.out.println(i);
            }

            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
