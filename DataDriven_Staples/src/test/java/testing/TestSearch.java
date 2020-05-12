package testing;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.StaplesSearchPage;

import java.io.IOException;

public class TestSearch extends CommonAPI
{
//    @Test
//    public void searchItem()throws IOException,InterruptedException
//    {
//        StaplesSearchPage searchPage = PageFactory.initElements(driver, StaplesSearchPage.class);
//        searchPage.searchNSubmit();
//    }

    @Test
    public void dropDownMenuTest() throws InterruptedException
    {
        mouseHoverByCSS(".Dropdown__sectionIconLabel");
        Thread.sleep(3000);
        driver.findElement(By.linkText("My Lists")).click();
        Thread.sleep(6000);
    }
}


