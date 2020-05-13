package NavigateTheTabs;

import base.CommonAPI;
import datasource.ExternalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BrandsPage;

import java.io.IOException;

public class NavigateBrandsTab extends BrandsPage {

        BrandsPage brandsPage = null;

        public void navigateToApple(WebDriver driver) throws InterruptedException {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickAppleTab();
        }
        public void navigateToSumsung(WebDriver driver){
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickSamsungTab();
        }
        public void navigateToMicrosoft(WebDriver driver){
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickMicrosoftTab();
        }
        public void navigateToSony(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickSonyTab();
        }
        public void navigateToIntel(WebDriver driver){
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickIntelTab();
        }
        public void navigateToInsignia(WebDriver driver){
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickInsigniaTab();
        }
        public void navigateToLenovo(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickLenovoTab();
        }
        public void navigateToLG(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickLGTab();
        }
        public void navigateToNikon(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickNikonTab();
        }
        public void navigateToBose(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickBoseTab();
        }
        public void navigateToCanon(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickCanonTab();
        }
        public void navigateToEpson(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickEpsonTab();
        }
        public void navigateToGoPro(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickGoProTab();
        }
        public void navigateToHP(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickHpTab();
        }
        public void navigateToAllBrands(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickAllBrandsTab();
        }
        public void navigateToMagnoliaAudioNVideo(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickMagnoliaAudioTab();
        }
        public void navigateToPacificKitchen(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickPacificKitchenTab();
        }
        public void navigateCameraExperience(WebDriver driver) {
            brandsPage = PageFactory.initElements(driver, BrandsPage.class);
            brandsPage.clickBrandsTab();
            brandsPage.clickCameraExperienceTab();
        }

        public void stepsFlow(String tabs, WebDriver driver) throws InterruptedException {
            switch(tabs){
                case "Apple":
                    navigateToApple(driver);
                    CommonAPI.navigateBack();
                    break;
                case "Samsung":
                    navigateToSumsung(driver);
                    CommonAPI.navigateBack();
                    break;
                case "Microsoft":
                    navigateToMicrosoft(driver);
                    CommonAPI.navigateBack();
                    break;
                case "Sony":
                    navigateToSony(driver);
                    CommonAPI.navigateBack();
                    break;
                case "Intel":
                    navigateToIntel(driver);
                    CommonAPI.navigateBack();
                    break;
                case "Insignia":
                    navigateToInsignia(driver);
                    CommonAPI.navigateBack();
                    break;
                default:
                    System.out.print("No more valid tabs\n");
                    break;

            }
        }
        public void navigateBrandsKeyTabs(WebDriver driver) throws IOException, InterruptedException {
            String [] tabList = ExternalData.getDataFromExcelFile("/data/best-buy-file-sajol.xls");
            for(int i=2; i<tabList.length; i++) {
                stepsFlow(tabList[i], driver);
            }
        }
}


