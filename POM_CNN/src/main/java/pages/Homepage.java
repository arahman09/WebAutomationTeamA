package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends CommonAPI
{
    @FindBy(how = How.LINK_TEXT, using = "videos")
    public static WebElement videosMenuBar;

    @FindBy(how = How.CSS, using = "button.sc-jDwBTQ:nth-child(2) > svg:nth-child(1)")
    public static WebElement searchButton;

    @FindBy(how = How.CSS, using = ".menu-icon")
    public static WebElement menuBarWebElement;

    @FindBy(how = How.CSS, using = "button.sc-jDwBTQ:nth-child(2) > svg")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = "div.Flex-sc-1sqrs56-0:nth-child(6) > div:nth-child(1) > svg:nth-child(1)")
    public static WebElement userIconWebElement;

    @FindBy(how = How.CSS, using = ".indexes__LiveTVWrap-nujtvs-15 > a:nth-child(1) > span")
    public static WebElement liveTVWebElement;

    @FindBy(how = How.CSS, using = "li.dMglaH:nth-child(3) > a:nth-child(1)")
    public static WebElement politicsWebElement;

    @FindBy(how = How.NAME, using = "travel")
    public static WebElement travelWebElement;

    @FindBy(how = How.NAME, using = "bleacher")
    public static WebElement sportsWebElement;


    public void clickOnVideoMenu()
    {
        testLogger();
        videosMenuBar.click();
    }

    public void clickOnSearchBox()
    {
        testLogger();
        searchButton.click();
    }

    public void clickOnMenuBar()
    {
        testLogger();
        menuBarWebElement.click();
    }

    public void clickOnSearchWeb()
    {
        testLogger();
        searchWebElement.click();
    }

    public void clickOnUserIcon()
    {
        testLogger();
        userIconWebElement.click();
    }

    public void clickOnLiveTV()
    {
        testLogger();
        liveTVWebElement.click();
    }

    public void verifyHomePageTitle()
    {
        testLogger();
        System.out.println(driver.getTitle());
    }

    public void clickOnPoliticsPage()
    {
        testLogger();
        politicsWebElement.click();
    }

    public TravelPage clickOnTravelPage()
    {
        testLogger();
        travelWebElement.click();
        return new TravelPage();
    }

    public SportsPage clickOnSportsPage()
    {
        testLogger();
        sportsWebElement.click();
        return new SportsPage();

    }
}

