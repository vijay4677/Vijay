package com.testapi.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;

public class FileStoring {
	WebDriver open;
	static String a;
    public FileStoring(WebDriver open) {
    	this.open=open;
    }
	@SuppressWarnings("static-access")
	public FileStoring(WebDriver open,String a) throws FileNotFoundException {
		this.open = open;
		this.a=a;
		}
	public void storedata() throws FileNotFoundException {
		String fileNAme="/home/vijay/Desktop/"+a+".text";
		File myObj = new File(fileNAme);
		File file = new File(fileNAme);
		FileOutputStream fos = new FileOutputStream(file, true);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(open.getTitle());
		System.out.println(open.manage().logs().get("browser").getAll());
	
	}
	public void storedata(String edit) throws FileNotFoundException {
		String fileNAme="/home/vijay/Desktop/"+a+".text";
		File myObj = new File(fileNAme);
		File file = new File(fileNAme);
		FileOutputStream fos = new FileOutputStream(file, true);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(open.getTitle()+edit);
		System.out.println(open.manage().logs().get("browser").getAll());
	
	}

}
