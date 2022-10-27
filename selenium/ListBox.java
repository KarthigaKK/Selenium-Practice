package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver  driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https:\\www.facebook.com\\");
   //click on create new account
    driver.findElement(By.linkText("Create new account")).click();
    Thread.sleep(5000);
    //listbox is identified using <select> html tag 
    //Store month listbox
    Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
    month.selectByVisibleText("Jun");
    Select datelistbox=new Select(driver.findElement(By.xpath("//select[@id='day']")));
    datelistbox.selectByValue("6");
    Select yearlistbox=new Select(driver.findElement(By.xpath("//select[@id='year']")));
    yearlistbox.selectByVisibleText("2000");
    System.out.println(yearlistbox.getFirstSelectedOption().getText());
    
    Thread.sleep(5000);
    boolean valueofdate=datelistbox.isMultiple();
    boolean valueofyear=yearlistbox.isMultiple();
    System.out.println(valueofdate+"\n"+valueofyear);
    Thread.sleep(5000);
    yearlistbox.selectByVisibleText("1987");
    Thread.sleep(5000);
    System.out.println(yearlistbox.getFirstSelectedOption().getText());
    Thread.sleep(5000);
    driver.close();
	}

}
