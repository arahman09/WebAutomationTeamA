package testing;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ReorderMenu;
import pages.StaplesHomePage;
import reporting.TestLogger;

import java.io.IOException;

public class TestingReorderMenu extends CommonAPI
{
    StaplesHomePage staplesHomePage = null;
    ReorderMenu reorderMenu = null;

    public void pageFactory()
    {
        staplesHomePage = PageFactory.initElements(driver, StaplesHomePage.class);
        reorderMenu = PageFactory.initElements(driver, ReorderMenu.class);
    }

    @Test (priority = 1)
    public void verifyFrequentlyPurchasedOption() throws InterruptedException, IOException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.mouseHoverToReorderMenu();
        sleepFor(2);
        reorderMenu.testFrequentlyPurchasedOption();
        sleepFor(3);
    }

    @Test (priority = 2)
    public void verifyMyListsOption() throws InterruptedException, IOException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.mouseHoverToReorderMenu();
        sleepFor(2);
        reorderMenu.testMyListsOption();
        sleepFor(3);
    }

    @Test (priority = 3)
    public void verifyOrderByNumnerOption() throws InterruptedException, IOException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.mouseHoverToReorderMenu();
        sleepFor(2);
        reorderMenu.testOrderByNumberOption();
        sleepFor(3);
    }


    @Test (priority = 4)
    public void verifyMyOrdersOption() throws InterruptedException, IOException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.mouseHoverToReorderMenu();
        sleepFor(2);
        reorderMenu.testMyOrdersOption();
        sleepFor(3);
    }

    @Test (priority = 5)
    public void verifyMyScheduledAutoRestockOption() throws InterruptedException, IOException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.mouseHoverToReorderMenu();
        sleepFor(2);
        reorderMenu.testMyScheduledAutoRestockOption();
        sleepFor(3);
    }

    @Test (priority = 6)
    public void verifyMySmartsOrdersOption() throws InterruptedException, IOException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.mouseHoverToReorderMenu();
        sleepFor(2);
        reorderMenu.testMySmartOrdersOption();
        sleepFor(3);
    }

}
