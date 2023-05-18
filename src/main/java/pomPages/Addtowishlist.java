package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowishlist {

	@FindBy(xpath = "//div[@id=\"player\"]/div[6]/div[6]/div[1]")
	private WebElement playicon;
	
	@FindBy(xpath = "//div[@id=\"player\"]/div[6]/div[6]/div[1]/button")
	private WebElement pauseicon;
	
	@FindBy(xpath = "//span[text() = 'Add To Wishlist']")
	private WebElement addtowishlistbtn;
	
	public Addtowishlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		public void playiconnclick() {
		playicon.click();
		}
		public void pauseiconclick() {
			pauseicon.click();
		
		}
		public void addtowishlistclick() {
			addtowishlistbtn.click();
		}
	
	
	
}
