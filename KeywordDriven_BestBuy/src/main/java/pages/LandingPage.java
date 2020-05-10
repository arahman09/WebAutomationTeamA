package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage
{
    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(1)")
    public static WebElement creditCardWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(2)")
    public static WebElement topDealsWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(3)")
    public static WebElement dealOfTheDayWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(4)")
    public static WebElement giftCardsWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(5)")
    public static WebElement giftIdeasWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(6)")
    public static WebElement forYourBusinessWebElement;


    public static WebElement getCreditCardWebElement()
    {
        return creditCardWebElement;
    }

    public static WebElement getTopDealsWebElement()
    {
        return topDealsWebElement;
    }

    public static WebElement getDealOfTheDayWebElement()
    {
        return dealOfTheDayWebElement;
    }

    public static WebElement getGiftCardsWebElement()
    {
        return giftCardsWebElement;
    }

    public static WebElement getGiftIdeasWebElement()
    {
        return giftIdeasWebElement;
    }

    public static WebElement getForYourBusinessWebElement()
    {
        return forYourBusinessWebElement;
    }


    public void clickOnCreditCards()
    {
        getCreditCardWebElement().click();
    }

    public void clickOnTopDeals()
    {
        getTopDealsWebElement().click();
    }

    public void clickOnDealOfTheDay()
    {
        getDealOfTheDayWebElement().click();
    }

    public void clickOnGiftCards()
    {
        getGiftCardsWebElement().click();
    }

    public void clickOnGiftIdeas()
    {
        getGiftIdeasWebElement().click();
    }

    public void clickOnForYourBusiness()
    {
        getForYourBusinessWebElement().click();
    }






}
