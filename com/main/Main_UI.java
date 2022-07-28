package com.main;

import com.Logic.*;

// Driver Code
public class Main_UI {

	public static void toWelcomePage(){
		new Welcome();
	}

	public static void csvUserTEST() {
		User_Data_RW udTest = new User_Data_RW();
		udTest.toReadCSV_User();
		String[][] newArray = udTest.getDataList();
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				System.out.print(newArray[i][j]);
			}
			System.out.println("");
		}
	} 
	public static void csvRoomTEST() {
		Room_Data_RW rdTest = new Room_Data_RW();
		rdTest.toReadCSV_Room();
		String[][] newArray = rdTest.getDataList();
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				System.out.print(newArray[i][j]);
			}
			System.out.println("");
		}
	}
	public static void csvBookingTEST() {
		Booking_Data_RW bdTest = new Booking_Data_RW();
		bdTest.toWriteCSV_Booking("put this line in the csv file");
		//bdTest.toReadCSV_Booking();
		//System.out.println();
		/* 
		String[][] newArray = bdTest.getDataList();
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				System.out.print(newArray[i][j]);
			}
			System.out.println("");
		}
		*/
	}

	public static void main(String[] args) throws Exception{
		//toWelcomePage();
		//csvUserTEST();
		//csvRoomTEST();
		csvBookingTEST();
	}
}