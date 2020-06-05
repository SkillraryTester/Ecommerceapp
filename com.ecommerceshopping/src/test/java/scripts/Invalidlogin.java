package scripts;

import org.testng.annotations.Test;

import genericlibs.Basetest;
import genericlibs.PropertyFile;
import pages.LoginPage;

public class Invalidlogin extends Basetest{
@Test
public void invalidinputs()
{
	PropertyFile p=new PropertyFile();
	LoginPage l=new LoginPage(driver);
	l.validlogin(p.getdata("invalidemailll"),p.getdata("invaildpassword"));
}
	
}
