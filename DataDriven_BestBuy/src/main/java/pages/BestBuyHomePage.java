package pages;

import base.CommonAPI;
import datasource.FetchTheSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;

public class BestBuyHomePage extends CommonAPI
{

    public String[] excelData() throws IOException
    {
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FetchTheSteps fetchTheSteps = new FetchTheSteps();
        String [] string = fetchTheSteps.getDataFromExcelFileForFeaturesChoice();
        return string;
    }
}
