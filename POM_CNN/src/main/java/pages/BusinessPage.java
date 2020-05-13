package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;


public class BusinessPage extends Homepage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"business-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[2]/h3/a/span[1]")
    public static WebElement businessHeadLineNewsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[1]/a")
    public static WebElement marketsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[2]/a")
    public static WebElement techWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[3]/a")
    public static WebElement mediaWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[4]/a")
    public static WebElement successWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[5]/a")
    public static WebElement perpectiveWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[6]/a")
    public static WebElement videosWebElement;

    public WebElement getHeadLineNewsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return businessHeadLineNewsWebElement;
    }

    public void clickOnHeadLineNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommonAPI.waitUntilVisible(businessHeadLineNewsWebElement);
        String headLineNews = getHeadLineNewsWebElement().getText();
        System.out.println(headLineNews);
        CommonAPI.waitUntilClickAble(businessHeadLineNewsWebElement);
        getHeadLineNewsWebElement().click();
    }

    public WebElement getMarketsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return marketsWebElement;
    }

    public WebElement getTechWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return techWebElement;
    }

    public WebElement getMediaWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return mediaWebElement;
    }

    public WebElement getSuccessWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return successWebElement;
    }

    public WebElement getPerpectiveWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return perpectiveWebElement;
    }

    public WebElement getVideosWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return videosWebElement;
    }

    public void clickOnMarketsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMarketsWebElement().click();
    }

    public void clickOnTechTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTechWebElement().click();
    }

    public void clickOnMediaTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMediaWebElement().click();
    }

    public void clickOnSuccesTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSuccessWebElement().click();
    }

    public void clickOnPerspectiveTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getPerpectiveWebElement().click();
    }

    public void clickOnVideosTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getVideosWebElement().click();
    }
}