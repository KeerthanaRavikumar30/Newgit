package com.actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MovetoElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement Kids = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
		Actions a= new Actions(driver);
		a.moveToElement(Kids).build().perform();
		driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		a.click(Kids).build().perform();
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile= new File("C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Screenshot\\sc.png");
		FileHandler.copy(screenshotAs, destinationFile);
		

	}

}
