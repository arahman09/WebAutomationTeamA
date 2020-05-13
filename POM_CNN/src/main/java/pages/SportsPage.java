package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import sun.jvmstat.monitor.event.HostEvent;

public class SportsPage extends CommonAPI {
    //CommonAPI commonAPI= null;
    Homepage homepage= null;

    @FindBy(how = How.CSS, using="#backToCnn")
    public static WebElement backToHomePage;

    @FindBy(how = How.CSS, using=".active-link.atom.nav-link.parent-link.top-level")
    public static WebElement nflMenuTopBar;


    @FindBy(how = How.LINK_TEXT, using="Buffalo")
    public static WebElement nflMenuBuffaloLinkTopBar;

    @FindBy(how = How.CSS, using="#nba")
    public static WebElement nbaMenuTopBar;

    @FindBy(how = How.CSS, using="#college-football")
    public static WebElement cfbMenuTopBar;

    @FindBy(how = How.CSS, using="#world-football")
    public static WebElement worldFootBallMenuTopBar ;

    @FindBy(how = How.CSS, using="#mlb")
    public static WebElement mlbMenuTopBar;

    @FindBy(how = How.CSS, using="#more")
    public static WebElement moreMenuTopBar;

    @FindBy(how = How.CSS, using="#outer-container > footer > small")
    public static WebElement copyRightTextBottom;

    public static WebElement BackToHomePage() {
        return backToHomePage;
    }

    public static WebElement getNflMenuTopBar() {
        return nflMenuTopBar;
    }

    public static WebElement getNbaMenuTopBar() {
        return nbaMenuTopBar;
    }

    public static WebElement getCfbMenuTopBar() {
        return cfbMenuTopBar;
    }

    public static WebElement getWorldFootBallMenuTopBar() {
        return worldFootBallMenuTopBar;
    }

    public static WebElement getMlbMenuTopBar() {
        return mlbMenuTopBar;
    }

    public static WebElement getMoreMenuTopBar() {
        return moreMenuTopBar;
    }

    public static WebElement getNflMenuBuffaloLinkTopBar() {
        return nflMenuBuffaloLinkTopBar;
    }

    public static WebElement getCopyRightTextBottom() {
        return copyRightTextBottom;
    }

    public void clickOnBackToHomePage(){ backToHomePage.click();}
    public void clickOnNflMenuTopBar(){ nflMenuTopBar.click();}
    public void clickOnNbaMenuTopBar(){ nbaMenuTopBar.click();}
    public void clickOnCfbMenuTopBar(){ cfbMenuTopBar.click();}
    public void clickOnWorldFootBallMenuTopBar(){ worldFootBallMenuTopBar.click();}
    public void clickOnMlbMenuTopBar(){ mlbMenuTopBar.click();}
    public void clickOnMoreMenuTopBar(){ moreMenuTopBar.click();}


    public void clickOnNflMenuBuffaloLinkTopBar() throws InterruptedException {
        mouseHoverByCSS(".active-link.atom.nav-link.parent-link.top-level");
        sleepFor(2);
        getNflMenuBuffaloLinkTopBar().click();
    }

    public String getCopyRightText(){
       // homepage.goToSportsPage();
        String copyRightText= getCopyRightTextBottom().getText();
        //System.out.println(copyRightText);
        return copyRightText;

    }



}


