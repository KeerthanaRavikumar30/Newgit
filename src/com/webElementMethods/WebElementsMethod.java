package com.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		userName.sendKeys("Keerthana");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(3000);
		password.sendKeys("1234");
		Thread.sleep(3000);
		String attribute = userName.getAttribute("value");
		System.out.println(attribute);
		String attribute2 = password.getAttribute("type");
		System.out.println(attribute2);
		WebElement login = driver.findElement(By.id("login"));
		boolean displayed = login.isDisplayed();
		System.out.println(displayed);
		boolean enabled = login.isEnabled();
		System.out.println(enabled);
		// password.clear();
		login.click();

	}

}
