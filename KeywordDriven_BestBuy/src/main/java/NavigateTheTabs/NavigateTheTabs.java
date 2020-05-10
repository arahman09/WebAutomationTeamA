package NavigateTheTabs;

import base.CommonAPI;
import datasource.ExeternalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LandingPage;

import java.io.IOException;


public class NavigateTheTabs
{
    LandingPage landingPage = null;

    public void navigateToCreditCard(WebDriver driver)
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnCreditCards();
    }

    public void navigateTopDeals(WebDriver driver)
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnTopDeals();
    }

    public void navigateToDealOfTheDay(WebDriver driver)
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnDealOfTheDay();
    }

    public void navigateToGiftCards(WebDriver driver)
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnGiftCards();
    }

    public void navigateToGiftIdeas(WebDriver driver)
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnGiftIdeas();
    }

    public void navigateToForYourBusiness(WebDriver driver)
    {
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnForYourBusiness();
    }

    public void stepsFlow(String tabs, WebDriver driver) throws InterruptedException
    {
        CommonAPI.sleepFor(3);
        switch(tabs)
        {
            case "CreditsCards":
                navigateToCreditCard(driver);
                CommonAPI.navigateBack();
                break;

            case "TopDeals":
                navigateTopDeals(driver);
                CommonAPI.navigateBack();
                break;

            case "DealOfTheDay":
                navigateToDealOfTheDay(driver);
                CommonAPI.navigateBack();
                break;

            case "GiftCards":
                navigateToGiftCards(driver);
                CommonAPI.navigateBack();
                break;

            case "GiftIdeas":
                navigateToGiftIdeas(driver);
                CommonAPI.navigateBack();
                break;

            case "ForYourBusiness":
                navigateToForYourBusiness(driver);
                CommonAPI.navigateBack();
                break;

            default:
                System.out.print("No more valid tabs");
                break;
        }
    }

    public void navigateKeyBars(WebDriver driver) throws IOException,InterruptedException
    {
        String[] tabList = null;

        try
        {
            tabList = ExeternalData.getDataFromExcelFile("/data/best-buy-file.xls");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        for(int i = 0; i < tabList.length; i++)
        {
            stepsFlow(tabList[i], driver);
        }
    }
}
