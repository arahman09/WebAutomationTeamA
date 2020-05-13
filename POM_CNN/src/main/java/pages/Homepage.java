package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(1)")
    public static WebElement usWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(2)")
    public static WebElement worldWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(3)")
    public static WebElement politicsWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(4)")
    public static WebElement businessWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(5)")
    public static WebElement opinionWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(6)")
    public static WebElement healthWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(7)")
    public static WebElement entertainmentWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(8)")
    public static WebElement styleWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(9)")
    public  static WebElement travelWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(10)")
    public static  WebElement sportsWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(11)")
    public static WebElement videosWebElement;

    @FindBy(how = How.CSS, using = "button.sc-jDwBTQ:nth-child(2) > svg")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".indexes__LiveTVWrap-nujtvs-15 > a:nth-child(1) > span")
    public static WebElement liveTVWebElement;

    @FindBy(how = How.CSS, using = ".facebook-icon")
    public static WebElement facebookWebElement;

    @FindBy(how = How.CSS, using = ".twitter-icon")
    public static WebElement twitterWebElement;

   /* @FindBy(how = How.NAME, using = "travel")
    public  static WebElement travelWebElement;

    @FindBy(how = How.NAME, using = "bleacher")
    public static  WebElement sportsWebElement;*/

    @FindBy(how = How.CSS, using = ".instagram-icon")
    public static WebElement instagramWebElement;

    //getWebElement starts here
    public static WebElement getUsWebElement()
    {
        return usWebElement;
    }

    public static WebElement getWorldWebElement()
    {
        return worldWebElement;
    }

    public static WebElement getPoliticsWebElement()
    {
        return politicsWebElement;
    }

    public static WebElement getBusinessWebElement()
    {
        return businessWebElement;
    }

    public static WebElement getOpinionWebElement()
    {
        return opinionWebElement;
    }

    public static WebElement getHealthWebElement()
    {
        return healthWebElement;
    }

    public static WebElement getEntertainmentWebElement()
    {
        return entertainmentWebElement;
    }

    public static WebElement getStyleWebElement()
    {
        return styleWebElement;
    }

    public static WebElement getTravelWebElement()
    {
        return travelWebElement;
    }

    public static WebElement getSportsWebElement()
    {
        return sportsWebElement;
    }

    public static WebElement getVideosWebElement()
    {
        return videosWebElement;
    }

    public static WebElement getSearchWebElement()
    {
        return searchWebElement;
    }

    public static WebElement getLiveTVWebElement()
    {
        return liveTVWebElement;
    }

    public static WebElement getFacebookWebElement()
    {
        return facebookWebElement;
    }

    public static WebElement getTwitterWebElement()
    {
        return twitterWebElement;
    }

    public static WebElement getInstagramWebElement()
    {
        return instagramWebElement;
    }
    //getWebElement ends here


    public void clickOnUSPage()
    {
        getUsWebElement().click();
    }

    public void clickOnWorldPage()
    {
        getWorldWebElement().click();
    }

    public void clickOnPoliticsPage()
    {
        getPoliticsWebElement().click();
    }

    public void clickOnBusinessPage()
    {
        getBusinessWebElement().click();
    }

    public void clickOnOpinionPage()
    {
        getPoliticsWebElement().click();
    }

    public void clickOnHealthPage()
    {
        getHealthWebElement().click();
    }

    public void clickOnEntertainmentPage()
    {
        getEntertainmentWebElement().click();
    }

    public void clickOnStylePage()
    {
        getStyleWebElement().click();
    }

    public void clickOnTravelPage()
    {
        getTravelWebElement().click();
    }

    public void clickOnSportsPage()
    {
        getSportsWebElement().click();
    }

    public void clickOnVideosPage()
    {
        getVideosWebElement().click();
    }

    public void clickOnSearchPage()
    {
        getSearchWebElement().click();
    }

    public void clickOnLiveTvPage()
    {
        getLiveTVWebElement().click();
    }

    public void clickOnFacebookPage()
    {
        getFacebookWebElement().click();
    }

    public void clickOnTwitterPage()
    {
        getTwitterWebElement().click();
    }

    public void clickOnInstagramPage()
    {
        getInstagramWebElement().click();
    }

    public TravelPage goToTravelPage()
    {
        testLogger();
        travelWebElement.click();
        return new TravelPage();
    }

    public SportsPage goToSportsPage()
    {
        testLogger();
        sportsWebElement.click();
        return new SportsPage();

    }
}

