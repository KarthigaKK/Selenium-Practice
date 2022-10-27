package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle="google";
		String Expectedtitle=driver.getTitle();
		String Expectedurl="https://";
		String actualurl=driver.getCurrentUrl();
		if(actualtitle.equalsIgnoreCase(Expectedtitle))
		{
			System.out.println("Title matching:"+Expectedtitle);
		}
	    if(actualurl.startsWith(Expectedurl))
	    {
		    System.out.println("url matching:"+Expectedurl+" "+actualurl);
	    }
        Thread.sleep(5000);
        driver.close();
	}

}
