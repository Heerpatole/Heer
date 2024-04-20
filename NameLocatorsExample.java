import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorsExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "E:\\Automation\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//to find the element by using id locators firstly we need to create reference variable of WebElement interface and need to use below syntax
		
		WebElement username= driver.findElement(By.name("email"));
		
		WebElement password= driver.findElement(By.name("pass"));
		

		username.sendKeys("hiralrajendrapatole@gmail.com");
		password.sendKeys("hiral123");
		
		
	}

}
