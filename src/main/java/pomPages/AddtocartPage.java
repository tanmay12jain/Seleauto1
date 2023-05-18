package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {

	@FindBy (id = "add")
	private WebElement addbtn;
	
	public WebElement getAddbtn() {
		return addbtn;
	}
	@FindBy (xpath = "//button[text() = ' Add to Cart']")
	private WebElement addcart;
	
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void addtocartbtn() {
		addcart.click();
	}
	public WebElement getAddcart() {
		return addcart;
	}
}
