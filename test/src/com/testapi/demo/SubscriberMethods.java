package com.testapi.demo;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.demo.Login;

public class SubscriberMethods {
	Login a = new Login();
    WebDriver open;
	public void subscriberdata() throws FileNotFoundException, InterruptedException {
		a.connection();
		open=a.con;
		open.findElement(By.xpath("//*[@id=\"csrOperationsLiElement\"]")).click();
		Thread.sleep(3000);
		open.findElement(By.id("subscribersLiElement")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open,open.getTitle());
		aa.storedata();
		open.close();
	}

	public void subscriberDetails() throws FileNotFoundException, InterruptedException {
		a.connection();
		open=a.con;
		open.findElement(By.id("csrOperationsLiElement")).click();
		open.findElement(By.id("subscribersLiElement")).click();
		open.findElement(By.cssSelector(
				"#MainContentPanel > div > div.obui > div.d-flex.justify-content-between.align-items-center.mb-3 > div > div.mr-2 > div > svg"))
				.click();
		Thread.sleep(3000);
		open.findElement(By.xpath(
				"//*[@id=\"MainContentPanel\"]/div/div[1]/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div/div/a"))
				.click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open);
		aa.storedata();
		open.close();
	}

	public void susbscriberEditdata() throws FileNotFoundException, InterruptedException {
		a.connection();
		open=a.con;
		open.findElement(By.id("csrOperationsLiElement")).click();
		open.findElement(By.id("subscribersLiElement")).click();
		Thread.sleep(3000);
		open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div[1]/div[2]/div[3]/div/div/div/div[2]/div/div[2]/div/span")).click();
		Thread.sleep(4000);		
		FileStoring aa= new FileStoring(open);
		aa.storedata();
		open.close();
		
		
	}
}
