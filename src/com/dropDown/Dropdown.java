package com.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
driver.manage().window().maximize();
Thread.sleep(2000);
//single dropdown
WebElement select = driver.findElement(By.id("oldSelectMenu"));
Select s=new Select(select);
Thread.sleep(2000);
s.selectByIndex(1);
Thread.sleep(2000);
s.selectByValue("red");
Thread.sleep(2000);
s.selectByVisibleText("Purple");
//multiselect
WebElement multiSelect = driver.findElement(By.id("cars"));
Select s1= new Select(multiSelect);
s1.selectByIndex(0);
s1.selectByValue("saab");
s1.selectByVisibleText("Opel");
s1.selectByValue("audi");
Thread.sleep(2000);
s1.deselectByIndex(1);
Thread.sleep(2000);
//s1.deselectAll();
System.out.println(s1.isMultiple());
System.out.println(s.isMultiple());
List<WebElement> options = s1.getOptions();
for (WebElement webElement : options) 
{
	System.out.println(webElement.getText());
}
List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
for (int i = 0; i < allSelectedOptions.size(); i++)
{
	System.out.println(allSelectedOptions.get(i).getText());
}
System.out.println(s1.getFirstSelectedOption().getText());
System.out.println(s.getFirstSelectedOption().getText());





	}

}
