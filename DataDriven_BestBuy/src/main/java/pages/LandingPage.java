package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage
{
    @FindBy(how = How.CSS, using = ".search-input")
    public static WebElement sectionNavBarWebElement;
}
