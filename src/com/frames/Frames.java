package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumProject\\Driver129\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://letcode.in/frame");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Keerthana");
Thread.sleep(2000);
driver.switchTo().frame(1);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("keerthanaravikumar2430@gmail.com");
Thread.sleep(2000);
driver.switchTo().parentFrame();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Ravikumar");
Thread.sleep(2000);
driver.switchTo().defaultContent();
WebElement frame = driver.findElement(By.xpath("//h1[text()=' Frame']"));
System.out.println(frame.getText());

	}

}
