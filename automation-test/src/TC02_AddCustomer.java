import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC02_AddCustomer {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://lrgs.ftsm.ukm.my/users/a175054/myPT3/");
		 driver.findElement(By.linkText("Menu")).click();
		 driver.findElement(By.linkText("Customers")).click();
		 driver.findElement(By.id("cid")).click();
		 driver.findElement(By.id("cid")).sendKeys("C005");
		 driver.findElement(By.id("fname")).click();
		 driver.findElement(By.id("fname")).sendKeys("Amir");
		 driver.findElement(By.id("email")).click();
		 driver.findElement(By.id("email")).sendKeys("amir@gmail.com");
		 driver.findElement(By.id("phone")).click();
		 driver.findElement(By.id("phone")).sendKeys("+6011-1112122");
		 driver.findElement(By.name("create")).click();		
	}
}