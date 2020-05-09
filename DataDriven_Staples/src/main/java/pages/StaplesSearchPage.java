package pages;

import base.CommonAPI;
import datasource.FetchExternalData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.seleniumhq.jetty9.util.IO;

import java.io.IOException;


public class StaplesSearchPage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".search-bar__searchBar")  //.search-bar__searchBar
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".search-bar__iconContainer") //.search-bar__iconContainer
    public static WebElement searchSubmitButtonWebElement;

    public static WebElement getSearchWebElement()
    {
        return searchWebElement;
    }

    public static WebElement getSearchSubmitButtonWebElement()
    {
        return searchSubmitButtonWebElement;
    }

    public static void clearSearchInputBox()
    {
        getSearchWebElement().clear();
    }

    public static void typeInSearchInputBox(String value)
    {
        getSearchWebElement().sendKeys(value, Keys.ENTER);
    }

    public static void clickOnSubmitButton()
    {
        getSearchSubmitButtonWebElement().click();
    }

    public void searchNSubmit()throws IOException,InterruptedException
    {

        String[] items = null;

        try{
            items = getItems();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        for(String str : items)
        {
            clearSearchInputBox();
            typeInSearchInputBox(str);
            clearSearchInputBox();
            sleepFor(3);
        }
    }

    public String[] getItems() throws IOException
    {
        FetchExternalData externalDataSource = new FetchExternalData();
        String[] items  = externalDataSource.getDataFromExcelFile("/data/staples_products.xls");
        return items;
    }

    public String[] excelData() throws IOException
    {
        String[] data = getItems();
        return data;
    }
}

