package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class TestDropDownClass extends CommonAPI
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver");

        //getLocalDriver("OS X", "chrome");
        Select select = new Select(driver.findElement(By.id("month")));
        List<WebElement> list = select.getOptions();

        for(WebElement we : list)
        {
            System.out.println(we.getText());
        }
    }
}
