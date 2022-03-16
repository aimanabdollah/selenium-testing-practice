import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC01_ViewMenu {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://lrgs.ftsm.ukm.my/users/a175054/myPT3/");
		 driver.findElement(By.linkText("Menu")).click();
		 driver.findElement(By.linkText("Products")).click();
		 driver.findElement(By.linkText("Menu")).click();
		 driver.findElement(By.linkText("Customers")).click();
		 driver.findElement(By.linkText("Menu")).click();
		 driver.findElement(By.linkText("Staffs")).click();
		 driver.findElement(By.linkText("Menu")).click();
		 driver.findElement(By.linkText("Orders")).click();
		 driver.findElement(By.linkText("Home")).click();
	}
}
