package com.testapi.demo;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.demo.Login;

public class RuleApi {
public void ruledata() throws InterruptedException, Exception {
	Login a=new Login();
	a.connection();
	WebDriver open=a.con;
	open.findElement(By.id("rulesLiElement")).click();
	 Thread.sleep(3000);
	 FileStoring aa = new FileStoring(open,open.getTitle());
		aa.storedata();
		open.close();
}
public void ruledata1() throws InterruptedException, Exception {
	Login a=new Login();
	a.connection();
	WebDriver open=a.con;
	open.findElement(By.id("rulesLiElement")).click();
	 Thread.sleep(3000);
	 open.findElement(By.id("select-component")).click();
	 open.findElement(By.id("select-component")).click();
	 open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div[4]/div/div[2]/div[2]/div[3]/div[1]/div[1]/button")).click();
	 Thread.sleep(3000);
	 FileStoring aa = new FileStoring(open);
		aa.storedata();
		open.close();
		
}
public void ruleEDitdata() throws InterruptedException, FileNotFoundException {
	Login a=new Login();
	a.connection();
	WebDriver open=a.con;
	open.findElement(By.id("rulesLiElement")).click();
	 Thread.sleep(3000);
	 open.findElement(By.id("select-component")).click();
	 open.findElement(By.id("select-component")).click();
	 open.findElement(By.cssSelector("#MainContentPanel > div > div:nth-child(5) > div > div.rules_list.obds-mx-20.obds-my-12 > div.obds-table-wrap > div.obds-table-row-group > div:nth-child(1) > div:nth-child(4) > div > svg.obds-cursor-pointer.editTool")).click();
	 Thread.sleep(3000);
	 FileStoring aa = new FileStoring(open);
		aa.storedata("edit");
		open.close();
		
	
}
}
