package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingRadio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get collection of radio
		List<WebElement> radios=driver.findElements(By.xpath("//label/div[2]/p"));
		System.out.println("no of radio buttons:"+radios.size());
		
		for (WebElement each:radios)
		{
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.close();
	}

}
