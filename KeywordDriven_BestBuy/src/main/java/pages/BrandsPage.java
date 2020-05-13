package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class BrandsPage extends CommonAPI {

    @FindBy (how = How.XPATH, using = "//button[contains(text(),'Brands')]")
    public static WebElement brandsWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(1) > ul > li:nth-child(1) > a")
    public static WebElement appleWebElement;
    @FindBy (how = How.XPATH, using = "//*[@id=\"header-menu-3\"]/li[1]/ul/li[2]/a")
    public static WebElement samsungWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(1) > ul > li:nth-child(3) > a")
    public static WebElement microsoftWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(1) > ul > li:nth-child(4) > a")
    public static WebElement sonyWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(1) > ul > li:nth-child(5) > a")
    public static WebElement intelWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(3) > ul > li:nth-child(1) > a")
    public static WebElement insigniaWebElement;
    @FindBy (how = How.XPATH, using = "//*[@id=\"header-menu-3\"]/li[3]/ul/li[2]/a")
    public static WebElement lenovoWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(3) > ul > li:nth-child(3) > a")
    public static WebElement lgWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(3) > ul > li:nth-child(4) > a")
    public static WebElement nikonElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(3) > ul > li:nth-child(5) > a")
    public static WebElement boseElement;
    @FindBy (how = How.XPATH, using = "//*[@id=\"header-menu-3\"]/li[3]/ul/li[6]/a")
    public static WebElement canonWebElement;
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Epson')]")
    public static WebElement epsonWebElement;
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'GoPro')]")
    public static WebElement goProWebElement;
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'HP')]")
    public static WebElement hpWebElement;
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'All Brands')]")
    public static WebElement allBrandsWebElement;
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Magnolia Audio & Video')]")
    public static WebElement magnoliaAudioWebElement;
    @FindBy (how = How.XPATH, using = "//a[contains(text(),'Pacific Kitchen & Home')]")
    public static WebElement pacificKitchenWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li:nth-child(5) > ul > li:nth-child(3) > a")
    public static WebElement cameraExperienceWebElement;
    @FindBy (how = How.CSS, using = "#header-menu-3 > li.menu-close-item > button > span")
    public static WebElement closeWebElement;

    public WebElement getBrandsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return brandsWebElement;
    }

    public WebElement getAppleWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return appleWebElement;
    }

    public WebElement getSamsungWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return samsungWebElement;
    }

    public WebElement getMicrosoftWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return microsoftWebElement;
    }

    public WebElement getSonyWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return sonyWebElement;
    }

    public WebElement getIntelWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return intelWebElement;
    }

    public WebElement getInsigniaWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return insigniaWebElement;
    }

    public WebElement getLenovoWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return lenovoWebElement;
    }

    public WebElement getLgWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return lgWebElement;
    }

    public WebElement getNikonElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return nikonElement;
    }

    public WebElement getBoseElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return boseElement;
    }

    public WebElement getCanonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return canonWebElement;
    }

    public WebElement getEpsonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return epsonWebElement;
    }

    public WebElement getGoProWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return goProWebElement;
    }

    public WebElement getHpWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return hpWebElement;
    }

    public WebElement getAllBrandsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return allBrandsWebElement;
    }

    public WebElement getMagnoliaAudioWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return magnoliaAudioWebElement;
    }

    public WebElement getPacificKitchenWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return pacificKitchenWebElement;
    }

    public WebElement getCameraExperienceWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return cameraExperienceWebElement;
    }

    public WebElement getCloseWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return closeWebElement;
    }
    public void  clickBrandsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getBrandsWebElement().click();
    }

    public void clickAppleTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getAppleWebElement().click();
    }

    public void clickSamsungTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getSamsungWebElement().click();
    }

    public void clickMicrosoftTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getMicrosoftWebElement().click();
    }

    public void clickSonyTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getSonyWebElement().click();
    }

    public void clickIntelTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getIntelWebElement().click();
    }

    public void clickInsigniaTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getInsigniaWebElement().click();
    }

    public void clickLenovoTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getLenovoWebElement().click();
    }

    public void clickLGTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getLgWebElement().click();
    }

    public void clickNikonTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getNikonElement().click();
    }

    public void clickBoseTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getBoseElement().click();
    }

    public void clickCanonTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getCanonWebElement().click();
    }

    public void clickEpsonTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getEpsonWebElement().click();
    }

    public void clickGoProTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getGoProWebElement().click();
    }

    public void clickHpTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getHpWebElement().click();
    }

    public void clickAllBrandsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getAllBrandsWebElement().click();
    }

    public void clickMagnoliaAudioTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
       getMagnoliaAudioWebElement().click();
    }

    public void clickPacificKitchenTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getPacificKitchenWebElement().click();
    }

    public void clickCameraExperienceTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getCameraExperienceWebElement().click();
    }

    public void clickCloseTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getCloseWebElement().click();
    }
}
