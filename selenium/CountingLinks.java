package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(5000);
	    //get collection of links in page which are stored under html anchor tag,Webelement is datatype
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.print("No of links are:"+links.size());
	    Thread.sleep(5000);
	    for(WebElement each:links)
	    {
	    //capture each link text
	    String linkname=each.getText();
	  //Capture each link url
	    String url=each.getAttribute("href");
	    
	    System.out.println(linkname+"\n"+url);
	    }
		Thread.sleep(5000);
		driver.close();

	}

}
