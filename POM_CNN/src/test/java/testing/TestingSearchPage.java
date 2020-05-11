package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Search;
import reporting.TestLogger;

public class TestingSearchPage extends CommonAPI
{
    Search search = null;
    Homepage homepage = null;

    public void pageFactory()
    {
        search = PageFactory.initElements(driver, Search.class);
        homepage = PageFactory.initElements(driver,Homepage.class);
    }

    @Test (priority = 1)
    public void verifySearchPage() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        sleepFor(3);
    }

    @Test (priority = 2)
    public void verifySearchEngine()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
    }

    @Test (priority = 3)
    public void verifyEverythingCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnEverything();
        sleepFor(2);
    }

    @Test (priority = 4)
    public void verifyStoriesCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnStories();
        sleepFor(2);
    }

    @Test (priority = 5)
    public void verifyVideosCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnVideos();
        sleepFor(2);
    }


    @Test (priority = 6)
    public void verifyPhotosCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnPhotos();
        sleepFor(2);
    }

    @Test (priority = 7)
    public void verifyAllCNNCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnAllCNN();
        sleepFor(2);
    }

    @Test (priority = 8)
    public void verifyUSCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnUS();
        sleepFor(2);
    }

    @Test (priority = 9)
    public void verifyWorldCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnWorld();
        sleepFor(2);
    }

    @Test (priority = 10)
    public void verifyPoliticsCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnPolitics();
        sleepFor(2);
    }

    @Test (priority = 11)
    public void verifyBusinessCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnBusiness();
        sleepFor(2);
    }

    @Test (priority = 12)
    public void verifyOpinionsCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnOpinion();
        sleepFor(2);
    }

    @Test (priority = 13)
    public void verifyHealthCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnHealth();
        sleepFor(2);
    }

    @Test (priority = 14)
    public void verifyEntertainmentCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnEntertainment();
        sleepFor(2);
    }

    @Test (priority = 15)
    public void verifyStyleCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnStyle();
        sleepFor(2);
    }

    @Test (priority = 16)
    public void verifyTravelCategory() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homepage.clickOnSearchPage();
        search.typeOnSearchBoxNSearch("politics");
        sleepFor(2);
        search.clickOnTravel();
        sleepFor(2);
    }
}
