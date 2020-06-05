package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerPage {
@FindBy(id="layered_id_attribute_group_1")
private WebElement sizecb;


@FindBy(id="layered_id_attribute_group_16")
private WebElement color;


@FindBy(xpath="//a[@title='Delivery']")
private WebElement deliverybtn;

public SummerPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void productselection()
{
	sizecb.click();
	color.click();
	deliverybtn.click();
}

}
