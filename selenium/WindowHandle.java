package selenium;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.noetic-learning.com/mathcontest/index.jsp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id:"+parent);
		Set<String> allwinds=driver.getWindowHandles();
		System.out.println("all child window id"+allwinds);
	

		
		

	}

}
