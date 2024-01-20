package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtowishlist;
import pomPages.Corejavapage;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchtb(pdata.getPropertyfile("coursename"));
		s.searchbutton();
		
		Corejavapage cj = new Corejavapage(driver);
		cj.corejavacourse();		
		
		Addtowishlist w = new Addtowishlist(driver);
		driverutilies.switchtoframe(driver);
		w.playiconnclick();
		Thread.sleep(3000);
		w.pauseiconclick();
		driverutilies.switchback(driver);
		Thread.sleep(1000);
		w.addtowishlistclick();
		Thread.sleep(1000);
		
		driverutilies.switchtoframe(driver);
		w.playiconnclick();
		Thread.sleep(3000);
		w.pauseiconclick();
		driverutilies.switchback(driver);
		Thread.sleep(1000);
		w.addtowishlistclick();
		Thread.sleep(1000);
		
		
}
}