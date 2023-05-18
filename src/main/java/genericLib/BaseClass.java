package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Propertyfile pdata = new Propertyfile();
	public WebDriverUtilities driverutilies = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyfile("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		
		if(status == 2) {
			Screenshot s = new Screenshot();
			s.getPhoto(driver, name);
		}
	
		driver.quit();
	}

}
