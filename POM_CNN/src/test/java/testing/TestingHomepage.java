package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;

public class TestingHomepage extends CommonAPI
{

    /****
     @Test(priority=1)
     public void verifyHomePageTitleTest(){
     String homePageTitle = homePage.verifyHomePageTitle();
     Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
     }

     @Test(priority=2)
     public void verifyUserNameTest(){
     testUtil.switchToFrame();
     Assert.assertTrue(homePage.verifyCorrectUserName());
     }

     @Test(priority=3)
     public void verifyContactsLinkTest(){
     testUtil.switchToFrame();
     contactsPage = homePage.clickOnContactsLink();
     }
     ***/

    Homepage homepage = null;



    public void pageFactory()
    {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test (priority = 1)
    public void verifyHomePageTitleTest()
    {
        pageFactory();
        homepage.verifyHomePageTitle();
    }

    @Test (priority = 2)
    public void verifyLiveTVButton() throws InterruptedException
    {
        pageFactory();
        homepage.clickOnLiveTV();
        sleepFor(10);
    }

}
