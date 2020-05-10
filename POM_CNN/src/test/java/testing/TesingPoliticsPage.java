package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Politics;

public class TesingPoliticsPage extends CommonAPI
{
    Politics politics = null;
    Homepage homepage = null;

    public void pageFactory()
    {
        politics = PageFactory.initElements(driver, Politics.class);
        homepage = PageFactory.initElements(driver,Homepage.class);
        testLogger();
    }

    @Test
    public void verifyPoliticsHeadLine()
    {
        pageFactory();
        homepage.clickOnPoliticsPage();
        politics.clickOnHeadLineNews();
    }
}
