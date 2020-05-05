package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class CnnNews extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".sc-fMiknA > div:nth-child(1) > a:nth-child(1) > svg:nth-child(1) > rect")
    public static WebElement headLineNewsWebElement;

    public WebElement getHeadLineNewsWebElement()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return headLineNewsWebElement;
    }
    public void clickOnHeadLineNews()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.waitUntilVisible(headLineNewsWebElement);
        String headLineNews = getHeadLineNewsWebElement().getText();
        System.out.println(headLineNews);
        CommonAPI.waitUntilClickAble(headLineNewsWebElement);
        getHeadLineNewsWebElement().click();
    }

}

