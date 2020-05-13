package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class StaplesHomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "searchInput")
    public static WebElement searchBoxWebElement;
    @FindBy (how = How.XPATH, using = "//div[@id='category-services']")
    public static WebElement servicesAndSolutionsWebElement;

    public WebElement getServicesAndSolutionsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return servicesAndSolutionsWebElement;
    }
    public void clickOnServicesAndSolutions (){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getServicesAndSolutionsWebElement().click();
    }
}
