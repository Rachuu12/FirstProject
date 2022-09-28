package GenericUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeSuite
	public void launchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//System.out.println("Browser launched Successfully");
        driver.manage().window().maximize();
		//System.out.println("window maximized Successfully");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	@BeforeClass(alwaysRun = true)//for full application run
	public void navigateToApplication() {
		driver.get("https://demowebshop.tricentis.com/");
		//System.out.println("Navigate to application Successfully");
	}
	//@AfterMethod(alwaysRun = true)
	//public void takingss(ITestResult result) throws IOException{//check the given test cases is true or not
	//if(result.getStatus()==result.FAILURE) {
	//ScreenShot screenshot=new ScreenShot();
	//screenshot.takingScreenshot(driver, result.getName());
	//}
	//}
	

    @AfterClass
    public void logoutFromApplication()throws IOException {
    	//driver.close();
	//System.out.println("logging out");
	//System.out.println("Logged out Successfully");

}
@AfterSuite
public void teardownTheBrowser() {
	//driver.quit();
	//System.out.println("Browser quitted Successfully");

    }
}	
