package testing;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestingHomepage extends CommonAPI
{
    @Test
    public void news()
    {
        System.out.println(driver.getTitle());
    }
}
