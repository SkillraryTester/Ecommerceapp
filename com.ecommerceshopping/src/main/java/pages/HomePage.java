package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement serachbutton;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[.='Summer Dresses'])[2]")
	private WebElement summerdress;
	
	

	public WebElement getDress() {
		return dress;
	}




	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public SummerPage summerdrees()
	{
		summerdress.click();
		return new SummerPage(driver);
	}
	
	
	
	public ProductPage serachingfordress(String dress)
	{
		serachtb.sendKeys(dress);
		serachbutton.click();
		return new ProductPage(driver);
		
	}

	

}
