package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class EntertainmentPage extends Homepage {
//    public EntertainmentPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
    @FindBy(how = How.XPATH, using = "//span[@class='cd__headline-text']")
    public static WebElement entertainmentHeadLineNewsWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a")
    public static WebElement starsWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a")
    public static WebElement screenWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a")
    public static WebElement bingeWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a")
    public static WebElement cultureWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a")
    public static WebElement mediaWebElement;
    @FindBy (how = How.XPATH, using = "//*[@id='entertainment-zone-2']/div[5]/div[1]/div/h2")
    public static WebElement topStoriesWebElement;

    public WebElement getHeadLineNewsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return entertainmentHeadLineNewsWebElement;
    }
    public void clickOnHeadLineNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommonAPI.waitUntilVisible(entertainmentHeadLineNewsWebElement);
        String headLineNews = getHeadLineNewsWebElement().getText();
        System.out.println(headLineNews);
        CommonAPI.waitUntilClickAble(entertainmentHeadLineNewsWebElement);
        getHeadLineNewsWebElement().click();
    }
    public WebElement getStarsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return starsWebElement;
    }
    public WebElement getScreenWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return screenWebElement;
    }
    public WebElement getBingeWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return bingeWebElement;
    }
    public WebElement getCultureWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return cultureWebElement;
    }
    public WebElement getMediaWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return mediaWebElement;
    }
    public WebElement getTopStoriesWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return topStoriesWebElement;
    }
    public void clickOnStarsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getStarsWebElement().click();
    }
    public void clickOnScreenTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getScreenWebElement().click();
    }
    public void clickOnBingeTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getBingeWebElement().click();
    }
    public void clickOnCultureTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getCultureWebElement().click();
    }
    public void clickOnMediaTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getMediaWebElement().click();
    }
    public void clickOnTopStoriesTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getTopStoriesWebElement().click();
    }
}

