import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsExamples {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Automation\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//to find the element by using id locators firstly we need to create reference variable of WebElement interface and need to use below syntax
		
		WebElement username= driver.findElement(By.id("email"));
		
		WebElement password= driver.findElement(By.id("pass"));
		
		WebElement login= driver.findElement(By.id("u_0_b"));     //LoginButton
		
		//SENDKEYS method is used to enter the value in textbox
		
		username.sendKeys("hiralrajendrapatole@gmail.com");
		password.sendKeys("hiral123");
		
		login.click();  //click is used to click on any button,radio button,checkbox or link 
		
	}

}
