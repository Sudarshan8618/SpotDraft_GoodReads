package Pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/***
 * 
 * @author sudarshan
 *
 */
public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(text(),'Already a member?')]/a[text()='Sign In']")
	private WebElement SignIn;
	@FindBy(xpath = "//button[contains(text(),'Sign in with email')]")
	private WebElement SignInButton;
	@FindBy(id = "ap_email")
	private WebElement EmailTF;
	@FindBy(id = "ap_password")
	private WebElement PasswordTF;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement UserSigIn;

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getSignInButton() {
		return SignInButton;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getUserSigIn() {
		return UserSigIn;
	}

}