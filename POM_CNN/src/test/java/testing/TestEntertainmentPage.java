package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CnnNews;
import pages.EntertainmentPage;
import pages.Homepage;
import reporting.TestLogger;

public class TestEntertainmentPage extends Homepage {

    EntertainmentPage entertainmentPage = null;
    Homepage homepage =null;

    @Test(priority = 1)
    public void verifyHeadLineNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, CnnNews.class);
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        homepage.clickOnEntertainmentTab();
        entertainmentPage.getHeadLineNewsWebElement();
        entertainmentPage.clickOnHeadLineNews();
    }
    @Test (priority = 2)
    public void verifyEntertainmentPage()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, CnnNews.class);
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        homepage.clickOnEntertainmentTab();
    }
    @Test (priority = 3)
    public void verifyStarsPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, CnnNews.class);
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        homepage.clickOnEntertainmentTab();
        entertainmentPage.clickOnStarsTab();
    }
    @Test (priority = 4)
    public void verifyScreenPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, CnnNews.class);
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        homepage.clickOnEntertainmentTab();
        entertainmentPage.clickOnScreenTab();
    }
    @Test (priority = 5)
    public void verifyBingePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, CnnNews.class);
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        homepage.clickOnEntertainmentTab();
        entertainmentPage.clickOnBingeTab();
    }
    @Test (priority = 6)
    public void verifyCulturePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, CnnNews.class);
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        homepage.clickOnEntertainmentTab();
        entertainmentPage.clickOnCultureTab();
    }
    @Test (priority = 7)
    public void verifyMediaPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, CnnNews.class);
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        homepage.clickOnEntertainmentTab();
        entertainmentPage.clickOnMediaTab();
    }
}
