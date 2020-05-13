package datasource;

import datasources.ConnectToExcelFile;
import datasources.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class FetchExternalData
{

    public static String[] getDataFromExcelFile(String givenPath)throws IOException
    {
        String [] dataSource = {};
        ConnectToExcelFile connectToExcelFile = new ConnectToExcelFile();
        String path = System.getProperty("user.dir")+ givenPath;
        dataSource = connectToExcelFile.fileReader2(path,0);
        return dataSource;
    }

    public static List<String> getDataFromDatabase()throws Exception
    {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("staples_data","products");

        return list;
    }


}
