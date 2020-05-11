package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class Homepage extends CommonAPI {

    @FindBy (how = How.XPATH, using = "//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li[4]/a")
    public static WebElement businessWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li[6]/a")
    public static WebElement healthWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li[7]/a")
    public static WebElement entertainmentWebElement;

    @FindBy(how = How.CSS, using = ".sc-fMiknA > div:nth-child(1) > a")
    public static WebElement cnnNewsWebElement;

    public WebElement getBusinessWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return businessWebElement;
    }
    public WebElement getHealthWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return healthWebElement;
    }
    public WebElement getEntertainmentWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return entertainmentWebElement;
    }

    public WebElement getCnnNewsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return cnnNewsWebElement;
    }

    public void clickOnBusinessTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBusinessWebElement().click();
    }
    public void clickOnHealthTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHealthWebElement().click();
    }
    public void clickOnEntertainmentTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEntertainmentWebElement();
    }
    public void clickOnCnnTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCnnNewsWebElement().click();
    }
    public void cnnTitle () {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        System.out.println(driver.getTitle());
    }
}
