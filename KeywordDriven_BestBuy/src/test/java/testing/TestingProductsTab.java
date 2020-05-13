package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ProductsTab;
import reporting.TestLogger;

public class TestingProductsTab extends CommonAPI
{
    LandingPage landingPage = null;
    ProductsTab productsTab = null;

    public void pageFactory()
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        productsTab = PageFactory.initElements(driver, ProductsTab.class);
    }

    @Test
    public void verifyAppliancesTab() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage.clickOnProductsTab();
        productsTab.clickOnAppliances();
        sleepFor(5);
    }

}
