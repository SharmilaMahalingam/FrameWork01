package Beauty;





import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maybell_Test {

	@Test
	
public void demo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.uk/");
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}