package Task1_Scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Library.Base_Script;
import Generic_Library.Read_Data;
import Pom_Repo.Home_Page;

/***
 * 
 * @author sudarshan
 *
 */
//Vereify that User can add and Remove the Book from the MyBooklist
public class TC_001_Test extends Base_Script {
	@Test
	public void TestCase() throws IOException, InterruptedException {
		//Creatig the Object for the WebPage Webelements
		Home_Page home = new Home_Page(driver);
		WebElement ele = home.getRemoveBook();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_UNIT));

		home.getSearchox().sendKeys(Read_Data.UserData("book"), Keys.ENTER);
		Reporter.log("User Entered the book Sucessfully", true);
		home.getWantRead().click();
		Thread.sleep(2000);
		home.getMyBooks().click();
		Reporter.log("User Navigated to MyBooks Page Sucessfully", true);
		wait.until(ExpectedConditions.visibilityOf(ele));
		home.getRemoveBook().click();

		driver.switchTo().alert().accept();
		Reporter.log("User Remove the book Sucessfully", true);
	}
}
