package com.main;

import com.Logic.*;

// Driver Code
public class Main_UI {

	public static void toControll(){
		new Controller();
	}

	public static void csvUserTEST() {
		User_Data_RW udTest = new User_Data_RW();
		udTest.toReadCSV_User();
	} 
	public static void csvRoomTEST() {
		Room_Data_RW rdTest = new Room_Data_RW();
		rdTest.toReadCSV_Room();
	}

	public static void main(String[] args) throws Exception{
		//toControll();
		//csvUserTEST();
		csvRoomTEST();
	}
}