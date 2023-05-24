package com.test.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete {
	static WebDriver open = testing.open;
	public static void del2() throws InterruptedException {
		 WebElement del = new WebDriverWait(open, Duration.ofSeconds(5))
			        .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#MainContentPanel > div > div:nth-child(5) > div > div.rules_list.obds-mx-20.obds-my-12 > div.obds-table-wrap > div.obds-table-row-group > div:nth-child(1) > div:nth-child(4) > div > svg.obds-cursor-pointer.trashTool")));     
			del.click();
			new WebDriverWait(open, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[10]/div/div/div[2]/div/button[2]"))).click();
	        Thread.sleep(3000);
	}
	}
