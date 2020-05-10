package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StaplesHomePage extends CommonAPI
{
    @FindBy(how = How.CSS, using = "searchInput")
    public static WebElement searchBoxWebElement;




}
