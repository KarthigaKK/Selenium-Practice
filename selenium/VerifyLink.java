package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		String actuallinktext="gmail";
		String Expectedlinktext=driver.findElement(By.linkText("Gmail")).getText();
		if(Expectedlinktext.equalsIgnoreCase(actuallinktext))
		{
			System.out.println("Verified linktext:"+Expectedlinktext+"  "+actuallinktext);
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
