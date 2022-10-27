package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapDrop2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//get collection of iframes in the webpage
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames in webpage:"+frame.size());
		//going to first frame
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build();
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(5000);
		driver.close();
	}

}
