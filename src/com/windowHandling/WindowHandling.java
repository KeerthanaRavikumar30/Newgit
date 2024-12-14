package com.windowHandling;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		WebElement MultipleWindows = driver.findElement(By.xpath("//button[@id='multi']"));
		MultipleWindows.click();
		List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		for (String x : windowHandles) {
			System.out.println(x);
		}
		driver.switchTo().window(windowHandles.get(1));
		WebElement findElement = driver.findElement(By.id("fruits"));
		Select s=new Select(findElement);
		s.selectByIndex(1);
		driver.switchTo().window(windowHandles.get(2));
		driver.findElement(By.id("accept")).click();
		
	}

}
