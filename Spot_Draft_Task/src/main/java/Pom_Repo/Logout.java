package Pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/***
 * 
 * @author sudarshan
 *
 */
public class Logout extends BasePage {

	public Logout(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//img[@alt='Sudarshan']")
	private WebElement ProfileIcons;
	@FindBy(linkText = "Sign out")
	private WebElement SignOut;
	public WebElement getProfileIcons() {
		return ProfileIcons;
	}
	public WebElement getSignOut() {
		return SignOut;
	}

}
