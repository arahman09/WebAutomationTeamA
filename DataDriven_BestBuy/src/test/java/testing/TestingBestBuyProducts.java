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

}
