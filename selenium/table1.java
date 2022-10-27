package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get table 10th row details
		String rowdetails=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]")).getText();
		System.out.println("10th row second,first column detail:"+rowdetails);
		Thread.sleep(5000);
		//Store table into webelement
		WebElement table=driver.findElement(By.className("dataTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Table size:"+rows.size());
		
		for(int i=1;i<rows.size();i++)
		{
			//get column collection
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("ROw no:"+i+"COlumn size in each row:"+cols.size());
		}
		
		Thread.sleep(5000);

	}

}
