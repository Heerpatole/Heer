import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation\\\\software\\\\chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		
//to maximize the window we can use below code
		 driver.manage().window().maximize();
		 
//1.firstly we need to create an object of webdriver wait class
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 
//2.Now we will use Until Method of WebDriverWait class to implement the conditions of expected class
		 
		 WebElement Username = driver.findElement(By.id("username"));
		 wait.until(ExpectedConditions.visibilityOf(Username));
		 Username.sendKeys("Manali@gmail.com");
		 
		 WebElement Password = driver.findElement(By.id("password"));
		 wait.until(ExpectedConditions.visibilityOf(Password));
		 Password.sendKeys("abc");
		 
		 WebElement login = driver.findElement(By.id("login"));
		 wait.until(ExpectedConditions.visibilityOf(login));
		 login.click();
		 
		 

	}

}
