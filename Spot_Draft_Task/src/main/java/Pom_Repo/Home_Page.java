package Pom_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/***
 * 
 * @author sudarshan
 *
 */
public class Home_Page extends BasePage {

	public Home_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "q")
	private WebElement Searchox;

	@FindBy(xpath = "(//span[text()='Want to Read'])[1]")
	private WebElement WantRead;
	@FindBy(linkText = "My Books")
	private WebElement MyBooks;
	@FindBy(xpath = "//img[@title='Remove from my books']")
	private WebElement RemoveBook;

	public WebElement getSearchox() {
		return Searchox;
	}

	public WebElement getWantRead() {
		return WantRead;
	}

	public WebElement getMyBooks() {
		return MyBooks;
	}

	public WebElement getRemoveBook() {
		return RemoveBook;
	}

}
