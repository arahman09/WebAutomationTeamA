package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#shellmenu_0")
    public static WebElement microsoft365WebElement;
    @FindBy(how = How.CSS, using = "#shellmenu_1")
    public static WebElement officeWebElement;
    @FindBy(how = How.CSS, using = "#shellmenu_2")
    public static WebElement windowsWebElement;
    @FindBy(how = How.CSS, using = "#shellmenu_3")
    public static WebElement surfaceWebElement;
    @FindBy(how = How.CSS, using = "#shellmenu_4")
    public static WebElement xboxWebElement;
    @FindBy(how = How.CSS, using = "#shellmenu_5")
    public static WebElement dealsWebElement;
    @FindBy(how = How.CSS, using = "#l1_support")
    public static WebElement supportWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"uhf-c-nav\"]/ul/li/div/button/span")
    public WebElement allMicrosoftWebElement;
    @FindBy (how = How.CSS, using = "#search")
    public WebElement searchWebElement;
    @FindBy (how = How.XPATH, using = "//*[@id='uhf-shopping-cart']")
    public WebElement cartWebElement;
    @FindBy (how = How.XPATH, using = "//*[@id='mectrl_main_trigger']/div/div[1]")
    public WebElement signInWebElement;

    public WebElement getMicrosoft365WebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return microsoft365WebElement;
    }
    public WebElement getOfficeWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return officeWebElement;
    }
    public WebElement getWindowsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return windowsWebElement;
    }
    public WebElement getSurfaceWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return surfaceWebElement;
    }
    public WebElement getXboxWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return xboxWebElement;
    }
    public WebElement getDealsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return dealsWebElement;
    }
    public WebElement getAllMicrosoftWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return allMicrosoftWebElement;
    }
    public WebElement getSearchWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return searchWebElement;
    }
    public WebElement getCartWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return cartWebElement;
    }
    public WebElement getSignInWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return signInWebElement;
    }
    public WebElement getSupportWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return supportWebElement;
    }
    public void clickOnMicrosoft365() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMicrosoft365WebElement().click();
    }
    public void clickOnOffice() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getOfficeWebElement().click();
    }
    public void clickOnWindows() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getWindowsWebElement().click();
    }
    public void clickOnSurface() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSurfaceWebElement().click();
    }
    public void clickOnXbox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getXboxWebElement().click();
    }
    public void clickOnDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getDealsWebElement();
    }
    public void clickOnSupport() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSupportWebElement().click();
    }
    public void clickOnAllMicrosoft() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getAllMicrosoftWebElement().click();
    }
    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSearchWebElement().click();
    }
    public void clickOnCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCartWebElement().click();
    }
    public void clickOnSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSignInWebElement().click();
    }
}