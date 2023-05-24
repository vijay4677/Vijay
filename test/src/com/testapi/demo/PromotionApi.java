package com.testapi.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.demo.Login;

public class PromotionApi {
	public void promodata() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("promotionsLiElement")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open,open.getTitle());
		aa.storedata();
	}

	public void promodata1() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("promotionsLiElement")).click();
		Thread.sleep(3000);
		open.findElement(By.cssSelector("#MainContentPanel > div > div > div.obui > div > div.bg-light.contentHeight > div > div > div > div.align-items-center.d-flex.justify-content-between.py-3.px-4 > div > div > input")).click();
		open.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/table/tr[2]/td[1]/button")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open);
		aa.storedata("Coupon Details");
		open.close();
	}
	public void promoDiscountdata() throws InterruptedException, FileNotFoundException {
		
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("promotionsLiElement")).click();
		Thread.sleep(3000);
		open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div/div[1]/div/div[1]/div/nav/a[2]")).click();
		open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/table/tr[2]/td[1]/button")).click();
		FileStoring aa=new FileStoring(open);
		aa.storedata("Discount Data");
		Thread.sleep(3000);
		open.close();
	    
	}
public void promoCounterdata() throws InterruptedException, FileNotFoundException {
		
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("promotionsLiElement")).click();
		Thread.sleep(3000);
		open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div/div[1]/div/div[1]/div/nav/a[3]")).click();
		open.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/button")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open);
		aa.storedata("Counter Details");
		open.close();
	}
public void promoTraildata() throws InterruptedException, FileNotFoundException {
	
	Login a = new Login();
	a.connection();
	WebDriver open = a.con;
	open.findElement(By.id("promotionsLiElement")).click();
	Thread.sleep(3000);
	open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div/div[1]/div/div[1]/div/nav/a[4]")).click();
	open.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/table/tr[2]/td[1]/div[1]/button")).click();
	Thread.sleep(3000);
	FileStoring aa = new FileStoring(open);
	aa.storedata("Trail Details");
	open.close();
}
}
