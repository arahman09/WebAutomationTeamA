package test;

import ProductsInfo.Products;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.TestLogger;
import java.util.List;

public class TestSearchPage extends CommonAPI {

    @Test(priority = 1)
    public void testTypingOnSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
        Thread.sleep(2000);
        List<String> list = Products.getProducts();
        for (int i = 0; i < list.size(); i++) {
            driver.findElement(By.xpath("//*[@id=\"cli_shellHeaderSearchInput\"]")).sendKeys(list.get(i), Keys.ENTER);
            driver.findElement(By.xpath("//*[@id=\"cli_shellHeaderSearchInput\"]")).clear();
            Thread.sleep(2000);
        }
    }

    @Test(priority = 2)
    public void searchItemFromSql() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchAndSubmitFromSql();
    }

    @Test(priority = 3)
    public void searchItemFromExcel() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchAndSubmitFromExcel();
    }
}
