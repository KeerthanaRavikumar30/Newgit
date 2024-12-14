package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement newUser = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		newUser.click();
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Keerthana");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("abc@123");
		Thread.sleep(3000);
		WebElement cPassword = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		cPassword.sendKeys("abc@123");
		Thread.sleep(3000);
		WebElement fullName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fullName.sendKeys("Keerthana");
		Thread.sleep(3000);
		WebElement mail = driver.findElement(By.xpath("//input[@name='email_add']"));
		mail.sendKeys("keerthanaravikumar2430@gmail.com");
		Thread.sleep(3000);
//		WebElement captcha = driver.findElement(By.xpath("//img[@id='captcha']"));
//		captcha.getText();
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement userName1 = driver.findElement(By.xpath("//input[@type='text']"));
		userName1.sendKeys("Keerthana");
		Thread.sleep(3000);
		WebElement password1 = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		password1.sendKeys("abc@123");

	}

}
