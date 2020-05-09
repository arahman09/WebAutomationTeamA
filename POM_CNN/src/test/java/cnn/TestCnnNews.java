package cnn;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.CnnNews;
import reporting.TestLogger;

public class TestCnnNews extends CnnNews
{
    CnnNews cnnNews = null;
    Homepage homepage =null;
    public void pageFactory()
    {
        cnnNews = PageFactory.initElements(driver, CnnNews.class);
        homepage =PageFactory.initElements(driver,Homepage.class);
    }

    @Test(priority = 1)
    public void verifyCnnHeadLineNews()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pageFactory();
        cnnNews.clickOnCnnTab();
        cnnNews.getHeadLineNewsWebElement();
        cnnNews.clickOnHeadLineNews();
    }
}

