package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

	
				WebDriver driver = new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				//clik on signin without filling username and pasword
				driver.findElement(By.name("proceed")).click();
				Thread.sleep(5000);
				//capture alert text 
				String alerttext=driver.switchTo().alert().getText();
				System.out.println(alerttext);
				Thread.sleep(5000);
				//accept alert
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
				driver.close();

			}

		

}


