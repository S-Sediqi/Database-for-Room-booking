package com.Logic;

import java.io.*;

public class Data_Reader_Writer {

    //Data_Reader_Writer() {

    //}
    
    public void writingCSV(String input) { 
        String path = "com\\DataBase\\test.csv";
        File dataFile = new File(path);
        try {
            PrintWriter file_in = new PrintWriter(dataFile);

            //file_in.println(input);
            file_in.append(input);
            file_in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readingCSV() {

    }

    //public static void main(String[] args) {
    //    writingCSV("this is the input text");
    //}
}
