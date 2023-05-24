package com.test.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Jsexecuter {
	static WebDriver open=testing.open;
 public static void scroll() {
		JavascriptExecutor js =(JavascriptExecutor) open;
		js.executeScript("window.scrollBy(0,800)", "");
 }
}
