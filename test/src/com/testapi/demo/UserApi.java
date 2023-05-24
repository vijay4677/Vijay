package com.testapi.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.demo.Login;

public class UserApi {
	
	public void userdata() throws InterruptedException, FileNotFoundException {
		Login a=new Login();
		a.connection();
		WebDriver open=a.con;
		open.findElement(By.id("usageRatingLiElement")).click();
		 Thread.sleep(3000);
	  FileStoring aa=new FileStoring(open,open.getTitle());
	  aa.storedata();
	  open.close();
	}
	public void userdata1() throws InterruptedException, FileNotFoundException {
		Login a=new Login();
		a.connection();
		WebDriver open=a.con;
		open.findElement(By.id("usageRatingLiElement")).click();
		 Thread.sleep(3000);
		 open.findElement(By.xpath("//*[@id=\"ratingEngineDashAnchorEx\"]")).click();
		 open.findElement(By.xpath("//*[@id=\"ratingEngineMenuViewAnchor\"]")).click();
		 open.findElement(By.id("chargeCategoryGroupAnchor")).click();
		 Thread.sleep(3000);
	  FileStoring aa=new FileStoring(open);
	  aa.storedata("Charge Group");
	  open.close();
	  
	}
	public void userdata2() throws InterruptedException, FileNotFoundException {
		Login a=new Login();
		a.connection();
		WebDriver open=a.con;
		open.findElement(By.id("usageRatingLiElement")).click();
		 Thread.sleep(3000);
		 open.findElement(By.xpath("//*[@id=\"ratingEngineDashAnchorEx\"]")).click();
		 open.findElement(By.xpath("//*[@id=\"ratingEngineMenuViewAnchor\"]")).click();
		 open.findElement(By.id("eventCategoryRulesAnchor")).click();
		 Thread.sleep(3000);
	  FileStoring aa=new FileStoring(open);
	  aa.storedata("Event Group");
	  open.close();
	}
	public void userdata3() throws InterruptedException, FileNotFoundException {
		Login a=new Login();
		a.connection();
		WebDriver open=a.con;
		open.findElement(By.id("usageRatingLiElement")).click();
		 Thread.sleep(3000);
		 open.findElement(By.xpath("//*[@id=\"ratingEngineDashAnchorEx\"]")).click();
		 open.findElement(By.xpath("//*[@id=\"ratingEngineMenuViewAnchor\"]")).click();
		 open.findElement(By.id("dayCodeAnchor")).click();
		 Thread.sleep(3000);
	  FileStoring aa=new FileStoring(open);
	  aa.storedata("Day and Time");
	  open.close();
	}
	
}
