package testing;

import base.CommonAPI;
import datasource.FetchTheSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BestBuyHomePage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

public class TestingBestBuyProducts extends CommonAPI
{
    @Test (priority = 1)
    public static String[] excelData() throws IOException
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FetchTheSteps fetchTheSteps = new FetchTheSteps();
        String [] string = fetchTheSteps.getDataFromExcelFileForFeaturesChoice();

        return string;
    }

//    @Test
//    public void testTypingOnSearchBox() throws IOException,InterruptedException
//    {
//        String[] list = excelData();
//
//
//        for(int i = 0; i < list.length; i++)
//        {
//            driver.findElement(By.id("gh-search-input")).sendKeys(list[i], Keys.ENTER);
//            sleepFor(3);
//        }
//    }


    public static void main(String[] args) throws IOException
    {
        String[] string = excelData();

        for(String s : string)
        {
            System.out.println(s);
        }
    }

}
