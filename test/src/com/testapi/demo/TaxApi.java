package com.testapi.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.demo.Login;

public class TaxApi {

	public void taxdata() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("taxConfigurationLIElement")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open,open.getTitle());
		aa.storedata();
		open.close();
	}

	public void taxdata1() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("taxConfigurationLIElement")).click();
		Thread.sleep(3000);
		open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open);
		aa.storedata();
		open.close();
	}
	
}
