package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

public class GetData {
	static WebDriver open;
  public static void main(String[] args) throws InterruptedException {
	Login a=new Login();
	a.connection();
	open=a.con;
	open.navigate().to("http://localhost:8080/#product:listing");
	Thread.sleep(10000);
	LogEntries logEntries = open.manage().logs().get(LogType.BROWSER);
	for (org.openqa.selenium.logging.LogEntry logEntry : logEntries) {
	    System.out.println(logEntry.getMessage());
	}
	
	
	
	
	  
	  
}
}
