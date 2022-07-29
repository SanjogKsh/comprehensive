package com.mindtree.comprehensive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ourcommitment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://tide.com/en-us");
		driver.findElement(By.xpath("//a[@href='/en-us/our-commitment']")).click();
		driver.findElement(By.xpath("//a[@href='/en-us/our-commitment/a-load-of-good'][2]")).click();
		

	}

}
