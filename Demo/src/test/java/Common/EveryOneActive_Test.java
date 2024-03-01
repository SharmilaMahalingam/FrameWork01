package Common;

	
	
	
	import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class EveryOneActive_Test {




		@Test
		
	public void demo() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.everyoneactive.com/centre/westcroft-leisure-centre/");
			
			Thread.sleep(2000);
			driver.quit();
			
		}
	}