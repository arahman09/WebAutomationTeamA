package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ProductsTab;
import pages.StaplesHomePage;
import reporting.TestLogger;


public class TestingProductsTab extends CommonAPI
{
    StaplesHomePage staplesHomePage = null;
    ProductsTab productsTab = null;

    public void pageFactory()
    {
        staplesHomePage = PageFactory.initElements(driver, StaplesHomePage.class);
        productsTab = PageFactory.initElements(driver, ProductsTab.class);
    }

    @Test (priority = 1)
    public void verifyOfficeSuppliesMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToOffieSupplies();
        sleepFor(3);
    }

    @Test(priority = 2)
    public void verifyOfficeSupplies() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnOfficeSupplies();
        sleepFor(3);
    }

    @Test (priority = 3)
    public void verifyInkNTonerMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToInkNToner();
        sleepFor(3);
    }

    @Test(priority = 4)
    public void verifyInkNToner() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnInkNToner();
        sleepFor(3);
    }

    @Test (priority = 5)
    public void verifyPaperMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToPaper();
        sleepFor(3);
    }

    @Test(priority = 6)
    public void verifyPaper() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnPaper();
        sleepFor(3);
    }

    @Test (priority = 7)
    public void verifyComputersNAccessoriesMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToComputerNAccessories();
        sleepFor(3);
    }

    @Test(priority = 8)
    public void verifyComputersNAccessories() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnComputersNAccessories();
        sleepFor(3);
    }

    @Test (priority = 9)
    public void verifyPrintersNScannersMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToPrintersNScanners();
        sleepFor(3);
    }

    @Test(priority = 10)
    public void verifyPrintersNScanners() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnPrintersNScanners();
        sleepFor(3);
    }

    @Test (priority = 11)
    public void verifyElectronicsMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToElectronics();
        sleepFor(3);
    }

    @Test(priority = 12)
    public void verifyElectronics() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnElectronics();
        sleepFor(3);
    }

    @Test (priority = 13)
    public void verifyFurnitureMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToFurniture();
        sleepFor(3);
    }

    @Test(priority = 14)
    public void verifyFurniture() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnFurniture();
        sleepFor(3);
    }

    @Test (priority = 15)
    public void verifyFoodNBreakroomMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToFoodNBreakroom();
        sleepFor(3);
    }

    @Test(priority = 16)
    public void verifyFoodNBreakroom() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnFoodNBreakroom();
        sleepFor(3);
    }

    @Test (priority = 17)
    public void verifyCleaningSuppliesMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToCleaningSupplies();
        sleepFor(3);
    }

    @Test(priority = 18)
    public void verifyCleaningSupplies() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnCleaningSupplies();
        sleepFor(3);
    }

    @Test (priority = 19)
    public void verifyFacilitiesMaintenanceMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToFacilitiesMaintenance();
        sleepFor(3);
    }

    @Test(priority = 20)
    public void verifyFacilitiesMaintenance() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnFacilitiesMaintenance();
        sleepFor(3);
    }

    @Test (priority = 21)
    public void verifySafetySuppliesMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToSafetySupplies();
        sleepFor(3);
    }

    @Test(priority = 22)
    public void verifySafetySupplies() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnSafetySupplies();
        sleepFor(3);
    }

    @Test (priority = 23)
    public void verifyMailNShipMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToMailNShip();
        sleepFor(3);
    }

    @Test(priority = 24)
    public void verifyMailNShip() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnMailNShip();
        sleepFor(3);
    }

    @Test (priority = 25)
    public void verifyPrintNMarketingMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToPrintNMarketing();
        sleepFor(3);
    }

    @Test(priority = 26)
    public void verifyPrintNMarketing() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnPrintNMarketing();
        sleepFor(3);
    }

    @Test (priority = 27)
    public void verifyShopAllProductsMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToShopAllProducts();
        sleepFor(3);
    }

    @Test(priority = 28)
    public void verifyShopAllProducts() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnShopAllProducts();
        sleepFor(3);
    }

    @Test (priority = 29)
    public void verifyShopByIndustryMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToShopByIndustry();
        sleepFor(3);
    }

    @Test(priority = 30)
    public void verifyShopByIndustry() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnShopByIndustry();
        sleepFor(3);
    }

    @Test (priority = 31)
    public void verifyShopByBrandMouseHover() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.mouseHoverToShopByBrand();
        sleepFor(3);
    }

    @Test(priority = 32)
    public void verifyShopByBrand() throws InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        staplesHomePage.clickOnProductsTab();
        sleepFor(2);
        productsTab.clickOnShopByBrand();
        sleepFor(3);
    }
}
