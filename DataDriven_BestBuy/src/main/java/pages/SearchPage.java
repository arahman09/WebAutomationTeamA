package pages;

import base.CommonAPI;
import datasource.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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


    @FindBy(how = How.CSS, using = ".c-modal-window.email-submission-modal.active")
    public static WebElement windowWebElement;

    public static WebElement getSearchWebElement()
    {
        return searchWebElement;
    }

    public static WebElement getSearchSubmitButtonWebElement()
    {
        return searchSubmitButtonWebElement;
    }

    public static void typeOnSearchInputBox(String value)
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

    public void searchNSubmit()throws IOException,InterruptedException
    {
        //String[] items = getItems();
        sleepFor(5);
        windowWebElement.click();
        for(int i = 0; i < 3; i++)
        {
            clearSearchBox();
            typeOnSearchInputBox("pen");
            clickOnSubmitButton();
            sleepFor(1);
        }

    }

    public static String[] getItems()throws IOException
    {
        String[] items = DataSource.getDataFromExcelFile("/data/BestBuy_products.xls");
        return items;
    }










}


