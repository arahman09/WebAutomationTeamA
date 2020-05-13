package pages;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HealthPage extends Homepage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"health-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[2]/h3/a/span[1]")
    public static WebElement healthHeadLineWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a")
    public static WebElement foodWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a")
    public static WebElement fitnessWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a")
    public static WebElement wellnessWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a")
    public static WebElement parentingWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a")
    public static WebElement vitalSignsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"health-zone-2\"]/div[6]/div/div[2]/ul/a/h2")
    public static WebElement scienceAndHealthWebElement;

    public WebElement getHeadLineNewsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return healthHeadLineWebElement;
    }
    public void clickOnHeadLineNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CommonAPI.waitUntilVisible(healthHeadLineWebElement);
        String headLineNews = getHeadLineNewsWebElement().getText();
        System.out.println(headLineNews);
        CommonAPI.waitUntilClickAble(healthHeadLineWebElement);
        getHeadLineNewsWebElement().click();
    }

    public WebElement getFoodWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return foodWebElement;
    }

    public WebElement getFitnessWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return fitnessWebElement;
    }

    public WebElement getWellnessWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return wellnessWebElement;
    }

    public WebElement getParentingWebElement() {

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return parentingWebElement;
    }

    public WebElement getVitalSignsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return vitalSignsWebElement;
    }

    public WebElement getScienceAndHealthWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return scienceAndHealthWebElement;
    }
    public void clickOnFoodTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getFoodWebElement().click();
    }
    public void clickOnFitnessTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getFitnessWebElement().click();
    }
    public void clickWellnessTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getWellnessWebElement().click();
    }
    public void clickOnParentingTab() {

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getParentingWebElement().click();
    }
    public void clickOnVitalSignsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getVitalSignsWebElement().click();
    }
    public void clickOnScienceAndHeathTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getScienceAndHealthWebElement().click();
    }

}