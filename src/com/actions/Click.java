package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]"));
		Actions a = new Actions(driver);
		a.click(Mobiles).build().perform();
	//a.contextClick(Mobiles).build().perform();
		driver.navigate().back();
		WebElement Electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		a.click(Electronics).build().perform();
		driver.navigate().back();
		WebElement TodayDeals = driver.findElement(By.xpath("//a[contains(text(),' Deals')]"));
		a.click(TodayDeals).build().perform();
		a.doubleClick(TodayDeals).build().perform();
		
	}

}
