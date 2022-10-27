package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionFlipcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.flipkart.com/search?q=Electronics&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
driver.manage().window().maximize();
Thread.sleep(5000);
//Create object for actions class
Actions act=new Actions(driver);
act.sendKeys(Keys.ESCAPE).perform();3
//take mouse to electronics
act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"))).build().perform();

Thread.sleep(5000);
//take mouse to mouse link and click
act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[3]/a[10]"))).click().perform();
Thread.sleep(5000);
act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[5]"))).build().perform();
Thread.sleep(5000);
driver.close();


	}

}
