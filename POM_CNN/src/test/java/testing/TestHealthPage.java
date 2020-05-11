package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HealthPage;
import pages.Homepage;

public class TestHealthPage extends CommonAPI {

    Homepage homepage = null;
    HealthPage healthPage = null;

    @Test(priority = 1)
    public void verifyHeadLineNews() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
        healthPage.getHeadLineNewsWebElement();
        healthPage.clickOnHeadLineNews();
    }
    @Test (priority = 2)
    public void verifyHealthPage() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
    }
    @Test (priority = 3)
    public void verifyFoodPage() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
        healthPage.getFoodWebElement();
        healthPage.clickOnFoodTab();
    }
    @Test (priority = 4)
    public void verifyFitnessPage() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
        healthPage.getFitnessWebElement();
        healthPage.clickOnFitnessTab();
    }
    @Test (priority = 5)
    public void verifyWellnessPage() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
        healthPage.getWellnessWebElement();
        healthPage.clickWellnessTab();
    }
    @Test (priority = 6)
    public void verifyParentingPage() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
        healthPage.getParentingWebElement();
        healthPage.clickOnParentingTab();
    }
    @Test (priority = 7)
    public void verifyVitalSignsPage() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
        healthPage.getVitalSignsWebElement();
        healthPage.clickOnVitalSignsTab();
    }
    @Test (priority = 8)
    public void verifyScienceAndHealthPage() {
        homepage = PageFactory.initElements(driver,Homepage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        homepage.clickOnHealthTab();
        healthPage.getScienceAndHealthWebElement();
        healthPage.clickOnScienceAndHeathTab();
    }
}
