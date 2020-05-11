package testing;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import reporting.TestLogger;

public class TestingHomepage extends CommonAPI
{
    Homepage homepage = null;

    public void pageFactory()
    {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test (priority = 1)
    public void verifyHomePageTitle()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(driver.getTitle());
    }

    @Test (priority = 2)
    public void verifyUSPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnUSPage();
    }

    @Test (priority = 3)
    public void verifyWorldPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnWorldPage();
    }

    @Test (priority = 4)
    public void verifyPoliticsPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnPoliticsPage();
    }

    @Test (priority = 5)
    public void verifyBusinessPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnBusinessPage();
    }

    @Test (priority = 6)
    public void verifyOpinionPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnOpinionPage();
    }

    @Test (priority = 7)
    public void verifyHealthPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnHealthPage();
    }

    @Test (priority = 8)
    public void verifyEntertainmentPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnEntertainmentPage();
    }

    @Test (priority = 9)
    public void verifyStylePage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnStylePage();
    }

    @Test (priority = 10)
    public void verifyTravelPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnTravelPage();
    }

    @Test (priority = 11)
    public void clickOnSportsPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSportsPage();
    }

    @Test (priority = 12)
    public void verifyVideosPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnVideosPage();
    }

    @Test (priority = 13)
    public void verifySearchPage()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
    }

    @Test (priority = 14)
    public void verifyLiveTvPage() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnLiveTvPage();
        sleepFor(4);
    }
}
