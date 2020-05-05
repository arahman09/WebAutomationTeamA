package health;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HealthPage;

public class TestHealthPage extends CommonAPI
{
    HealthPage healthPage = null;

    public void pageFactory()
    {
        healthPage = PageFactory.initElements(driver, HealthPage.class);
       // homepage = PageFactory.initElements(driver,Homepage.class);
    }

//    @Test(priority = 1)
//    public void verifyHeadLineNews()
//    {
//        pageFactory();
//        healthPage.headLineNews();
//    }
    @Test (priority = 2)
    public void verifyHealthPage()
    {
        pageFactory();
        healthPage.clickOnHeath();
    }
    @Test (priority = 3)
    public void verifyFoodPage()
    {
        verifyHealthPage();
        pageFactory();
        healthPage.clickOnFood();
    }
    @Test (priority = 4)
    public void verifyFitnessPage()
    {
        verifyHealthPage();
        pageFactory();
        healthPage.clickOnFitness();
    }
    @Test (priority = 5)
    public void verifyWellnessPage()
    {
        verifyHealthPage();
        pageFactory();
        healthPage.clickWellness();
    }
    @Test (priority = 6)
    public void verifyParentingPage()
    {
        verifyHealthPage();
        pageFactory();
        healthPage.clickOnPareting();
    }
    @Test (priority = 7)
    public void verifyVitalSignsPage()
    {
        verifyHealthPage();
        pageFactory();
        healthPage.clickOnVitalSigns();
    }
}
