import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select = new Select(fruits);
		
		//to check the if we can select the multiple value from the dropdown we can use ismultiple
		
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByValue("orange");
			select.selectByVisibleText("Apple");
		}
		// select.deselectByIndex(0);
		// select.deselectByValue("orange");
		// select.deselectByVisibleText("apple");
		    select.deselectAll();
	}

}
