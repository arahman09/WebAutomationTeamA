package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.CnnNews;
import reporting.TestLogger;

public class TestCnnNews extends CommonAPI
{
    CnnNews cnnNews = null;
    Homepage homepage =null;

    @Test(priority = 1)
    public void verifyCnnHeadLineNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass()
                .getEnclosingMethod().getName()));
        cnnNews = PageFactory.initElements(driver, CnnNews.class);
       // homepage =PageFactory.initElements(driver,Homepage.class);
        cnnNews.clickOnCnnTab();
        cnnNews.getHeadLineNewsWebElement();
        cnnNews.clickOnHeadLineNews();
    }
}

