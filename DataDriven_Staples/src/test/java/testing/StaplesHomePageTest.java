package testing;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class StaplesHomePageTest extends CommonAPI {

    @Test (priority = 1)
    public void signInTab() throws InterruptedException{

        WebElement element = driver.findElement(By.xpath("//*[@id=\"Sign In\"]/div/div"));
        Actions actions = new Actions (driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Sign In")).click();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.findElement(By.id("loginUsername")).sendKeys("sajol123", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.id("loginPassword")).sendKeys("xyz123", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.id("loginSubmit")).click();
    }
    @Test (priority = 2)
    public void signInHoverMouse1 () throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"Sign In\"]/div/div"));
        Actions actions = new Actions (driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Account Overview")).click();
    }
    @Test (priority = 3)

    public void signInHoverMouse2 () throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"Sign In\"]/div/div"));
        Actions actions = new Actions (driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Order Center")).click();
    }
    @Test (priority = 4)
    public void signInHoverMouse3 () throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"Sign In\"]/div/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("My Profile")).click();
    }
    @Test (priority = 5)
    public void signInHoverMouse4 () throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"Sign In\"]/div/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Staples Rewards")).click();
    }
    @Test (priority = 6)
    public void signInHoverMouse5 () throws InterruptedException {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"Sign In\"]/div/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create Account")).click();
    }
    @Test (priority = 7)
    public void createNewAccount() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"Sign In\"]/div/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("createEmail")).sendKeys("sajol@gmail.com",Keys.TAB);
        driver.findElement(By.id("createPassword")).sendKeys("xyz123");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div/div/div[2]/div/div[4]/div")).click();

    }

    @Test (priority = 8)
    public void phoneNumber() throws InterruptedException{
        WebElement element = driver.findElement(By.cssSelector(".uiStyles__mmx_icon_help"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Help Center")).click();
        Thread.sleep(2000);
        String phone = driver.findElement(By.cssSelector("div.Contacts__contacts_row:nth-child(2) > div:nth-child(2) > div:nth-child(2)")).getText();
        System.out.println(phone);
    }
}
