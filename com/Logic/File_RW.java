package com.Logic;

import java.io.*;

public class File_RW {

    static String path = "com\\Database\\testoutput.txt";

    public static void toWriteFile() {
        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(path));
            bWriter.write("writing first line of code");
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void toReadFile() {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(path));
            System.out.println(bReader.readLine());
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*public static void main(String[] args){
        //toWriteFile();
        toReadFile();
    }
    */
}
