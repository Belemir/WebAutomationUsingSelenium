import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Toshiba/Downloads/chromedriver_74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.koton.com/tr/");
		//Assert.assertTrue(driver.getTitle().contains("koton")); // doðrulama 
		driver.manage().window().maximize();
		
		WebElement searchElement = driver.findElement(By.name("text"));//arama butonunu buluyoruz
		searchElement.sendKeys("bluz"); 
		searchElement.submit();
		Thread.sleep(9000);
		
		WebElement xsElement = driver.findElement(By.xpath(".//div[@class='productListFilter']//div[@class='filterWrapper'][4]//li[@class='show']//label[@for='XS']"));
				
		if (!xsElement.isSelected()) {
			xsElement.click();
		}

		driver.quit();
		
	}

}
