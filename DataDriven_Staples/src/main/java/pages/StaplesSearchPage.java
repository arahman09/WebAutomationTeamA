package pages;

import base.CommonAPI;
import datasource.FetchExternalData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
import java.util.List;


public class StaplesSearchPage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".search-bar__searchBar")
    public static WebElement searchWebElement;


    public static WebElement getSearchWebElement()
    {
        return searchWebElement;
    }

    public static void typeInSearchInputBox(String value)
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
            typeInSearchInputBox(str);
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
            typeInSearchInputBox(str);
            clearSearchInputBox();
            sleepFor(3);
        }
    }

    public static List<String> sqlData() throws Exception
    {
        List<String> data = FetchExternalData.getDataFromDatabase();
        return data;
    }

    public String[] excelData() throws IOException
    {
        String[] items  = FetchExternalData.getDataFromExcelFile("/data/staples_products.xls");
        return items;
    }

    public static void clearSearchInputBox()
    {
        getSearchWebElement().clear();
    }
}

