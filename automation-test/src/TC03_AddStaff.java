import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC03_AddStaff {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://lrgs.ftsm.ukm.my/users/a175054/myPT3/");
		 driver.findElement(By.linkText("Menu")).click();
		 driver.findElement(By.linkText("Staffs")).click();
		 driver.findElement(By.id("sid")).click();
		 driver.findElement(By.id("sid")).sendKeys("S008");
		 driver.findElement(By.id("fname")).click();
		 driver.findElement(By.id("fname")).sendKeys("Loki");
		 driver.findElement(By.id("email")).click();
		 driver.findElement(By.id("email")).sendKeys("loki@gmail.com");
		 driver.findElement(By.cssSelector(".glyphicon-plus")).click();
	}
}
