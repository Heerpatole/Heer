import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation\\\\software\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		
//to maximize the window we can use below code
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("hiral");
		 driver.findElement(By.id("password")).sendKeys("hiral@123");
		 driver.findElement(By.id("login")).click();
		 
	}

}
