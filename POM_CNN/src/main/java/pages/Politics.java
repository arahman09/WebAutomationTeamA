package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Politics extends CommonAPI
{
    @FindBy(how = How.CLASS_NAME, using = "cd__headline-text")
    public static WebElement headLineNewsWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(1)")
    public static WebElement donaldTrumpWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(2)")
    public static WebElement supremeCourtWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(3)")
    public static WebElement congressWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(4)")
    public static WebElement factFirstWebElement;

    @FindBy(how = How.CSS, using = ".sc-htoDjs.dpodOf li:nth-child(5)")
    public static WebElement twentyTwentyElectionWebElement;

    @FindBy(how = How.CSS, using = ".cn.cn-list-xs.cn--idx-2.cn-container_7C970410-7F8E-3A42-1F94-5C43F1B0FE2D.cn--expandable.cn--collapsed li:nth-child(2)")
    public static WebElement firstItemFromLatestNewsWebElement;

    //getWebElement starts here
    public static WebElement getHeadLineNewsWebElement()
    {
        return headLineNewsWebElement;
    }
    public static WebElement getDonaldTrumpWebElement()
    {
        return donaldTrumpWebElement;
    }

    public static WebElement getSupremeCourtWebElement()
    {
        return supremeCourtWebElement;
    }

    public static WebElement getCongressWebElement()
    {
        return congressWebElement;
    }

    public static WebElement getFactFirstWebElement()
    {
        return factFirstWebElement;
    }

    public static WebElement getTwentyTwentyElectionWebElement()
    {
        return twentyTwentyElectionWebElement;
    }

    public static WebElement getFirstItemFromLastetNewsWebElement()
    {
        return firstItemFromLatestNewsWebElement;
    }
    //getWebElement ends here

    public void clickOnDonaldTrumpPage()
    {
        getDonaldTrumpWebElement().click();
    }

    public void clickOnSupremeCourtPage()
    {
        getSupremeCourtWebElement().click();
    }

    public void clickOnCongressPage()
    {
        getCongressWebElement().click();
    }

    public void clickOnFactsFirstPage()
    {
        getFactFirstWebElement().click();
    }

    public void clickOn2020ElectionPage()
    {
        getTwentyTwentyElectionWebElement().click();
    }

    public void clickOnFirstItemFromLatestNews()
    {
        getFirstItemFromLastetNewsWebElement().click();
    }

    public void clickOnHeadLineNews()
    {
        CommonAPI.waitUntilVisible(headLineNewsWebElement);
        String string = getHeadLineNewsWebElement().getText();
        System.out.println(string);
        CommonAPI.waitUntilClickAble(headLineNewsWebElement);
        getHeadLineNewsWebElement().click();
    }
}
