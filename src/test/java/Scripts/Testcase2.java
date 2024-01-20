package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{

	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage  s = new  SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage dl = new SkillraryDemoLoginPage(driver);
		driverutilies.switchtabs(driver);
		driverutilies.dropDrown(dl.getDropdown(),pdata.getPropertyfile("coursedd"));
		
		driverutilies.switchtabs(driver);
		driverutilies.dropDrown(dl.getDropdown(),pdata.getPropertyfile("coursedd"));
		
		TestingPage t = new TestingPage(driver);
		driverutilies.draganddrop(driver, t.getSelcourse(), t.getFacebook());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.scrollbar(driver, x, y);
		t.getFacebook();
		
	}
}
