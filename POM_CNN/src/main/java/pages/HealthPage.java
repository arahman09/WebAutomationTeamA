package pages;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.CnnNews;
import reporting.TestLogger;

public class HealthPage extends CnnNews {
  //  private final WebDriver driver;

    public HealthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CSS, using = "li.dMglaH:nth-child(6) > a")
    public static WebElement healthWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a")
    public static WebElement foodWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a")
    public static WebElement fitnessWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a")
    public static WebElement wellnessWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a")
    public static WebElement parentingWebElement;
    @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a")
    public static WebElement vitalSignsWebElement;

    public WebElement getHeadLineNewsWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        return healthWebElement;
    }

//    public void headLineNews()
//    {
//
//    }

    public void clickOnHeath()
    {
        healthWebElement.click();
    }
    public void clickOnFood ()
    {
        foodWebElement.click();
    }

    public void clickOnFitness()
    {
        fitnessWebElement.click();
    }

    public void clickWellness()
    {
        wellnessWebElement.click();
    }

    public void clickOnPareting()
    {
       parentingWebElement.click();
    }

    public void clickOnVitalSigns()
    {
        vitalSignsWebElement.click();
    }
}