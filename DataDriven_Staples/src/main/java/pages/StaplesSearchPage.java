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

//    public void searchNSubmit()throws IOException,InterruptedException
//    {
//
//        String[] items = null;
//
//        try{
//            items = excelData();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//
//        for(String str : items)
//        {
//            clearSearchInputBox();
//            typeInSearchInputBox(str);
//            clearSearchInputBox();
//            sleepFor(3);
//        }
//    }

    public String[] excelData() throws IOException
    {
        String[] items  = FetchExternalData.getDataFromExcelFile("/data/staples_products.xls");
        return items;
    }

    public void searchNSubmit()throws IOException,InterruptedException
    {

        List<String> items = null;

        try{
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
}

