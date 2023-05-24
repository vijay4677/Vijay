package com.test.demo;

import org.openqa.selenium.WebDriver;

public class testing {

	public static void sleep() throws Exception {
		Thread.sleep(3000);
	}

	static WebDriver open;

	public static void main(String[] args) throws Exception {

		Login a = new Login();
		a.connection();
		open = a.con;
		// Clicks aa1=new Clicks();
		// aa1.getRules();
		CreateRule aa = new Implementation();

		/// Creating the rule through the rule name
		aa.normail();

		//// Deleting the created rule
		for (int i = 0; i < 15; i++) {
			Delete.del2();
		}

		/// Creating the rule through the plus mark
		aa.pluscreate();
		open.close();

	}

}
