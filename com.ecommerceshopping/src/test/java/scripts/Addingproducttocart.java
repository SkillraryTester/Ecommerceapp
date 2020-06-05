package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibs.Basetest;
import genericlibs.PropertyFile;
import genericlibs.Utilies;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class Addingproducttocart extends Basetest {
	@Test
	public void addingproduct()
	{
		PropertyFile p=new PropertyFile();
		Utilies u=new Utilies();
		u.waitforelementtobeloaded(driver);
		LoginPage l=new LoginPage(driver);
		HomePage h = l.validlogin(p.getdata("Email"),p.getdata("password"));
		String t = driver.getTitle();
		Assert.assertEquals(t,p.getdata("homepage"));
		ProductPage pr = h.serachingfordress(p.getdata("productname"));
		u.dropdown(pr.getSortdropdown(),p.getdata("sort"));
		CartPage c = pr.selectingdress();
		for(int i=0;i<=3;i++)
		{
		c.plusbutton();
		}
		u.dropdown(c.getSizedropdown(),p.getdata("size"));
		c.addingtocart();
		
	}

}
