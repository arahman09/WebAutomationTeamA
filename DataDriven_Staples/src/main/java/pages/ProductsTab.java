package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsTab extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".menu li:nth-child(1)")
    public static WebElement officeSuppliesWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(2)")
    public static WebElement inkNTonerWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(3)")
    public static WebElement paperWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(4)")
    public static WebElement computersNAccessoriesWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(5)")
    public static WebElement printersNScannersWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(6)")
    public static WebElement electronicsWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(7)")
    public static WebElement furnitureWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(8)")
    public static WebElement foodNBreakroomWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(9)")
    public static WebElement cleaningSuppliesWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(10)")
    public static WebElement facilitiesMaintenanceWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(11)")
    public static WebElement safetySuppliesWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(12)")
    public static WebElement mailNShipWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(13)")
    public static WebElement printNMarketingWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(14)")
    public static WebElement shopAllProductsWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(15)")
    public static WebElement shopByIndustryWebElement;

    @FindBy(how = How.CSS, using = ".menu li:nth-child(16)")
    public static WebElement shopByBrandWebElement;

    public static WebElement getOfficeSuppliesWebElement()
    {
        return officeSuppliesWebElement;
    }

    public static WebElement getInkNTonerWebElement()
    {
        return inkNTonerWebElement;
    }

    public static WebElement getPaperWebElement()
    {
        return paperWebElement;
    }

    public static WebElement getComputersNAccessoriesWebElement()
    {
        return computersNAccessoriesWebElement;
    }

    public static WebElement getPrintersNScannersWebElement()
    {
        return printersNScannersWebElement;
    }

    public static WebElement getElectronicsWebElement()
    {
        return electronicsWebElement;
    }

    public static WebElement getFurnitureWebElement()
    {
        return furnitureWebElement;
    }

    public static WebElement getFoodNBreakroomWebElement()
    {
        return foodNBreakroomWebElement;
    }

    public static WebElement getCleaningSuppliesWebElement()
    {
        return cleaningSuppliesWebElement;
    }

    public static WebElement getFacilitiesMaintenanceWebElement()
    {
        return facilitiesMaintenanceWebElement;
    }

    public static WebElement getSafetySuppliesWebElement()
    {
        return safetySuppliesWebElement;
    }

    public static WebElement getMailNShipWebElement()
    {
        return mailNShipWebElement;
    }

    public static WebElement getPrintNMarketingWebElement()
    {
        return printNMarketingWebElement;
    }

    public static WebElement getShopAllProductsWebElement()
    {
        return shopAllProductsWebElement;
    }

    public static WebElement getShopByIndustryWebElement()
    {
        return shopByIndustryWebElement;
    }

    public static WebElement getShopByBrandWebElement()
    {
        return shopByBrandWebElement;
    }

    public void mouseHoverToOffieSupplies()
    {
        mouseHoverByCSS(".menu li:nth-child(1)");
    }

    public void mouseHoverToInkNToner()
    {
        mouseHoverByCSS(".menu li:nth-child(2)");
    }

    public void mouseHoverToPaper()
    {
        mouseHoverByCSS(".menu li:nth-child(3)");
    }

    public void mouseHoverToComputerNAccessories()
    {
        mouseHoverByCSS(".menu li:nth-child(4)");
    }

    public void mouseHoverToPrintersNScanners()
    {
        mouseHoverByCSS(".menu li:nth-child(5)");
    }

    public void mouseHoverToElectronics()
    {
        mouseHoverByCSS(".menu li:nth-child(6)");
    }

    public void mouseHoverToFurniture()
    {
        mouseHoverByCSS(".menu li:nth-child(7)");
    }

    public void mouseHoverToFoodNBreakroom()
    {
        mouseHoverByCSS(".menu li:nth-child(8)");
    }

    public void mouseHoverToCleaningSupplies()
    {
        mouseHoverByCSS(".menu li:nth-child(9)");
    }

    public void mouseHoverToFacilitiesMaintenance()
    {
        mouseHoverByCSS(".menu li:nth-child(10)");
    }

    public void mouseHoverToSafetySupplies()
    {
        mouseHoverByCSS(".menu li:nth-child(11)");
    }

    public void mouseHoverToMailNShip()
    {
        mouseHoverByCSS(".menu li:nth-child(12)");
    }

    public void mouseHoverToPrintNMarketing()
    {
        mouseHoverByCSS(".menu li:nth-child(13)");
    }

    public void mouseHoverToShopAllProducts()
    {
        mouseHoverByCSS(".menu li:nth-child(14)");
    }

    public void mouseHoverToShopByIndustry()
    {
        mouseHoverByCSS(".menu li:nth-child(15)");
    }

    public void mouseHoverToShopByBrand()
    {
        mouseHoverByCSS(".menu li:nth-child(16)");
    }

    public void clickOnOfficeSupplies()
    {
        getOfficeSuppliesWebElement().click();
    }

    public void clickOnInkNToner()
    {
        getInkNTonerWebElement().click();
    }

    public void clickOnPaper()
    {
        getPaperWebElement().click();
    }

    public void clickOnComputersNAccessories()
    {
        getComputersNAccessoriesWebElement().click();
    }

    public void clickOnPrintersNScanners()
    {
        getPrintersNScannersWebElement().click();
    }

    public void clickOnElectronics()
    {
        getElectronicsWebElement().click();
    }

    public void clickOnFurniture()
    {
        getFurnitureWebElement().click();
    }

    public void clickOnFoodNBreakroom()
    {
        getFoodNBreakroomWebElement().click();
    }

    public void clickOnCleaningSupplies()
    {
        getCleaningSuppliesWebElement().click();
    }

    public void clickOnFacilitiesMaintenance()
    {
        getFacilitiesMaintenanceWebElement().click();
    }

    public void clickOnSafetySupplies()
    {
        getSafetySuppliesWebElement().click();
    }

    public void clickOnMailNShip()
    {
        getMailNShipWebElement().click();
    }

    public void clickOnPrintNMarketing()
    {
        getPrintNMarketingWebElement().click();
    }

    public void clickOnShopAllProducts()
    {
        getShopAllProductsWebElement().click();
    }

    public void clickOnShopByIndustry()
    {
        getShopByIndustryWebElement().click();
    }

    public void clickOnShopByBrand()
    {
        getShopByBrandWebElement().click();
    }
}
