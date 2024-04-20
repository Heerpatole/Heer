import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealtiveXPathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation\\software\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/facebook.html");
			
			//1.using simple xpath method by using tag and attributes
	//		WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
	//		username.sendKeys("hiral");
			
	//		WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
	//		 password.sendKeys("hiral");
			 
	//		 WebElement login= driver.findElement(By.xpath("//input[@value='Log In']"));	
	//		 login.click();
			 
			 //2.using AND condition
	//		 WebElement username= driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
	//		 WebElement password= driver.findElement(By.xpath("//input[@id='pass' and @tabindex='2']"));
	//		 WebElement login= driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
			 
			 //3.using OR condition
	//		 WebElement username= driver.findElement(By.xpath("//input[@id='email' 	or @class='inputtext']"));
	//		 WebElement password= driver.findElement(By.xpath("//input[@id='pass' or @tabindex='2']"));
	//		 WebElement login= driver.findElement(By.xpath("//input[@value='Log In' or @type='submit']"));
			 
			 //4.using contains method
	//		 WebElement username= driver.findElement(By.xpath("//input[contains(@name,'ma')]"));
	//		 WebElement password= driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
	//		 WebElement login= driver.findElement(By.xpath("//input[contains(@type,'sub')]"));
			 
			 //5.using starts-with method
	//		 WebElement username= driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
	//		 WebElement password= driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
	//		 WebElement login= driver.findElement(By.xpath("//input[starts-with(@value,'Log')]"));
			 
	//		username.sendKeys("hiral");
	//		 password.sendKeys("hiral");
	//		 login.click();
			
			 //6.using text method
			 WebElement link= driver.findElement(By.xpath("//*[text()='Agile Project']"));
			 link.click();
	}

}
