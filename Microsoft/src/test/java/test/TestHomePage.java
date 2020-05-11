package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

public class TestHomePage extends CommonAPI {

    HomePage homePage= null;

    @Test (priority = 1)
    public void verifyTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        System.out.println("Microsoft Web Page Title is: " + driver.getTitle());
    }
    @Test (priority = 2)
    public void microsoft365Tab() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMicrosoft365();
    }
    @Test (priority = 3)
    public void OfficeTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnOffice();
    }
    @Test (priority = 4)
    public void windowsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnWindows();
    }
    @Test(priority = 5)
    public void surfaceTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSurface();
    }
    @Test(priority = 6)
    public void xboxTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnXbox();
    }
    @Test(priority = 7)
    public void dealTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnDeals();
    }
    @Test (priority =8)
    public void supportTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSupport();
    }
    @Test (priority = 9)
    public void allMicrosoftTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnAllMicrosoft();
    }
    @Test (priority = 10)
    public void searchTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSearch();
    }
    @Test (priority = 11)
    public void cartTab()  {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCart();

    }
    @Test (priority = 12)
    public void signInTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSignIn();
    }
}
