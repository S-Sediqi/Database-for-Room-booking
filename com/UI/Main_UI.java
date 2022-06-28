package com.UI;
import com.userlogic.Data_User_Input;
import com.userlogic.UserLogin;

// Driver Code
public class Main_UI {

	public static void toRegister() {
		Data_User_Input user_Input = new Data_User_Input();
	}

	public static void toLogin(){
		UserLogin log = new UserLogin();
	}

	public static void toControll(){
		Controller con = new Controller();
	}

	public static void main(String[] args) throws Exception{
		//toRegister();
		//toLogin();
		toControll();
	}
}
