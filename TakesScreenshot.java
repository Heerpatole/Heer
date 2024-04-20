import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public abstract class TakesScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//firstly we are creating reference of TakesScreenshot  interface
		org.openqa.selenium.TakesScreenshot ts = (org.openqa.selenium.TakesScreenshot)driver;
		
		
		//calling getscreenshotAs method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		//MOVE THE file into new destination folder
		File destFile = new File("E:\\Images\\pick.png");
		
		//we will copy the screenshot into destination folder
		Files.copy(srcFile, destFile);
		
		
		
	}

}
