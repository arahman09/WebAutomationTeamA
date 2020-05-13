package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsTab extends CommonAPI
{
    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(1)")
    public static WebElement appliancesWebElement;

    public static WebElement getAppliancesWebElement()
    {
        return appliancesWebElement;
    }

    public void clickOnAppliances() {
        getAppliancesWebElement().click();
    }
}

//".items-with-heading li:nth-child(4)")