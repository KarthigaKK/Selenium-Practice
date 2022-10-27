package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
        Select cars=new Select(driver.findElement(By.id("multiselect1")));
        cars.selectByVisibleText("Volvo");
        cars.selectByVisibleText("Hyundai");
	
        Thread.sleep(5000);
        Select Val=new Select(driver.findElement(By.name("SiteMap")));
        Val.selectByVisibleText("doc 4");
       
        driver.findElement(By.xpath("//a[@href='http://www.Selenium143.blogspot.com']")).click();
        Set<String> sets=driver.getWindowHandles();
        Iterator<String> Itr=sets.iterator();
        String Mainwindow= Itr.next();
        String Secondwindow= Itr.next();
        driver.switchTo().window(Secondwindow);
         Thread.sleep(6000);
         
         driver.findElement(By.xpath("//input[@type='text'][contains(text(),'Password: ']"));
         
        
	}

}
