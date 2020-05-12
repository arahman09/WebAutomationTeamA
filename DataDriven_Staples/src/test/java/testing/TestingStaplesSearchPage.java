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
    }

    @Test (priority = 2)
    public void verifySearchNSubmitUsingSQLData()throws IOException,InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage.searchNSubmitUsingSQLData();
    }

}


