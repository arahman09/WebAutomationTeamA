//package testing;
//
//import base.CommonAPI;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//import pages.Homepage;
//import pages.Search;
//
//public class TestingSearchPage extends CommonAPI
//{
//    Search search = null;
//    Homepage homepage = null;
//
//    public void pageFactory()
//    {
//        search = PageFactory.initElements(driver, Search.class);
//        homepage = PageFactory.initElements(driver,Homepage.class);
//        testLogger();
//    }
//
//    @Test (priority = 1)
//    public void verifySearchPage()
//    {
//        pageFactory();
//        homepage.clickOnSearchBox();
//        search.typeOnSearchBox("politics");
//    }
//}
