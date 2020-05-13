package pages;

import datasource.FetchExternalData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class ServicesAndSolutionsPage extends StaplesHomePage {

    public void goBackToHomeTab() throws InterruptedException {
        WebElement tabbedButton = driver.findElement(By.linkText("Printing Services"));
        tabbedButton.click();
        sleepFor(3);
        Set<String> windowId = Collections.singleton(driver.getWindowHandle());
        Iterator<String> iterator = windowId.iterator();
        String parentTab = iterator.next();
        String childTab = iterator.next();
        driver.switchTo().window(childTab);
        //driver.close();
        sleepFor(2);
        driver.switchTo().window(parentTab);

    }
        public void dropDownMenuTest() throws InterruptedException, IOException {
            clickOnServicesAndSolutions();
            WebElement element = driver.findElement(By.linkText("Printing Services"));
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
            sleepFor(2);
            String[] data = excelData();

//        String[] str = {"Business Services", "Tech Services", "Sustainability Services", "Office Services","Furniture Services", "Staple Corporate Solutions"};
//            for (String s : str) {
//                driver.findElement(By.linkText(s)).click();
//                //navigateBack();
//                goBackToHomeTab();
//               // mouseHoverByCSS(".Dropdown__sectionIconLabel");
//            }

            try {
                for(int i = 1; i < data.length; i++) {
                    //clickOnServicesAndSolutions();
                    System.out.println(data[i]);
                    driver.findElement(By.linkText(data[i])).click();
                    //navigateBack();
                    goBackToHomeTab();
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        public String[] excelData() throws IOException
        {
            String[] str = FetchExternalData.getDataFromExcelFile("/data/Services&SolutionTab.xls");
            return str;
        }
    }




