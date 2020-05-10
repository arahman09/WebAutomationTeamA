package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BestBuyHomePage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".search-input")
    public static WebElement searchWebElement;

    public static WebElement getSearchWebElement()
    {
        return searchWebElement;
    }

    public void clickOnSearchBox()
    {
        getSearchWebElement().click();
    }

    public void typeOnSearchBox(String value)
    {
        searchWebElement.sendKeys(value, Keys.ENTER);
    }











}
