package com.browserLn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrLaunch {
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=4945778236281115454&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061940&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	}

}
