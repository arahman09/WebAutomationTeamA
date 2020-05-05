package datasource;

import base.CommonAPI;
import datasources.ConnectToExcelFile;
import reporting.TestLogger;

import java.io.IOException;

public class FetchTheSteps {
    ConnectToExcelFile excelFile = new ConnectToExcelFile();
    public String[] getDataFromExcelFile() throws IOException {
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir")+"/Users/mohidulislam/Develop/HybridFramework/DataDriven_BestBuy/data/BestBuy_products.xlsx";
        String [] data = excelFile.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir")+"/Users/mohidulislam/Develop/HybridFramework/DataDriven_BestBuy/data/BestBuy_products.xlsx";
        String [] data = excelFile.fileReader2(path,0);
        return data;
    }
}
