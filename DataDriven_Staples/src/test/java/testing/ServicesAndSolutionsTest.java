package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ServicesAndSolutionsPage;
import pages.StaplesHomePage;
import reporting.TestLogger;

import java.io.IOException;

public class ServicesAndSolutionsTest extends CommonAPI {

    StaplesHomePage staplesHomePage = null;
    ServicesAndSolutionsPage servicesAndSolutionsPage = null;

    @Test(priority = 1)
    public void searchItemFromExcel() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        staplesHomePage = PageFactory.initElements(driver, StaplesHomePage.class);
        servicesAndSolutionsPage = PageFactory.initElements(driver, ServicesAndSolutionsPage.class);
        servicesAndSolutionsPage.dropDownMenuTest();
    }
}