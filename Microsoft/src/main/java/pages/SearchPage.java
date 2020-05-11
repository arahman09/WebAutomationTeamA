package pages;

import base.CommonAPI;
import datasuply.FetchExternalData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy (how = How.XPATH, using = "//*[@id=\"search\"]")
    public static WebElement searchWebElement;
    @FindBy (how = How.XPATH, using = "//*[@id=\"cli_shellHeaderSearchInput\"]")
    public static WebElement searchBoxWebElement;
    @FindBy (how = How.XPATH, using = "//*[@id=\"search\"]")
    public static WebElement searchAndClickWebElement;

    public WebElement getSearchIconWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return searchWebElement;
    }
    public WebElement getSearchBoxWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return searchBoxWebElement;
    }
    public WebElement getSearchAndClickWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return searchAndClickWebElement;
    }
    public void clearSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getSearchBoxWebElement().clear();
    }
    public void typeInSearchBox(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getSearchBoxWebElement().sendKeys(value, Keys.ENTER);
    }
    public void clickOnSearchIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        getSearchAndClickWebElement().click();
    }
    public void searchAndSubmitFromSql()throws InterruptedException {

        List<String> items = null;
        try{
            items = sqlData();
        }
        catch (Exception e) {
           System.out.println(e);
        }
        clickOnSearchIcon();
        for(String str : items) {
            clearSearchBox();
            typeInSearchBox(str);
            clearSearchBox();
            sleepFor(3);
        }
    }
    public static List<String> sqlData() throws Exception {
        List<String> data = FetchExternalData.getDataFromDatabase();
        return data;
    }
    public void searchAndSubmitFromExcel()throws InterruptedException {
        List<String> items = null;
        try{
            items = Arrays.asList(excelData());
        }
        catch (Exception e) {
            System.out.println(e);
        }
        clickOnSearchIcon();
        for(String str : items) {
            clearSearchBox();
            typeInSearchBox(str);
            clearSearchBox();
            sleepFor(3);
        }
    }
    public String[] excelData() throws IOException {
        String[] items  = FetchExternalData.getDataFromExcelFile("/data/MicrosoftProducts.xls");
        return items;
    }
}
