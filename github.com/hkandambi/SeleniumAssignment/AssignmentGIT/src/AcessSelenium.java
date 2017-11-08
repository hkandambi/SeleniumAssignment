import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AcessSelenium {
	WebDriver driver;
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","./TestItems\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/");
		hkjdahsdlkasldjlasjdl
	}
	
}
