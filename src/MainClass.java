import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/Toshiba/Downloads/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.koton.com/tr/");
		//Assert.assertTrue(driver.getTitle().contains("koton")); // doðrulama 
		driver.manage().window().maximize();
		
		WebElement searchElement = driver.findElement(By.name("text"));//arama butonunu buluyoruz
		searchElement.sendKeys("bluz"); 
		searchElement.submit();
		Thread.sleep(9000);
		driver.quit();
	}

}
