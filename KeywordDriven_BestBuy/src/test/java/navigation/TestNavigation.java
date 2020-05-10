package navigation;

import NavigateTheTabs.NavigateTheTabs;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestNavigation extends CommonAPI
{
    @Test
    public void navigateTabs() throws IOException,InterruptedException
    {
         NavigateTheTabs navigateTheTabs = PageFactory.initElements(driver, NavigateTheTabs.class);
         navigateTheTabs.navigateKeyBars(driver);
    }
}
