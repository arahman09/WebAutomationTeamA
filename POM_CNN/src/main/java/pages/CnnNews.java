package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class CnnNews extends Homepage {

    @FindBy(how = How.CSS, using = ".sc-fMiknA > div:nth-child(1) > a")
    public static WebElement cnnNewsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/a/h2")
    public static WebElement cnnHeadLineNewsWebElement;

    public WebElement getHeadLineNewsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return cnnHeadLineNewsWebElement;
    }

    public void clickOnHeadLineNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.waitUntilVisible(cnnHeadLineNewsWebElement);
        String headLineNews = getHeadLineNewsWebElement().getText();
        System.out.println(headLineNews);
        CommonAPI.waitUntilClickAble(cnnHeadLineNewsWebElement);
        getHeadLineNewsWebElement().click();
    }

    public void clickOnCnnTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCnnNewsWebElement().click();
    }
}

