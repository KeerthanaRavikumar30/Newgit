package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//form//following::input[@type='text']"));// following will
																										// directly send
																										// to the
																										// mentioned tag
		userName.sendKeys("Keerthana");
		WebElement password = driver.findElement(
				By.xpath("//input[@type='text']//following::tr[1]//child::td[2]//child::input[@type='password']"));
		password.sendKeys("abc@123");
//driver.findElement(By.xpath("//a[text()='New User Register Here']//preceding::input[@value='Login']")).click();
		driver.findElement(
				By.xpath("//input[@type='Submit']/parent::td/parent::tr/following-sibling::tr/child::td/child::a"))
				.click();

	}

}
