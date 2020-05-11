package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search {
    @FindBy(how = How.ID, using = "header-search-bar")
    public static WebElement searchBox;

    @FindBy(how = How.CSS, using = ".collectionList li:nth-child(1)")
    public static WebElement everythingWebElement;

    @FindBy(how = How.CSS, using = ".collectionList li:nth-child(2)")
    public static WebElement storiesWebElement;

    @FindBy(how = How.CSS, using = ".collectionList li:nth-child(3)")
    public static WebElement videosWebElement;

    @FindBy(how = How.CSS, using = ".collectionList li:nth-child(4)")
    public static WebElement photosWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(1)")
    public static WebElement allCNNWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(2)")
    public static WebElement usWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(3)")
    public static WebElement worldWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(4)")
    public static WebElement politicsWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(5)")
    public static WebElement businessWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(6)")
    public static WebElement opinionWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(7)")
    public static WebElement healthWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(8)")
    public static WebElement entertainmentWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(9)")
    public static WebElement styleWebElement;

    @FindBy(how = How.CSS, using = ".cnn-search__left li:nth-child(10)")
    public static WebElement travelWebElement;

    //getWebElement starts here
    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getEverythingWebElement() {
        return everythingWebElement;
    }

    public WebElement getStoriesWebElement() {
        return storiesWebElement;
    }

    public WebElement getVideosWebElement() {
        return videosWebElement;
    }

    public WebElement getPhotosWebElement() {
        return photosWebElement;
    }

    public WebElement getAllCNNWebElement() {
        return allCNNWebElement;
    }

    public WebElement getUSWebElement() {
        return usWebElement;
    }

    public WebElement getWorldWebElement() {
        return worldWebElement;
    }

    public WebElement getPoliticsWebElement() {
        return politicsWebElement;
    }

    public WebElement getBusinessWebElement() {
        return businessWebElement;
    }

    public WebElement getOpinionWebElement() {
        return opinionWebElement;
    }

    public WebElement getHealthWebElement() {
        return healthWebElement;
    }

    public WebElement getEntertainmentWebElement() {
        return entertainmentWebElement;
    }

    public WebElement getStyleWebElement()
    {
        return styleWebElement;
    }

    public WebElement getTravelWebElement()
    {
        return travelWebElement;
    }
    //getWebElement ends here

    public void typeOnSearchBoxNSearch(String value)
    {
        getSearchBox().sendKeys(value, Keys.ENTER);
    }

    public void clickOnEverything()
    {
        getEverythingWebElement().click();
    }

    public void clickOnStories()
    {
        getStoriesWebElement().click();
    }

    public void clickOnVideos()
    {
        getVideosWebElement().click();
    }

    public void clickOnPhotos()
    {
        getPhotosWebElement().click();
    }

    public void clickOnAllCNN()
    {
        getAllCNNWebElement().click();
    }

    public void clickOnUS()
    {
        getUSWebElement().click();
    }

    public void clickOnWorld()
    {
        getWorldWebElement().click();
    }

    public void clickOnPolitics()
    {
        getPoliticsWebElement().click();
    }

    public void clickOnBusiness()
    {
        getBusinessWebElement().click();
    }

    public void clickOnOpinion()
    {
        getOpinionWebElement().click();
    }

    public void clickOnHealth()
    {
        getHealthWebElement().click();
    }

    public void clickOnEntertainment()
    {
        getEntertainmentWebElement().click();
    }

    public void clickOnStyle()
    {
        getStyleWebElement().click();
    }

    public void clickOnTravel()
    {
        getTravelWebElement().click();
    }
}
