package navigation;

import NavigateTheTabs.NavigateTheTabs;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;
import reporting.TestLogger;

import java.io.IOException;

public class TestNavigation extends CommonAPI
{
    LandingPage landingPage = null;

    public void pageFactory()
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
    }

    @Test
    public void verifyProductsTab()
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage.clickOnProductsTab();
    }

}
