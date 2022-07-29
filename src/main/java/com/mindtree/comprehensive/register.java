package com.mindtree.comprehensive;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://tide.com/en-us");
		driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
		driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> newpage=ids.iterator();
		String parenttab=newpage.next();
		String childtab=newpage.next();
		driver.switchTo().window(childtab);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ram@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abcd*1234");
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		
		

	}

}
