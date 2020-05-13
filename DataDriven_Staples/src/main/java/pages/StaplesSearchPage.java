package pages;

import base.CommonAPI;
import datasource.FetchExternalData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.seleniumhq.jetty9.util.IO;

import java.io.IOException;
import java.util.List;


public class StaplesSearchPage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".search-bar__searchBar")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".checkbox__checkboxLabelIconContainer")
    public static WebElement nextDayEligibleWebElement;

    @FindBy(how = How.CSS, using = "#myStoreFilter")
    public static WebElement setStoreWebElement;

    @FindBy(how = How.CSS, using = "#storeSearchInput1")
    public static WebElement setStoreInputWebElement;

    @FindBy(how = How.CSS, using = "#BOBISFLAG_3A_221_22")
    public static WebElement buyOnlineNPickUpWebElement;

    public static WebElement getSearchWebElement()
    {
        return searchWebElement;
    }

    public static WebElement getNextDayEligibleWebElement()
    {
        return nextDayEligibleWebElement;
    }

    public static WebElement getSetStoreWebElement()
    {
        return setStoreWebElement;
    }

    public static WebElement getSetStoreInputWebElement()
    {
        return setStoreInputWebElement;
    }

    public static WebElement getBuyOnlineNPickUpWebElement()
    {
        return buyOnlineNPickUpWebElement;
    }

    public void clickOnNextDayEligibleFilter()
    {
        getNextDayEligibleWebElement().click();
    }

    public void clickOnSetStore()
    {
        getSetStoreWebElement().click();
    }

    public void inputStoreLocationNSubmit(String str)
    {
        getSetStoreInputWebElement().sendKeys(str, Keys.ENTER);
    }

    public void clickOnBuyOnlineNPickUp()
    {
        getBuyOnlineNPickUpWebElement().click();
    }

    public void typeInSearchInputBoxNSearch(String value)
    {
        getSearchWebElement().sendKeys(value, Keys.ENTER);
    }


    public void searchNSubmitUsingExcelData()throws InterruptedException
    {

        String[] items = null;

        try
        {
            items = excelData();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        for(String str : items)
        {
            clearSearchInputBox();
            typeInSearchInputBoxNSearch(str);
            clearSearchInputBox();
            sleepFor(3);
        }
    }

    public void searchNSubmitUsingSQLData()throws InterruptedException
    {
        List<String> items = null;

        try
        {
            items = sqlData();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        for(String str : items)
        {
            clearSearchInputBox();
            typeInSearchInputBoxNSearch(str);
            clearSearchInputBox();
            sleepFor(3);
        }
    }

    public static List<String> sqlData() throws Exception
    {
        List<String> data = FetchExternalData.getDataFromDatabase();
        return data;
    }

    public static String[] excelData() throws IOException
    {
        String[] items  = FetchExternalData.getDataFromExcelFile("/data/staples_items.xls");
        return items;
    }

    public void clearSearchInputBox()
    {
        getSearchWebElement().clear();
    }
}

