package navigation;

import NavigateTheTabs.NavigateBrandsTab;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestBrandsPageNavigation extends CommonAPI {
    @Test
    public void navigateTabs() throws IOException, InterruptedException {
        NavigateBrandsTab navigateBrandsTab = PageFactory.initElements(driver, NavigateBrandsTab.class);
        navigateBrandsTab.navigateBrandsKeyTabs(driver);

    }

}
