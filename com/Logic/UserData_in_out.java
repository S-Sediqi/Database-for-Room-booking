package com.Logic;
import java.io.*;

public class UserData_in_out implements Serializable {
    private String userId;
    private String userFName;
    private String userLName;
    private String userEmail;
    private String userPass;

    public UserData_in_out(String userId, String userFName, String userLName, String userEmail, String userPass) {
        this.userId    = userId;
        this.userFName = userFName;
        this.userLName = userLName;
        this.userEmail = userEmail;
        this.userPass  = userPass;
    }

    // Serializing the input data by the user
    public void toWriteData(Object inData) throws IOException{
        FileOutputStream fos   = new FileOutputStream("com\\DataBase\\UserData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(inData);
        oos.close();
    }

    // De-serializing the data from the txt file 
    public String toReadData(String requestedData) throws IOException, ClassNotFoundException{
        String answer = "";
        FileInputStream fis   = new FileInputStream("com.Database.UserData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		UserData_in_out outData = (UserData_in_out)ois.readObject();
        if (requestedData.equals("id")) {
            answer = outData.userId;
        }
        if (requestedData.equals("first")) {
            answer = outData.userFName;
        }
        if (requestedData.equals("last")) {
            answer = outData.userLName;
        }
        if (requestedData.equals("email")) {
            answer = outData.userEmail;
        }
        if (requestedData.equals("pass")) {
            answer = outData.userPass;
        }
        ois.close();
        return answer;
    }

    public String getUserId(){

        return userId;
    }
		
}