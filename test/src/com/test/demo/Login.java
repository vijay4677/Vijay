package com.test.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
     public WebDriver con;
	@SuppressWarnings({ "deprecation"})
	public void connection() {
		con =new ChromeDriver();
		con.get("http://localhost:8080/1b_login.jsp");
		con.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		con.manage().window().maximize();
		con.findElement(By.id("j_username")).sendKeys("vijay1");// username
		con.findElement(By.id("j_password")).sendKeys("tarshan");// password
		con.findElement(By.id("adminLoginButton")).click();// login button
    	//con.findElement(By.id("pricingLiElement")).click();// hover over pricing
////		con.findElement(By.id("productsLiElement")).click();// click the rules
	}
	

}
