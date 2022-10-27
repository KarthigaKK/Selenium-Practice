package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(5000);
		//verify fname textbox is enabled or not
		WebElement fname=driver.findElement(By.xpath("//input[@id='u_1d_b_et']"));
		boolean value1=fname.isEnabled();
		System.out.println(value1);
		//verify renter email addresstext box is displayed or not
		WebElement renteremail=driver.findElement(By.xpath("//input[@id='u_1d_j_xM']"));
		boolean value2=renteremail.isDisplayed();
		System.out.println(value2);
		//verify male radio button is active or not
		WebElement maleradio=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
		boolean value3=maleradio.isSelected();
		System.out.println(value3);
		Thread.sleep(5000);
		driver.close();
		

	}

}
