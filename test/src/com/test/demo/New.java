package com.test.demo;

import java.util.Optional;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.network.model.Request;
import org.openqa.selenium.devtools.v85.network.Network;


public class New {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the Chrome driver executable
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Set the options for the Chrome browser
//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true); // Run Chrome in headless mode (without opening a window)

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Enable the DevTools for the driver
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Enable network interception
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // Set up event listener to capture network requests
        devTools.addListener(Network.requestWillBeSent(), request -> {
            org.openqa.selenium.devtools.v85.network.model.Request requestData = request.getRequest();
            System.out.println("URL: " + requestData.getUrl());
            System.out.println("Method: " + requestData.getMethod());
           
            // You can extract more information from the request object as needed
        });
        Login a=new Login();
           a.connection();
           
           String url = "http://localhost:8080/#product:listing";
  
           driver.get(url);
        // Navigate to the web page you want to scrape
        
        // Close the WebDriver and free up system resources
//        driver.quit();
    }
}
