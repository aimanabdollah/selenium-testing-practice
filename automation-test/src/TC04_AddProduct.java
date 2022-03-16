import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC04_AddProduct {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://lrgs.ftsm.ukm.my/users/a175054/myPT3/");
		 driver.findElement(By.linkText("Menu")).click();
		 driver.findElement(By.linkText("Products")).click();
		 driver.findElement(By.id("productid")).click();
		 driver.findElement(By.id("productid")).sendKeys("P065");
		 driver.findElement(By.id("productname")).click();
		 driver.findElement(By.id("productname")).sendKeys("Nikon RS45");
		 driver.findElement(By.id("productprice")).click();
		 driver.findElement(By.id("productprice")).sendKeys("2300");
		 driver.findElement(By.id("productbrand")).click();
		 {
		   WebElement dropdown = driver.findElement(By.id("productbrand"));
		   dropdown.findElement(By.xpath("//option[. = 'Nikon']")).click();
		 }
		 driver.findElement(By.cssSelector(".radio:nth-child(2) #user_level")).click();
		 driver.findElement(By.id("warranty_length")).click();
		 {
		   WebElement dropdown = driver.findElement(By.id("warranty_length"));
		   dropdown.findElement(By.xpath("//option[. = '3 years']")).click();
		 }
		 driver.findElement(By.id("productq")).click();
		 driver.findElement(By.id("productq")).sendKeys("5");
		 driver.findElement(By.name("create")).click();		 
		
	}
}
