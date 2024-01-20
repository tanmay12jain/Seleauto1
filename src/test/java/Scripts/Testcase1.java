package Scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilies.switchtabs(driver);
		driverutilies.mouseHover(driver, sd.getCourseBtn());
		sd.seleniumtrainingtab();

		AddtocartPage a = new AddtocartPage(driver);
		driverutilies.dobleClick(driver, a.getAddbtn());
		a.addtocartbtn();
		driverutilies.alertpopup(driver);
		
		driverutilies.dobleClick(driver, a.getAddbtn());
		a.addtocartbtn();
		driverutilies.alertpopup(driver);
		
		

	}
}