package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search
{
    @FindBy(how = How.ID, using = "header-search-bar")
    public static WebElement searchBox;

    @FindBy(how = How.CSS, using = ".Text-sc-1amvtpj-0.iEWJSI")
    public static WebElement submitButton;

    public WebElement getSearchBox()
    {
        return searchBox;
    }

    public WebElement getSubmitButton()
    {
        return submitButton;
    }

    public void typeOnSearchBox(String value)
    {
        searchBox.sendKeys(value, Keys.ENTER);
    }

    public void clickOnSubmitButton()
    {
        submitButton.click();
    }

}
