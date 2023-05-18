package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {

	@FindBy(id = "course")
	private WebElement courseBtn;
	
	public WebElement getCourseBtn() {
		return courseBtn;
	}
	
	@FindBy(name = "addresstype")
	private WebElement dropdown;	

	public WebElement getDropdown() {
		return dropdown;
	}

	@FindBy(xpath = "(//a[text() = 'Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void seleniumtrainingtab() {
		
		seleniumtraining.click();
	}
	
}
