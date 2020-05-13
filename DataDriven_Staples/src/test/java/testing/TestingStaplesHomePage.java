package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ReorderMenu;
import pages.StaplesHomePage;
import reporting.TestLogger;

public class TestingStaplesHomePage extends CommonAPI
{
    StaplesHomePage staplesHomePage = null;

    public void pageFactory()
    {
        staplesHomePage = PageFactory.initElements(driver, StaplesHomePage.class);
    }

    @Test (priority = 1)
    public void verifyHomePageTitle()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(driver.getTitle());
    }

    @Test (priority = 2)
    public void verifyFrequentlyPurchasedOption() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.mouseHoverToReorderMenu();
        sleepFor(2);
    }

    @Test (priority = 3)
    public void verifyProductTab() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
    }

    @Test (priority = 4)
    public void verifySearchBox() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnSearchBox();
        sleepFor(2);
    }
}
