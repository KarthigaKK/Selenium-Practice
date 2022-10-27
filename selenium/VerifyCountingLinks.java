package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCountingLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.facebook.com//");
           driver.manage().window().maximize();
           Thread.sleep(5000);
           //Counting no of links in webpage which are under a tag
           List<WebElement> links=driver.findElements(By.tagName("a"));
           System.out.println("No of links in web page:"+links.size());
           System.out.println(links);
           for (WebElement each:links)
           {
        	   String linktext=each.getText();
        	   System.out.println(linktext);
        	   String url=each.getAttribute("href");
        	   System.out.println(url);
        	   System.out.println(linktext+"\n"+url);
           }
           
           Thread.sleep(5000);
           driver.close();
        	   
           
	}

}
