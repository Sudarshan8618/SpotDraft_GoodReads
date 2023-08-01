package Generic_Library;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Pom_Repo.LoginPage;
import Pom_Repo.Logout;

/***
 * 
 * @author Suadrshan
 *
 *
 *
 */
public class Base_Script implements Constants_Values {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void LaunchBrowser() throws IOException {
		String uri = Read_Data.UserData("url");
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser Window Maximized",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_UNIT));
		driver.get(uri);
		Reporter.log("User Navigated to Url Sucessfully",true);
	}

	@BeforeMethod
	public void loginPage() throws IOException {
		Reporter.log("User Navigated to Login page",true);
		LoginPage login = new LoginPage(driver);
		
		login.getSignIn().click();
		login.getSignInButton().click();
		login.getEmailTF().sendKeys(Read_Data.UserData("username"));
		login.getPasswordTF().sendKeys(Read_Data.UserData("password"));
		login.getUserSigIn().click();
		Reporter.log("User Login Sucessfully",true);
	}

	@AfterMethod(alwaysRun = true)
	public void Userlogout() {
		Logout logout = new Logout(driver);
		logout.getProfileIcons().click();
		logout.getSignOut().click();
		Reporter.log("User LOgout Sucessfully",true);
	}

	@AfterClass
	public void TearBrowser() {
		driver.quit();
		Reporter.log("Browser Closed Sucessfully",true);
	}
}
