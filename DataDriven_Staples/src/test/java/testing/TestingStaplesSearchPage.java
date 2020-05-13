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

    @Test (priority = 6)
    public void verifyNextDayEligibleFilterForItem2() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("fountain pen");
        sleepFor(3);
        searchPage.clickOnNextDayEligibleFilter();
        sleepFor(4);
    }

    @Test (priority = 7)
    public void verifySetLocationForItem2() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("fountain pen");
        sleepFor(3);
        searchPage.clickOnSetStore();;
        sleepFor(4);
        searchPage.inputStoreLocationNSubmit("New Jersey");
        sleepFor(4);
    }

    @Test (priority = 8)
    public void verifyBuyOnlineNPickUpForItem2() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("fountain pen");
        sleepFor(3);
        searchPage.clickOnBuyOnlineNPickUp();;
        sleepFor(4);
    }

    @Test (priority = 9)
    public void verifyNextDayEligibleFilterForItem3() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("index cards");
        sleepFor(3);
        searchPage.clickOnNextDayEligibleFilter();
        sleepFor(4);
    }

    @Test (priority = 10)
    public void verifySetLocationForItem3() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("index cards");
        sleepFor(3);
        searchPage.clickOnSetStore();;
        sleepFor(4);
        searchPage.inputStoreLocationNSubmit("California");
        sleepFor(4);
    }

    @Test (priority = 11)
    public void verifyBuyOnlineNPickUpForItem3() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("index cards");
        sleepFor(3);
        searchPage.clickOnBuyOnlineNPickUp();;
        sleepFor(4);
    }

    @Test (priority = 12)
    public void verifyNextDayEligibleFilterForItem4() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("markers");
        sleepFor(3);
        searchPage.clickOnNextDayEligibleFilter();
        sleepFor(4);
    }

    @Test (priority = 13)
    public void verifySetLocationForItem4() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("markers");
        sleepFor(3);
        searchPage.clickOnSetStore();;
        sleepFor(4);
        searchPage.inputStoreLocationNSubmit("Texas");
        sleepFor(4);
    }

    @Test (priority = 14)
    public void verifyBuyOnlineNPickUpForItem4() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("markers");
        sleepFor(3);
        searchPage.clickOnBuyOnlineNPickUp();;
        sleepFor(4);
    }

    @Test (priority = 15)
    public void verifyNextDayEligibleFilterForItem5() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("calculators");
        sleepFor(3);
        searchPage.clickOnNextDayEligibleFilter();
        sleepFor(4);
    }

    @Test (priority = 16)
    public void verifySetLocationForItem5() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("calculators");
        sleepFor(3);
        searchPage.clickOnSetStore();;
        sleepFor(4);
        searchPage.inputStoreLocationNSubmit("Virginia");
        sleepFor(4);
    }

    @Test (priority = 17)
    public void verifyBuyOnlineNPickUpForItem5() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.clearSearchInputBox();
        searchPage.typeInSearchInputBoxNSearch("calculators");
        sleepFor(3);
        searchPage.clickOnBuyOnlineNPickUp();;
        sleepFor(4);
    }
}


