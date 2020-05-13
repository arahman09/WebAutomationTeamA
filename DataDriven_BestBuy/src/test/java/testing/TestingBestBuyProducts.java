package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BestBuyHomePage;
import pages.SearchPage;

import java.io.IOException;

public class TestingBestBuyProducts extends CommonAPI
{
    @Test
    public void searchItemsOnSearchBar()throws IOException,InterruptedException
    {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchNSubmit();

    }

}
