package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BusinessPage;
import pages.Homepage;

public class TestBusinessPage extends CommonAPI {

    Homepage homepage = null;
    BusinessPage businessPage = null;

    @Test (priority = 1)
    public void verifyBusinessPageHeadLineNews() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        businessPage = PageFactory.initElements(driver, BusinessPage.class);
        homepage.clickOnBusinessTab();
        businessPage.getHeadLineNewsWebElement();
        businessPage.clickOnHeadLineNews();
    }
//    @Test (priority = 2)
//    public void verifyMarketsPage() {
//        homepage = PageFactory.initElements(driver,Homepage.class);
//        businessPage = PageFactory.initElements(driver, BusinessPage.class);
//        homepage.clickOnBusinessTab();
//        businessPage.getMarketsWebElement();
//        businessPage.clickOnMarketsTab();
//    }
//    @Test (priority = 2)
//    public void verifyTechPage() {
//        homepage = PageFactory.initElements(driver,Homepage.class);
//        businessPage = PageFactory.initElements(driver, BusinessPage.class);
//        homepage.clickOnBusinessTab();
//        businessPage.getTechWebElement();
//        businessPage.clickOnTechTab();
//    }
//    @Test (priority = 3)
//    public void verifyMediaPage() {
//        homepage = PageFactory.initElements(driver,Homepage.class);
//        businessPage = PageFactory.initElements(driver, BusinessPage.class);
//        homepage.clickOnBusinessTab();
//        businessPage.getMediaWebElement();
//        businessPage.clickOnMediaTab();
//    }
//    @Test (priority = 4)
//    public void verifySuccessPage() {
//        homepage = PageFactory.initElements(driver, Homepage.class);
//        businessPage = PageFactory.initElements(driver, BusinessPage.class);
//        homepage.clickOnBusinessTab();
//        businessPage.getSuccessWebElement();
//        businessPage.clickOnSuccesTab();
//    }
//    @Test (priority = 5)
//    public void verifyPerspectivePage() {
//        homepage = PageFactory.initElements(driver, Homepage.class);
//        businessPage = PageFactory.initElements(driver, BusinessPage.class);
//        homepage.clickOnBusinessTab();
//        businessPage.getPerpectiveWebElement();
//        businessPage.clickOnPerspectiveTab();
//    }
//    @Test (priority = 6)
//    public void verifyVideosPage() {
//        homepage = PageFactory.initElements(driver, Homepage.class);
//        businessPage = PageFactory.initElements(driver, BusinessPage.class);
//        homepage.clickOnBusinessTab();
//        businessPage.getVideosWebElement();
//        businessPage.clickOnVideosTab();
//    }
}
