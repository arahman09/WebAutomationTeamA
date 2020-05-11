package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import reporting.TestLogger;

public class TestingHomepage extends CommonAPI {

    Homepage homepage = null;

    @Test (priority = 1)
    public void homePageTitleTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.cnnTitle();
    }
    @Test (priority = 2)
    public void testBusinessPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.clickOnBusinessTab();
    }
    @Test (priority = 3)
    public void testHealthPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.clickOnHealthTab();
    }
    @Test (priority = 4)
    public void testEntertainmentPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.clickOnEntertainmentTab();
    }
}
