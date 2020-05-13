package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TravelPage extends CommonAPI {

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


}
