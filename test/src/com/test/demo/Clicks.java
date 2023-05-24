package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Clicks {
	static WebDriver open = testing.open;
	Com1 a = new Com1();

	public void getRules() {
		open.findElement(By.id("pricingLiElement")).click();// hover over pricing
		open.findElement(By.xpath("//*[@id=\"rulesLiElement\"]")).click();// click the rules
		// sleep();// filter dropdown 1st click
		open.findElement(By.id("select-component")).click();
		// sleep();// filter drop down 2 nd click
		open.findElement(By.id("select-component")).click();
	}

	public void firstRule() throws Exception {

		// sleep();// click the first rule link
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[1]/div[1]/button"))
				.click();
		a.Com();

	}

	public void secRule() throws InterruptedException {
		open.findElement(
				By.xpath("//*[@id=\"MainContentPanel\"]/div/div[4]/div/div[2]/div[2]/div[3]/div[2]/div[1]/button"))
				.click();
		a.Com();

	}

	public void thirdRule() throws InterruptedException {
		open.findElement(
				By.xpath("//*[@id=\"MainContentPanel\"]/div/div[4]/div/div[2]/div[2]/div[3]/div[3]/div[1]/button"))
				.click();
		a.Com();

	}

	public void forthRule() throws InterruptedException {

		open.findElement(
				By.xpath("//*[@id=\"MainContentPanel\"]/div/div[4]/div/div[2]/div[2]/div[3]/div[4]/div[1]/button"))
				.click();
		a.Com();
	}

	public void fivRule() throws InterruptedException {

		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[5]/div[1]/button"))
				.click();
		a.Com();
		Thread.sleep(3000);
		Jsexecuter.scroll();

	}

	public void sixRule() throws InterruptedException {
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[6]/div[1]/button"))
				.click();
		a.Com();
		Thread.sleep(2000);
		Jsexecuter.scroll();
	}

	public void sevRule() throws InterruptedException {
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[7]/div[1]/button"))
				.click();
		a.com710();

	}

	public void eightRule() throws Exception {
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[8]/div[1]/button"))
				.click();
		a.com710();
	}

	public void nineRule() throws InterruptedException {
		open.findElement(By.xpath(
				"//html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[9]/div[1]/button"))
				.click();
		a.com710();
	}

	public void tenRule() throws InterruptedException {
		open.findElement(By.xpath(
				"//html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[10]/div[1]/button"))
				.click();
		a.com710();
	}

	public void elevenRule() throws InterruptedException {
		open.findElement(By.xpath(
				"//html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[11]/div[1]/button"))
				.click();
		a.com1112();

	}

	public void twelveRule() throws InterruptedException {
		open.findElement(By.xpath(
				"//html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[12]/div[1]/button"))
				.click();
		a.com1112();
	}

	public void thirteenRule() throws InterruptedException {
		open.findElement(By.xpath(
				"//html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[13]/div[1]/button"))
				.click();
		WebElement aa = open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div[1]"));
		Actions a = new Actions(open);
		a.click(aa).sendKeys(Keys.ENTER);
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input[1]"))
				.sendKeys("100");
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input[2]"))
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

	public void forteenRule() throws InterruptedException {
		open.findElement(By.xpath(
				"//html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[14]/div[1]/button"))
				.click();
		WebElement aa = open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div[1]"));
		Actions a = new Actions(open);
		a.click(aa).sendKeys(Keys.ENTER);
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input[1]"))
				.sendKeys("100");
		open.findElement(By.xpath(
				"//*[@id=\"rulesReactView\"]/div/form/div/div[2]/div/ul/li/div[2]/div[1]/div[1]/div[2]/div/div[4]/div/input[2]"))
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

	public void fifteenRule() {
		open.findElement(By.xpath(
				"//html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div[4]/div/div[2]/div[2]/div[3]/div[15]/div[1]/button"))
				.click();
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
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/form/div/div[2]/div/ul/li/div[2]/div[2]/div/div/div[3]/input"))
				.sendKeys("100");
		open.findElement(By.cssSelector(
				"#rulesReactView > div > form > div > div.bg-white.align-items-center.d-flex.justify-content-between.border.mt-4.p-3.rounded > div.text-right > button.px-4.btn-theme.mr-3.obbtn.obbtn-theme"))
				.click();

		// sleep();// cancel btn
		open.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div[1]/div/div[1]/div[3]/div/div/div/div/div/div[2]/div[2]/div[2]/button[2]"))
				.click();
	}

}
