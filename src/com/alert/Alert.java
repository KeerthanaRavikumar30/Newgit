package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
WebElement ok = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
ok.click();
WebElement ok1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
ok1.click();
org.openqa.selenium.Alert a= driver.switchTo().alert();
Thread.sleep(2000);
a.accept();
WebElement alert2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
alert2.click();
WebElement okCancel = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
Thread.sleep(2000);
okCancel.click();
org.openqa.selenium.Alert a1=driver.switchTo().alert();
Thread.sleep(2000);
a1.dismiss();
WebElement alert3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
alert3.click();
WebElement textBox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
textBox.click();
org.openqa.selenium.Alert a2=driver.switchTo().alert();
Thread.sleep(2000);
a2.sendKeys("keerthana");
Thread.sleep(2000);
a2.accept();
	}

}
