package com.testapi.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.demo.Login;

public class CurrencyApi {
	public void Curdata() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("currencyConversionLiElement")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open,open.getTitle());
		aa.storedata();
		open.close();
	}

	public void Curdata1() throws InterruptedException, FileNotFoundException {
		Login a = new Login();
		a.connection();
		WebDriver open = a.con;
		open.findElement(By.id("currencyConversionLiElement")).click();
		Thread.sleep(3000);
		open.findElement(By.xpath("//*[@id=\"MainContentPanel\"]/div/div[1]/div/div/div[2]/input")).click();
		Thread.sleep(3000);
		FileStoring aa = new FileStoring(open);
		aa.storedata();
		open.close();
	}

}
