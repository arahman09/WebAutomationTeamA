package navigation;

import base.CommonAPI;
import handlingtabs.NavigateTabs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestNavigation extends CommonAPI {

    @Test
    public void navigateTabs() throws IOException {
        NavigateTabs navigateTabs = PageFactory.initElements(driver, NavigateTabs.class);
        navigateTabs.navigateKeyTabs(driver);

    }
}
