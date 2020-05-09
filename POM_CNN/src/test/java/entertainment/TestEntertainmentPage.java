package entertainment;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CnnNews;
import pages.EntertainmentPage;
import reporting.TestLogger;

public class TestEntertainmentPage extends CnnNews
{
    EntertainmentPage entertainmentPage = null;
    CnnNews cnnNews =null;

    public void pageFactory()
    {
        entertainmentPage = PageFactory.initElements(driver, EntertainmentPage.class);
        cnnNews = PageFactory.initElements(driver, CnnNews.class);
    }

    @Test(priority = 1)
    public void verifyHeadLineNews()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pageFactory();
        entertainmentPage.clickOnEntertainmentTab();
        entertainmentPage.getHeadLineNewsWebElement();
        entertainmentPage.headLineNews();
    }
//    @Test (priority = 2)
//    public void verifyEntertainmentPage()
//    {
//        pageFactory();
//        entertainmentPage.clickOnEntertainment();
//    }
//    @Test (priority = 3)
//    public void verifyStarsPage()
//    {
//        verifyEntertainmentPage();
//        pageFactory();
//        entertainmentPage.clickOnStars();
//    }
//    @Test (priority = 4)
//    public void verifyFitnessPage()
//    {
//       verifyEntertainmentPage();
//        pageFactory();
//        entertainmentPage.clickOnScreen();
//    }
//    @Test (priority = 5)
//    public void verifyBingePage()
//    {
//        verifyEntertainmentPage();
//        pageFactory();
//        entertainmentPage.clickOnBinge();
//    }
//    @Test (priority = 6)
//    public void verifyParentingPage()
//    {
//        verifyEntertainmentPage();
//        pageFactory();
//        entertainmentPage.clickOnCulture();
//    }
//    @Test (priority = 7)
//    public void verifyMediaPage()
//    {
//        verifyEntertainmentPage();
//        pageFactory();
//        entertainmentPage.clickOnMedia();
//    }
}
