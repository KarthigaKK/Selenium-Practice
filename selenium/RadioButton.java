package selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//		ChromeOptions op=new ChromeOptions();
//		op.setHeadless(true);//pass op in below cchromedrver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//get collection of radio buttons
List<WebElement> radios=driver.findElements(By.xpath("//form/nav/ul/li/label/strong"));	
System.out.println("No of radio buttons are::"+radios.size());

	}

}
