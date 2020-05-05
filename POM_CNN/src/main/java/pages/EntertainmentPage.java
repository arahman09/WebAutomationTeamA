package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class EntertainmentPage extends CnnNews {

      //  private final WebDriver driver;

        public EntertainmentPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        @FindBy(how = How.CSS, using = "li.dMglaH:nth-child(7) > a")
        public static WebElement entertainmentWebElement;
        @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a")
        public static WebElement starsWebElement;
        @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a")
        public static WebElement screenWebElement;
        @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a")
        public static WebElement bingeWebElement;
        @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a")
        public static WebElement cultureWebElement;
        @FindBy(how = How.CSS, using = "div.sc-gisBJw:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a")
        public static WebElement mediaWebElement;

        public WebElement getHeadLineNewsWebElement() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
            {}.getClass().getEnclosingMethod().getName()));
            return entertainmentWebElement;
        }

      //  public void testLogger()

        public void headLineNews()
        {
            getHeadLineNewsWebElement();
        }
         public void clickOnEntertainment()
        {
            entertainmentWebElement.click();
        }
        public void clickOnStars()
        {
            starsWebElement.click();
        }
        public void clickOnScreen ()
        {
            screenWebElement.click();
        }

        public void clickOnBinge()
        {
            bingeWebElement.click();
        }

        public void clickOnCulture()
        {
            cultureWebElement.click();
        }

        public void clickOnMedia()
        {
            mediaWebElement.click();
        }
}

