package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				//Launch url
				driver.get("https://opensource-demo.orangehrmlive.com/");
				//maximize window
				driver.manage().window().maximize();
				//Enter usernme
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				//Enter password
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				//click submit button
				//driver.findElement(By.name("Submit")).click();
				//driver.findElement(By.name("Submit")).submit();
				//driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
				WebElement element=driver.findElement(By.name("Submit"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
				Thread.sleep(5000);
				driver.close();
	}

}
