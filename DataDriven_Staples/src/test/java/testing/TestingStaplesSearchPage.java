package testing;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ProductsTab;
import pages.StaplesHomePage;
import pages.StaplesSearchPage;
import reporting.TestLogger;

import java.io.IOException;

public class TestingStaplesSearchPage extends CommonAPI
{
    StaplesHomePage staplesHomePage = null;
    StaplesSearchPage searchPage = null;
    StaplesSearchPage searchPageOject = new StaplesSearchPage();

    public void pageFactory()
    {
        staplesHomePage = PageFactory.initElements(driver, StaplesHomePage.class);
        searchPage = PageFactory.initElements(driver, StaplesSearchPage.class);
    }

    @Test (priority = 1)
    public void verifySearchNSubmitUsingExcelData()throws IOException,InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.searchNSubmitUsingExcelData();
        sleepFor(3);
    }

    @Test (priority = 2)
    public void verifySearchNSubmitUsingSQLData()throws IOException,InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.searchNSubmitUsingSQLData();
    }

    @Test (priority = 3)
    public void verifyNextDayEligibleFilterForItem1() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("pens");
        sleepFor(3);
        searchPage.clickOnNextDayEligibleFilter();
        sleepFor(4);
    }

    @Test (priority = 4)
    public void verifySetLocationForItem1() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("pens");
        sleepFor(3);
        searchPage.clickOnSetStore();;
        sleepFor(4);
        searchPage.inputStoreLocationNSubmit("New York");
        sleepFor(4);
    }

    @Test (priority = 5)
    public void verifyBuyOnlineNPickUpForItem1() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("pens");
        sleepFor(3);
        searchPage.clickOnBuyOnlineNPickUp();;
        sleepFor(4);
    }
}


