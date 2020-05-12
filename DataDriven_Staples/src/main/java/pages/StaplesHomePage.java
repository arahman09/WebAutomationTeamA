package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StaplesHomePage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".logo__staplesLogoWrapper") //Class used
    public static WebElement staplesHomePageWebElement;

    @FindBy(how = How.CSS, using = "#searchInput") //ID used
    public static WebElement searchBoxWebElement;

    @FindBy(how = How.CSS, using = ".Dropdown__sectionIconLabel") //Class used
    public static String reorderWebElement;

    @FindBy(how = How.CSS, using = "#category-products") //ID used
    public static WebElement productsWebElement;

    public static WebElement getStaplesHomePageWebElement() {
        return staplesHomePageWebElement;
    }

    public static WebElement getSearchBoxWebElement() {
        return searchBoxWebElement;
    }

    public static String getReorderWebElement() {
        return reorderWebElement;
    }

    public static WebElement getProductsWebElement() {
        return productsWebElement;
    }

    public void clickOnStaplesHomePage() {
        getStaplesHomePageWebElement().click();
    }

    public void clickOnSearchBox() {
        getSearchBoxWebElement().click();
    }

    public void mouseHoverToReorderMenu()
    {
        mouseHoverByCSS(".Dropdown__sectionIconLabel");
    }

    public void clickOnProductsTab()
    {
        getProductsWebElement().click();
    }
}
