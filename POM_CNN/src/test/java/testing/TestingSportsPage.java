package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.SportsPage;
import reporting.TestLogger;

public class TestingSportsPage extends CommonAPI {
    Homepage homepage = null;
    SportsPage sportsPage = null;

    public void pageFactoryNTestLogger(){
        homepage= PageFactory.initElements(driver, Homepage.class);
        sportsPage= PageFactory.initElements(driver, SportsPage.class);
        homepage.clickOnSportsPage();
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));

    }

    @Test
    public void verifyCopyRightText(){
        pageFactoryNTestLogger();
        String text = sportsPage.getCopyRightText();
        System.out.println(text);
    }
   @Test
    public void verifyBackToHomePageButton() throws InterruptedException {
        pageFactoryNTestLogger();
        sleepFor(2);
        sportsPage.clickOnBackToHomePage();
    }
   @Test
    public void verifyNflLink()throws InterruptedException {
        pageFactoryNTestLogger();
       sleepFor(2);
        sportsPage.clickOnNflMenuTopBar();
    }
    @Test
    public void verifyNbaLink() throws InterruptedException{
        pageFactoryNTestLogger();
        sleepFor(2);
        sportsPage.clickOnNflMenuTopBar();
    }
    @Test
    public void verifyCfbLink() throws InterruptedException{
        pageFactoryNTestLogger();
        sleepFor(2);
        sportsPage.clickOnCfbMenuTopBar();
    }
    @Test
    public void verifyWorldFootBallLink()throws InterruptedException {
        pageFactoryNTestLogger();
        sleepFor(2);
        sportsPage.clickOnWorldFootBallMenuTopBar();
    }
    @Test
    public void verifyMlbLink() throws InterruptedException {
        pageFactoryNTestLogger();
        sleepFor(2);
        sportsPage.clickOnMlbMenuTopBar();
    }
    @Test
    public void verifyMorelink() throws InterruptedException{
        pageFactoryNTestLogger();
        sleepFor(2);
        sportsPage.clickOnMoreMenuTopBar();
    }*/
    @Test
    public void verifyNFLBuffaloLink() throws InterruptedException {
        pageFactoryNTestLogger();
        sleepFor(2);
        sportsPage.clickOnNflMenuBuffaloLinkTopBar();
    }
   /*@Test
    public void verify() {
        pageFactoryNTestLogger();
    }
    @Test
    public void verify() {
        pageFactoryNTestLogger();
    }
    @Test
    public void verify() {
        pageFactoryNTestLogger();
    }@Test
    public void verify() {
        pageFactoryNTestLogger();
    }
    @Test
    public void verify() {
        pageFactoryNTestLogger();
    }
*/
}
