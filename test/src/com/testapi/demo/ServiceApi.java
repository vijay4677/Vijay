package com.testapi.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.demo.Login;

public class ServiceApi {

	public void servicedata() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("serivcesLiElement")).click();
		Thread.sleep(3000);
		FileStoring aa=new FileStoring(open,open.getTitle());
    	aa.storedata();
    	open.close();
	}

//	public void servicedata1() throws Throwable {
//		Login a = new Login();
//		a.connection();
//		WebDriver open = a.con;
//		open.findElement(By.id("serivcesLiElement")).click();
//		Thread.sleep(3000);
//		open.findElement(By.cssSelector("#serviceListingReactContainer > div.bg-light > div > div.obtable.obds-table-wrap > div.align-items-center.d-flex.p-4 > div > div > input")).click();
//		open.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div[1]/div/button")).click();
//		Thread.sleep(2000);
//		FileStoring aa=new FileStoring(open);
//    	aa.storedata();
//		
//		
//	}

}
