package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Politics extends CommonAPI
{
    @FindBy(how = How.CLASS_NAME, using = "cd__headline-text")
    public WebElement headlineElement;

    public WebElement getHeadLineNewsWebElement(){
        testLogger();
        return headlineElement;
    }
    public void clickOnHeadLineNews(){
        testLogger();
        CommonAPI.waitUntilVisible(headlineElement);
        String headLineNews = getHeadLineNewsWebElement().getText();
        System.out.println(headLineNews);
        CommonAPI.waitUntilClickAble(headlineElement);
        getHeadLineNewsWebElement().click();
    }
}
