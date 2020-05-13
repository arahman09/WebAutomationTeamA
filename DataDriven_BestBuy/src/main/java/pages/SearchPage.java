package pages;

import base.CommonAPI;
import datasource.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class SearchPage extends CommonAPI
{
    @FindBy(how = How.CSS, using = "#gh-search-input")
    public static WebElement searchBarWebElement;

    @FindBy(how = How.CSS, using = ".header-search-button")
    public static WebElement searchSubmitButtonWebElement;

    @FindBy(how = How.CSS, using = ".c-modal-grid.col-xs-6")
    public static WebElement popUpWebElement;

    @FindBy(how = How.CSS, using = ".c-close-icon")
    public static WebElement closePopUpWebElement;


    @FindBy(how = How.CSS, using = ".c-modal-window.email-submission-modal.active")
    public static WebElement windowWebElement;


    public static WebElement getSearchBarWebElement()
    {
        return searchBarWebElement;
    }

    public static WebElement getSearchSubmitButtonWebElement()
    {
        return searchSubmitButtonWebElement;
    }

    public static void clickOnSubmitButton()
    {
        getSearchSubmitButtonWebElement().click();
    }

    public void clearSearchBox()
    {
        getSearchBarWebElement().clear();
    }

    public static void typeOnSeachInputBox(String items)
    {
        getSearchBarWebElement().sendKeys(items);
    }

    public void searchNSubmit()throws IOException,InterruptedException
    {
        //windowWebElement.click();
        String[] items = getItems();
        for(int i = 1; i < items.length; i++)
        {
            getSearchBarWebElement().click();
            typeOnSeachInputBox(items[i]);
            clickOnSubmitButton();
            sleepFor(2);
            clearSearchBox();
        }

    }

    public static String[] getItems()throws IOException
    {
        String[] items = DataSource.getDataFromExcelFile("/data/Evan_Data_BestBuy.xls");
        return items;
    }










}


