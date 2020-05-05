package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

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


//    public Homepage()
//    {
//        PageFactory.initElements(driver, Homepage.class);
//    }

    public void clickOnVideoMenu()
    {
        videosMenuBar.click();
    }

    public void clickOnSearchBox()
    {
        searchButton.click();
    }

    public void clickOnMenuBar()
    {
        menuBarWebElement.click();
    }

    public void clickOnSearchWeb()
    {
        searchWebElement.click();
    }

    public void clickOnUserIcon()
    {
        userIconWebElement.click();
    }

    public void clickOnLiveTV()
    {
        liveTVWebElement.click();
    }

    public void verifyHomePageTitle()
    {
        System.out.println(driver.getTitle());
    }
    public void clickOnHealthPage()
    {
        he
    }
}
