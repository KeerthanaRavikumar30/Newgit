package com.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
//		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr/td"));
//		for (WebElement a : table) {
//			System.out.println(a.getText());
//			
//		}
//		List<WebElement> tablerow = driver.findElements(By.xpath("//table/tbody/tr[7]/td"));
//		for (WebElement webElement : tablerow) {
//			System.out.println(webElement.getText());
//			
//		}
//		List<WebElement> TableColumn = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));	
//		for (WebElement webElement : TableColumn) {
//			System.out.println(webElement.getText());
//		}
		WebElement TableRowColumn = driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]"));
		System.out.println(TableRowColumn.getText());
		

	}

}
