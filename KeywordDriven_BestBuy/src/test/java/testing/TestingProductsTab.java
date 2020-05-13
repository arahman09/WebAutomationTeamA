package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ProductsTab;
import reporting.TestLogger;

import java.io.IOException;

public class TestingProductsTab extends CommonAPI
{
    LandingPage landingPage = null;
    ProductsTab productsTab = null;

    public void pageFactory()
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        productsTab = PageFactory.initElements(driver, ProductsTab.class);
    }

//    @Test (priority = 1)
//    public void verifyAppliancesTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnAppliances();
//        sleepFor(5);
//    }
//
//    @Test (priority = 2)
//    public void verifyTvNHomeTheaterTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnTvNHomeTheater();
//        sleepFor(5);
//    }
//
//    @Test (priority = 3)
//    public void verifyComputersNTabletsTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnComputersNTablets();
//        sleepFor(5);
//    }
//
//    @Test (priority = 4)
//    public void verifyCamerasNCamcordersTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnCamerasNCamcorders();
//        sleepFor(5);
//    }
//
//    @Test (priority = 5)
//    public void verifyCellPhonesTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnCellPhones();
//        sleepFor(5);
//    }
//
//    @Test (priority = 6)
//    public void verifyAudioTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnAudio();
//        sleepFor(5);
//    }
//
//    @Test (priority = 7)
//    public void verifyVideoGamesTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnVideoGames();
//        sleepFor(5);
//    }
//
//    @Test (priority = 8)
//    public void verifyMoviesNMusicTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnMoviesNMusic();
//        sleepFor(5);
//    }
//
//    @Test (priority = 9)
//    public void verifyCarElectronicsNGPSTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnCarElectronicsNGPS();
//        sleepFor(5);
//    }
//
//    @Test (priority = 10)
//    public void verifyWearableTechnologyTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnWearableTechnology();
//        sleepFor(5);
//    }
//
//    @Test (priority = 11)
//    public void verifyHealthFitnessNPersonalCareTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnHealthFitnessNPersonalCare();
//        sleepFor(5);
//    }
//
//    @Test (priority = 12)
//    public void verifySustainableLivingTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnSustainableLiving();
//        sleepFor(5);
//    }
//
//    @Test (priority = 13)
//    public void verifyHomeFurnitureNOfficeTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnHomeFurnitureNOffice();
//        sleepFor(5);
//    }
//
//    @Test (priority = 14)
//    public void verifySmartHomeSecurityNWiFiTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnSmartHomeSecurityNWiFi();
//        sleepFor(5);
//    }
//
//    @Test (priority = 15)
//    public void verifyDronesToysNCollectiblesTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnDronesToysNCollectibles();
//        sleepFor(5);
//    }
//    @Test (priority = 16)
//    public void verifyBestBuyOutletTab() throws InterruptedException
//    {
//        pageFactory();
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        landingPage.clickOnProductsTab();
//        sleepFor(3);
//        productsTab.clickOnBestBuyOutlet();
//        sleepFor(5);
//    }

    @Test
    public void navigateTabs()throws IOException,InterruptedException
    {
        pageFactory();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        landingPage.clickOnProductsTab();
        productsTab.navigateKeyBars();
    }
}
