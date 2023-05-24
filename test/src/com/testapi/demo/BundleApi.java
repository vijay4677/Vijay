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

public class BundleApi {
	public void bundledat() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("bundlesLiElement")).click();
		Thread.sleep(3000);
        		
		FileStoring aa = new FileStoring(open,open.getTitle());
		aa.storedata();
		open.close();
	}

	public void bundledata1() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("bundlesLiElement")).click();
		Thread.sleep(3000);
		open.findElement(By.cssSelector(
				"#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.d-flex.justify-content-between.align-items-center.mb-3.h-auto > div > div.mr-2 > div > svg"))
				.click();
		open.findElement(By.xpath(
				"//*[@id=\"MainContentPanel\"]/div/div[1]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[1]/a"))
				.click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open);
		aa.storedata();
		open.close();
	}
	public void bundleEditdata() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("bundlesLiElement")).click();
		Thread.sleep(3000);
		open.findElement(By.cssSelector(
				"#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.d-flex.justify-content-between.align-items-center.mb-3.h-auto > div > div.mr-2 > div > svg"))
				.click();
		WebElement ele =open.findElement(By.cssSelector("#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.tableListing > div:nth-child(1) > div > div > div > div:nth-child(2) > div > div.tableCell.order-8.align-items-center.justify-content-center > div > button"));
		JavascriptExecutor js =(JavascriptExecutor) open;
		js.executeScript("arguments[0].scrollIntoView()", ele);
    	Thread.sleep(3000);
    	open.findElement(By.cssSelector("#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.tableListing > div:nth-child(1) > div > div > div > div:nth-child(2) > div > div.tableCell.order-8.align-items-center.justify-content-center > div > button")).click();
    	open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div[1]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[6]/div/div/div/a[1]")).click();
	   Thread.sleep(3000);
    	FileStoring aa=new  FileStoring(open);
	    aa.storedata("Edit");
	    open.close();
	}

}
