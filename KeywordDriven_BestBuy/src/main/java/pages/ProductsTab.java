package pages;

import base.CommonAPI;
import datasource.ExeternalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class ProductsTab extends CommonAPI
{
    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(1)")
    public static WebElement appliancesWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(2)")
    public static WebElement tvNHomeTheaterWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(3)")
    public static WebElement computersNTabletsWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(4)")
    public static WebElement camerasNCamcordersWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(5)")
    public static WebElement cellPhonesWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(6)")
    public static WebElement audioWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(7)")
    public static WebElement videoGamesWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(8)")
    public static WebElement moviesNMusicWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(9)")
    public static WebElement carElectronicsNGPSWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(10)")
    public static WebElement wearableTechnologyWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(11)")
    public static WebElement healthFitnessNPersonalCareWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(12)")
    public static WebElement sustainableLivingWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(13)")
    public static WebElement homeFurnitureNOfficeWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(14)")
    public static WebElement smartHomeSecurityNWiFiWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(15)")
    public static WebElement dronesToysNCollectiblesWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-154 > li:nth-child(3) > ul > li:nth-child(16)")
    public static WebElement bestBuyOutletWebElement;

    @FindBy(how = How.CSS, using = "#header-menu-11 > div > button")
    public static WebElement backButtonWebElement;

    public static WebElement getAppliancesWebElement()
    {
        return appliancesWebElement;
    }

    public static WebElement getTvNHomeTheaterWebElement()
    {
        return tvNHomeTheaterWebElement;
    }

    public static WebElement getComputersNTabletsWebElement()
    {
        return computersNTabletsWebElement;
    }

    public static WebElement getCamerasNCamcordersWebElement()
    {
        return camerasNCamcordersWebElement;
    }

    public static WebElement getCellPhonesWebElement()
    {
        return cellPhonesWebElement;
    }

    public static WebElement getAudioWebElement()
    {
        return audioWebElement;
    }

    public static WebElement getVideoGamesWebElement()
    {
        return videoGamesWebElement;
    }

    public static WebElement getMoviesNMusicWebElement()
    {
        return moviesNMusicWebElement;
    }

    public static WebElement getCarElectronicsNGPSWebElement()
    {
        return carElectronicsNGPSWebElement;
    }

    public static WebElement getWearableTechnologyWebElement()
    {
        return wearableTechnologyWebElement;
    }

    public static WebElement getHealthFitnessNPersonalCareWebElement()
    {
        return healthFitnessNPersonalCareWebElement;
    }

    public static WebElement getSustainableLivingWebElement()
    {
        return sustainableLivingWebElement;
    }

    public static WebElement getHomeFurnitureNOfficeWebElement()
    {
        return homeFurnitureNOfficeWebElement;
    }

    public static WebElement getSmartHomeSecurityNWiFiWebElement()
    {
        return smartHomeSecurityNWiFiWebElement;
    }

    public static WebElement getDronesToysNCollectiblesWebElement()
    {
        return dronesToysNCollectiblesWebElement;
    }

    public static WebElement getBestBuyOutletWebElement()
    {
        return bestBuyOutletWebElement;
    }

    public static WebElement getBackButtonWebElement()
    {
        return backButtonWebElement;
    }

    public void clickOnAppliances()
    {
        getAppliancesWebElement().click();
    }

    public void clickOnTvNHomeTheater()
    {
        getTvNHomeTheaterWebElement().click();
    }

    public void clickOnComputersNTablets()
    {
        getComputersNTabletsWebElement().click();
    }

    public void clickOnCamerasNCamcorders()
    {
        getCamerasNCamcordersWebElement().click();
    }

    public void clickOnCellPhones()
    {
        getCellPhonesWebElement().click();
    }

    public void clickOnAudio()
    {
        getAudioWebElement().click();
    }

    public void clickOnVideoGames()
    {
        getVideoGamesWebElement().click();
    }

    public void clickOnMoviesNMusic()
    {
        getMoviesNMusicWebElement().click();
    }

    public void clickOnCarElectronicsNGPS()
    {
        getCarElectronicsNGPSWebElement().click();
    }

    public void clickOnWearableTechnology()
    {
        getWearableTechnologyWebElement().click();
    }

    public void clickOnHealthFitnessNPersonalCare()
    {
        getHealthFitnessNPersonalCareWebElement().click();
    }

    public void clickOnSustainableLiving()
    {
        getSustainableLivingWebElement().click();
    }

    public void clickOnHomeFurnitureNOffice()
    {
        getHomeFurnitureNOfficeWebElement().click();
    }

    public void clickOnSmartHomeSecurityNWiFi()
    {
        getSmartHomeSecurityNWiFiWebElement().click();
    }

    public void clickOnDronesToysNCollectibles()
    {
        getDronesToysNCollectiblesWebElement().click();
    }

    public void clickOnBestBuyOutlet()
    {
        getBestBuyOutletWebElement().click();
    }

    public void clickOnBackButton()
    {
        getBackButtonWebElement().click();
    }

    public void stepsFlow(String tabs) throws InterruptedException
    {
        sleepFor(3);
        switch(tabs)
        {
            case "Appliances":
                clickOnAppliances();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "TvNHomeTheater":
                clickOnTvNHomeTheater();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "ComputersNTablets":
                clickOnComputersNTablets();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "CamerasNCamcorders":
                clickOnCamerasNCamcorders();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "CellPhones":
                clickOnCellPhones();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "Audio":
                clickOnAudio();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "VideoGames":
                clickOnVideoGames();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "MoviesNMusic":
                clickOnMoviesNMusic();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "CarElectronicsNGPS":
                clickOnCarElectronicsNGPS();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "WearableTechnology":
                clickOnWearableTechnology();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "HealthFitnessNPersonalCare":
                clickOnHealthFitnessNPersonalCare();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "SustainableLiving":
                clickOnSustainableLiving();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "HomeFurnitureNOffice":
                clickOnHomeFurnitureNOffice();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "SmartHomeSecurityNWiFi":
                clickOnSmartHomeSecurityNWiFi();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "DronesToysNCollectibles":
                clickOnDronesToysNCollectibles();
                sleepFor(3);
                clickOnBackButton();
                break;

            case "BestBuyOutlet":
                clickOnBestBuyOutlet();
                sleepFor(3);
                clickOnBackButton();
                break;

            default:
                System.out.print("No more valid tabs");
                break;
        }
    }

    public void navigateKeyBars() throws IOException,InterruptedException
    {
        String[] tabList = null;

        try
        {
            tabList = ExeternalData.getDataFromExcelFile("/data/best_buy_keywords.xls");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        for(int i = 0; i < tabList.length; i++)
        {
            stepsFlow(tabList[i]);
        }
    }
}
