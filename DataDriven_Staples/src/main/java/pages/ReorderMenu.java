package pages;

import base.CommonAPI;
import datasource.FetchExternalData;
import org.openqa.selenium.By;

import java.io.IOException;

public class ReorderMenu extends CommonAPI
{
    public String[] excelData() throws IOException
    {
        String[] str = FetchExternalData.getDataFromExcelFile("/data/staples_hovar_menu_data.xls");
        return str;
    }

    public void testFrequentlyPurchasedOption() throws IOException
    {
        String[] data = excelData();

        try
        {
            driver.findElement(By.linkText(data[0])).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void testMyListsOption() throws IOException
    {
        String[] data = excelData();

        try
        {
            driver.findElement(By.linkText(data[1])).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void testOrderByNumberOption() throws IOException
    {
        String[] data = excelData();

        try
        {
            driver.findElement(By.linkText(data[2])).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void testMyOrdersOption() throws IOException
    {
        String[] data = excelData();

        try
        {
            driver.findElement(By.linkText(data[3])).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void testMyScheduledAutoRestockOption() throws IOException
    {
        String[] data = excelData();

        try
        {
            driver.findElement(By.linkText(data[4])).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void testMySmartOrdersOption() throws IOException
    {
        String[] data = excelData();

        try
        {
            driver.findElement(By.linkText(data[5])).click();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
