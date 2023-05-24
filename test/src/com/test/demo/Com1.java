package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Com1 {
	WebDriver open = testing.open;

	public void Com() throws InterruptedException {
		WebElement aa = open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div[1]"));
		Actions a = new Actions(open);
		// sleep();// click the dropdown
		a.click(aa).perform();
		// sleep();// click the dropdown 1st options
		a.sendKeys(Keys.ENTER).perform();
		// sleep();// these are the for option selecting
		a.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		// sleep();
		a.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		a.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
		// sleep();//enter the city
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input"))
				.sendKeys("cbe");
		// sleep();//move to the error msg
		a.sendKeys(Keys.TAB, Keys.TAB);
		// sleep();//send the error msg
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/form/div/div[2]/div/ul/li/div[2]/div[2]/div/div/div[3]/input"))
				.sendKeys("error");
		// sleep();// save button
		open.findElement(By.cssSelector(
				"#rulesReactView > div > form > div > div.bg-white.align-items-center.d-flex.justify-content-between.border.mt-4.p-3.rounded > div.text-right > button.px-4.btn-theme.mr-3.obbtn.obbtn-theme"))
				.click();

		// sleep();// cancel btn
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div/div/div[2]/div[2]/div[2]/button[2]"))
				.click();
		Thread.sleep(3000);
	}

	public void com710() throws InterruptedException {
		WebElement aa = open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div[1]"));
		Actions a = new Actions(open);
		a.click(aa).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER)
				.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input[1]"))
				.sendKeys("100");
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input[2]"))
				.sendKeys("100");
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[2]/div[1]/div/div[3]/input"))
				.sendKeys("discount");
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[2]/div[2]/div/div[3]/input"))
				.sendKeys("100");
		// sleep();// save button
		open.findElement(By.cssSelector(
				"#rulesReactView > div > form > div > div.bg-white.align-items-center.d-flex.justify-content-between.border.mt-4.p-3.rounded > div.text-right > button.px-4.btn-theme.mr-3.obbtn.obbtn-theme"))
				.click();

		// sleep();// cancel btn
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div/div/div[2]/div[2]/div[2]/button[2]"))
				.click();
		Thread.sleep(3000);
		Jsexecuter.scroll();
	}

	public void com1112() throws InterruptedException {
		WebElement aa = open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div[1]"));
		Actions a = new Actions(open);
		a.click(aa).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER)
				.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).perform();
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input"))
				.sendKeys("cbe");
		// sleep();//move to the error msg
		a.sendKeys(Keys.TAB, Keys.TAB);
		// sleep();//send the error msg
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/form/div/div[2]/div/ul/li/div[2]/div[2]/div/div/div[3]/input"))
				.sendKeys("100");
		// sleep();// save button
		open.findElement(By.cssSelector(
				"#rulesReactView > div > form > div > div.bg-white.align-items-center.d-flex.justify-content-between.border.mt-4.p-3.rounded > div.text-right > button.px-4.btn-theme.mr-3.obbtn.obbtn-theme"))
				.click();

		// sleep();// cancel btn
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div/div/div[2]/div[2]/div[2]/button[2]"))
				.click();
		Thread.sleep(2000);
		Jsexecuter.scroll();
	}

}
