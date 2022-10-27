//package selenium;
//
//import java.awt.AWTException;
//import java.awt.HeadlessException;
//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//import javax.imageio.ImageIO;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DataTable {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		static WebDriver driver = null;    
//		
//		static {
//		//System.setProperty("webdriver.chrome.drive", "/path/to/chrome/driver.exe");
//		driver = new ChromeDriver();
//		
//		}
//		
//		
//		public static void getTablevalues () {
//			
//			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//			
//			int rows = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr")).size();
//			int cols = driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th")).size();
//			
//			for(int row = 1; row<=rows; row++) {
//				
//				for (int col = 1; col<cols ; col++) {
//					
//					String value = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+row+"]/td["+col+"]")).getText();
//					System.out.println(value);
//					
//				}
//			}
//			
//			WebElement myElement = driver.findElement(By.xpath("//td[contains(text(),'UAE')]"));
//			
//			if(myElement.isDisplayed()) {
//				System.out.println("Dubai value is present in the table : PASS");
//			}
//			else {
//				System.out.println("Dubai value is not present in the table : FAIL");
//			}
//		}
//		
//		//Use this code only to take screenshot on alerts
//		public static void TakescreenshotPopup() throws HeadlessException, AWTException, IOException {
//			BufferedImage image = new Robot().
//					createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
//		    ImageIO.write(image, "png", new File("/Users/vijayabharathi/Desktop/screenshot2.jpeg"));
//		    
//		}
//		
//		//Use this code to take screenshot using Selenium
//		public static void TakeScreenshot() throws IOException {
//			
//			WebDriver driver = new ChromeDriver();
//			
//			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//			
//			TakesScreenshot scrShot =((TakesScreenshot)driver);
//			
//			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//		    File DestFile=new File("/Users/vijayabharathi/Desktop/Feb22.jpeg");
//
//		    FileUtils.copyFile(SrcFile, DestFile);
//			
//
//		}
//
//		public static void main(String[] args) throws IOException {
//			
//			getTablevalues();
//			//TakeScreenshot();
//		}
//
//	}
//
//}
