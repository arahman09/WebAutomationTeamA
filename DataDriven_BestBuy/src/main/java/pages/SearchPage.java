package pages;

import base.CommonAPI;
import datasource.FetchExternalData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.seleniumhq.jetty9.util.IO;

import java.io.IOException;

public class SearchPage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".search-input")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".header-search-button")
    public static WebElement searchSubmitButtonWebElement;

    @FindBy(how = How.CSS, using = ".c-modal-grid.col-xs-6")
    public static WebElement popUpWebElement;

    @FindBy(how = How.CSS, using = ".c-close-icon")
    public static WebElement closePopUpWebElement;



    public static WebElement getSearchWebElement()
    {
        return searchWebElement;
    }

    public static WebElement getSearchSubmitButtonWebElement()
    {
        return searchSubmitButtonWebElement;
    }

    public static void typeOnSeachInputBox(String value)
    {
        getSearchWebElement().sendKeys(value);
    }

    public static void clickOnSubmitButton()
    {
        getSearchSubmitButtonWebElement().click();
    }

    public void clearSearchBox()
    {
        getSearchWebElement().clear();
    }

    public void searchNSubmit()throws IOException
    {
        String[] items = getItems();
        for(int i = 0; i < items.length; i++)
        {
            clearSearchBox();
            //disablePopUp();
            typeOnSeachInputBox(items[i]);
            if(popUpWebElement.isDisplayed())
            {
                searchWebElement.sendKeys(Keys.ESCAPE);
            }
            clickOnSubmitButton();
        }

    }



    public String[] getItems()throws IOException
    {
        String[] items = FetchExternalData.getDataFromExcelFile("/data/BestBuy_products.xls");
        return items;
    }

    public void popHandling()
    {

        if(popUpWebElement.isDisplayed())
        {
            searchWebElement.sendKeys(Keys.ESCAPE);
        }

    }







}


