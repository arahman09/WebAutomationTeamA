package pages.menu;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class HealthPage extends CnnNews {
    private final WebDriver driver;

    public HealthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CSS, using = ".sc-hMqMXs > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a")
    public static WebElement headLineNewsWebElement;
    @FindBy(how = How.CSS, using = "")
    public static WebElement foodWebElement;
    @FindBy(how = How.CSS, using = "")
    public static WebElement fitnessWebElement;
    @FindBy(how = How.CSS, using = "")
    public static WebElement wellnessWebElement;
    @FindBy(how = How.CSS, using = "")
    public static WebElement parentingWebElement;
    @FindBy(how = How.CSS, using = "")
    public static WebElement vitalSignsWebElement;

    public WebElement getHeadLineNewsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return headLineNewsWebElement;
    }
}