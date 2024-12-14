package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement userName = driver
				.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input"));
		userName.sendKeys("Keerthana");
		WebElement password = driver
				.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[3]/td[2]/input"));

		password.sendKeys("abc@123");
		WebElement login = driver
				.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input"));
		login.click();
	}

}
