package com.testapi.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.demo.Jsexecuter;
import com.test.demo.Login;

public class ProductApi {
     public void getData() throws InterruptedException, FileNotFoundException {
    	 
    	 Login a=new Login();
    	 a.connection();
     	 WebDriver open=a.con;
    	 open.findElement(By.id("productsLiElement")).click();// click the rules
    	 Thread.sleep(3000);
    	FileStoring aa=new FileStoring(open,open.getTitle());
    	aa.storedata();
    	open.close();

 	     
    	 
     }
     public void getProduct1Data() throws InterruptedException, FileNotFoundException {
    	 Login a=new Login();
    	 a.connection();
     	 WebDriver open=a.con;
    	 open.findElement(By.id("productsLiElement")).click();// click the rules
    	 Thread.sleep(3000);
    	open.findElement(By.cssSelector("#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.d-flex.justify-content-between.align-items-center.mb-3.h-auto > div > div.mr-2 > div > svg")).click();
    	Thread.sleep(3000);
    	open.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div/a")).click();
    	Thread.sleep(3000);
		FileStoring aa = new FileStoring(open);
		aa.storedata();
		open.close();
     }
     public void getProduct1editData() throws Throwable {
    	 Login a=new Login();
    	 a.connection();
     	 WebDriver open=a.con;
    	 open.findElement(By.id("productsLiElement")).click();// click the rules
    	 Thread.sleep(3000);
    	open.findElement(By.cssSelector("#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.d-flex.justify-content-between.align-items-center.mb-3.h-auto > div > div.mr-2 > div > svg")).click();
    	Thread.sleep(3000);
    	JavascriptExecutor js =(JavascriptExecutor) open;
    	WebElement ele=open.findElement(By.cssSelector("#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.tab-content > div.fade.tab-pane.active.show > div > div:nth-child(1) > div > div > div > div:nth-child(2) > div:nth-child(1) > div.tableCell.order-10.align-items-center.justify-content-center > div > button"));
    	js.executeScript("arguments[0].scrollIntoView()", ele);
    	Thread.sleep(3000);
    	open.findElement(By.cssSelector("#MainContentPanel > div > div.inner-spacer.widget-content > div.obui > div.tab-content > div.fade.tab-pane.active.show > div > div:nth-child(1) > div > div > div > div:nth-child(2) > div:nth-child(1) > div.tableCell.order-10.align-items-center.justify-content-center > div > button")).click();
    									
    	open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div[1]/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[6]/div/div/div/a[1]")).click();
    	Thread.sleep(3000);
    	FileStoring aa = new FileStoring(open);
		aa.storedata("edit");
		open.close();
     }
     
}
