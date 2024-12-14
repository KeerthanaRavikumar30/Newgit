package com.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] agrs) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
//	driver.findElement(By.cssSelector("#email")).sendKeys("keerthanaravikuma2430@gmail.com");
//	driver.findElement(By.cssSelector("[data-testid='royal_pass']")).sendKeys("abc@123");
//	driver.findElement(By.cssSelector(".selected ")).click();
	driver.findElement(By.cssSelector("[placeholder^='E']")).sendKeys("keerthanaravikuma2430@gmail.com");
	driver.findElement(By.cssSelector("[data-testid$='s']")).sendKeys("abc@123");
	driver.findElement(By.cssSelector("[data-testid*='login_b']")).click();
	
}
}
