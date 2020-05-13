package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Politics;
import reporting.TestLogger;

import java.util.PriorityQueue;

public class TesingPoliticsPage extends CommonAPI
{
    Politics politics = null;
    Homepage homepage = null;

    public void pageFactory()
    {
        politics = PageFactory.initElements(driver, Politics.class);
        homepage = PageFactory.initElements(driver,Homepage.class);
        homepage.clickOnPoliticsPage();
    }

    @Test (priority = 1)
    public void verifyDonaldTrumpPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politics.clickOnDonaldTrumpPage();
    }

  /*  @Test (priority = 2)
    public void verifySupremeCourtPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politics.clickOnSupremeCourtPage();
    }

    @Test (priority = 3)
    public void verifyCongressPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politics.clickOnCongressPage();
    }

    @Test (priority = 4)
    public void verifyFactsFirstPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politics.clickOnFactsFirstPage();
    }

    @Test (priority = 5)
    public void verify2020ElectionPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politics.clickOn2020ElectionPage();
    }

    @Test (priority = 6)
    public void verifyFirstItemsFromLatestNews()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politics.clickOnFirstItemFromLatestNews();
    }

    @Test (priority = 7)
    public void verifyHeadLineNews()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politics.clickOnHeadLineNews();
    }
*/
}
