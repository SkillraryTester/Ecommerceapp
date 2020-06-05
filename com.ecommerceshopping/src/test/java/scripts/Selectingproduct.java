package scripts;

import org.testng.annotations.Test;

import genericlibs.Basetest;
import genericlibs.PropertyFile;
import genericlibs.Utilies;
import pages.HomePage;
import pages.LoginPage;
import pages.SummerPage;

public class Selectingproduct extends Basetest {
	@Test
	public void dress()
	{
		PropertyFile p=new PropertyFile();
		Utilies u=new Utilies();
		u.waitforelementtobeloaded(driver);
		LoginPage l=new LoginPage(driver);
		HomePage h = l.validlogin(p.getdata("Email"),p.getdata("password"));
		u.mousehover(driver,h.getDress());
		SummerPage s = h.summerdrees();
		s.productselection();
		
	}

}
