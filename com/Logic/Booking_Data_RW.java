package com.Logic;

import java.io.*;
import java.util.*;

public class Booking_Data_RW {

    private String path = "com\\Database\\USER_DATA.csv";
    private final static String COMMA_DELIMITER = ",";

    private ArrayList<ArrayList<String>> bookingList = new ArrayList<>();
    private ArrayList<String> roomNo_List = new ArrayList<>();
    private ArrayList<String> t1_List = new ArrayList<>();
    private ArrayList<String> t2_List = new ArrayList<>();
    private ArrayList<String> t3_List = new ArrayList<>();
    private ArrayList<String> t4_List = new ArrayList<>();
    private ArrayList<String> t5_List = new ArrayList<>();
    private ArrayList<String> t6_List = new ArrayList<>();

    public Booking_Data_RW() {
    }
    
    // This method gets the String data from user input UI and stores it in the user CSV file 
    public void toWriteCSV_Booking(String booking_Input) { 
        /* 
        try {
            BufferedWriter dataWriter = new BufferedWriter(new FileWriter(path, true));
            dataWriter.write("\n"+booking_Input);
            dataWriter.write("this line should be added");
            dataWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        
        try  {
            File csvFile = new File(path);
            FileWriter fileWriter = new FileWriter(csvFile);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(booking_Input);
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This method reads the data back from the USER CSV file
    public void toReadCSV_Booking() {
        try {
            BufferedReader file_out = new BufferedReader(new FileReader(path));

            String csvLine = "";
            while ( (csvLine = file_out.readLine()) != null ) {
                String[] dataLine = csvLine.split(COMMA_DELIMITER);

                // saving each data of User into a separate ArrayList
                roomNo_List.add(dataLine[0]);
                t1_List.add(dataLine[1]);
                t2_List.add(dataLine[2]);
                t3_List.add(dataLine[3]);
                t4_List.add(dataLine[4]);
                t5_List.add(dataLine[5]);
                t6_List.add(dataLine[6]);
            }
            // adding all ArrayLists to the one ArrayList 
            // the new/big ArrayList will save other ArrayLists as its elements
            bookingList.add(roomNo_List);
            bookingList.add(t1_List);
            bookingList.add(t2_List);
            bookingList.add(t3_List);
            bookingList.add(t4_List);
            bookingList.add(t5_List);
            bookingList.add(t6_List);
            
            file_out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(bookingList);
    }

    public String[][] getDataList(){
        int colSize = bookingList.size();
        int rowSize = bookingList.get(0).size();
        String[][] arrData = new String[rowSize][colSize];

        for (int i = 0; i < arrData.length; i++) {
            for (int j = 0; j < arrData[i].length; j++) {
                arrData[i][j] = bookingList.get(j).get(i);
            }
        }
        return arrData;
    }
    /* 
    public String toTestLists() {
        int a = roomList.get(0).size();
        String answer = Integer.toString(a);
        return answer;
    }
    */
    public String[] getHeaderList() {
        int arrSize = bookingList.size();
        String[] arrHeader = new String[arrSize];

        for (int i = 0; i < arrHeader.length; i++) {
            arrHeader[i] = bookingList.get(i).get(0);
        }
        return arrHeader;
    }
}
