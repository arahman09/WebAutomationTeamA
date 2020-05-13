package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.CnnNews;
import reporting.TestLogger;

public class TestCnnNews extends CommonAPI {

    CnnNews cnnNews = null;
    Homepage homepage =null;

    @Test (priority = 1)
    public void verifyCnnPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass()
                .getEnclosingMethod().getName()));
        homepage =PageFactory.initElements(driver,Homepage.class);
        cnnNews = PageFactory.initElements(driver, CnnNews.class);
        cnnNews.getCnnNewsWebElement();
        cnnNews.clickOnCnnTab();
    }
//    @Test(priority = 2)
//    public void verifyCnnHeadLineNews() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass()
//                .getEnclosingMethod().getName()));
//        homepage =PageFactory.initElements(driver,Homepage.class);
//        cnnNews = PageFactory.initElements(driver, CnnNews.class);
//        cnnNews.clickOnCnnTab();
//        cnnNews.getHeadLineNewsWebElement();
//        cnnNews.clickOnHeadLineNews();
//    }
}

