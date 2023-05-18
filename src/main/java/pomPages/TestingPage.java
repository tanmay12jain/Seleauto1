package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy (xpath = "(//a [text()='Selenium Training'])[1]")
	private WebElement selcourse;
	
	@FindBy (id = "mycart")
	private WebElement carttab;
	
	@FindBy (xpath = "(//i [@class= 'fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelcourse() {
		return selcourse;
	}

	public WebElement getCarttab() {
		return carttab;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebookicon() {
		facebook.click();	
	}
		 
	
	
	
}
