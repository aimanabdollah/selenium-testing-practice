import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC05_AddOrder {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://lrgs.ftsm.ukm.my/users/a175054/myPT3/");
		    driver.findElement(By.linkText("Menu")).click();
		    driver.findElement(By.linkText("Orders")).click();
		    driver.findElement(By.id("sid")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("sid"));
		      dropdown.findElement(By.xpath("//option[. = 'Khadijah Musa']")).click();
		    }
		    driver.findElement(By.id("cid")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("cid"));
		      dropdown.findElement(By.xpath("//option[. = 'Siti Aisyah']")).click();
		    }
		    driver.findElement(By.name("create")).click();
		    driver.findElement(By.cssSelector("tr:nth-child(5) .btn-warning")).click();
		    driver.findElement(By.id("prd")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("prd"));
		      dropdown.findElement(By.xpath("//option[. = '[Leica] Leica M10']")).click();
		    }
		    driver.findElement(By.id("qty")).click();
		    driver.findElement(By.id("qty")).sendKeys("4");
		    driver.findElement(By.name("addproduct")).click();
		    driver.findElement(By.id("prd")).click();
		    {
		      WebElement dropdown = driver.findElement(By.id("prd"));
		      dropdown.findElement(By.xpath("//option[. = '[Leica] Leica CL']")).click();
		    }
		    driver.findElement(By.id("qty")).click();
		    driver.findElement(By.id("qty")).sendKeys("2");
		    driver.findElement(By.name("addproduct")).click();
		    driver.findElement(By.linkText("Generate Invoice")).click();
		
	}
}