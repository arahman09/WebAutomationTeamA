package handlingtabs;

import base.CommonAPI;
import datasuply.FetchExternalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.io.IOException;

public class NavigateTabs extends HomePage {


    HomePage homePage = null;

    public void navigateToMicrosoft365(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMicrosoft365();
    }
    public void navigateToOffice(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnOffice();
    }
    public void navigateToWindows(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWindows();
    }
    public void navigateToSurface(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSurface();
    }
    public void navigateToXbox(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnXbox();
    }
    public void navigateToDeals(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDeals();
    }
    public void navigateToSupport(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSupport();
    }

    public void stepsFlow(String tabs, WebDriver driver) {
        switch(tabs){
            case "Microsoft365":
                navigateToMicrosoft365(driver);
                CommonAPI.navigateBack();
                break;
            case "Office":
                navigateToOffice(driver);
                CommonAPI.navigateBack();
                break;
            case "Windows":
                navigateToWindows(driver);
                CommonAPI.navigateBack();
                break;
            case "Surface":
                navigateToSurface(driver);
                CommonAPI.navigateBack();
                break;
            case "Xbox":
                navigateToXbox(driver);
                CommonAPI.navigateBack();
                break;
//            case "Deals":
//                navigateToDeals(driver);
//                CommonAPI.navigateBack();
//                break;
            case "Support":
                navigateToSupport(driver);
                CommonAPI.navigateBack();
                break;
            default:
                System.out.print("No more valid tabs\n");
                break;

        }
    }
    public void navigateKeyTabs(WebDriver driver) throws IOException {
        String [] tabList = FetchExternalData.getDataFromExcelFile("/data/MicrosoftTab.xls");
        for(int i=1; i<tabList.length; i++) {
            stepsFlow(tabList[i], driver);
        }
    }
}
