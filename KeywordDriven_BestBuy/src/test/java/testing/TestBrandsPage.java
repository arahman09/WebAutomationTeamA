package testing;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BrandsPage;
import reporting.TestLogger;

public class TestBrandsPage extends CommonAPI {

    BrandsPage brandsPage = null;

    @Test (priority = 1)
    public void verifyBrandsPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class );
        brandsPage.clickBrandsTab();
    }
    @Test (priority = 2)
    public void verifyAppleTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class );
        brandsPage.clickBrandsTab();
        brandsPage.clickAppleTab();
    }
    @Test (priority = 3)
    public void verifySamsungTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class );
        brandsPage.clickBrandsTab();
        brandsPage.clickSamsungTab();
    }
    @Test (priority = 4)
    public void verifyMicrosoftTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object()
        {}.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class );
        brandsPage.clickBrandsTab();
        brandsPage.clickMicrosoftTab();
    }
    @Test (priority = 5)
    public void verifySonyTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickSonyTab();
    }
    @Test (priority = 6)
    public void verifyIntelTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickIntelTab();
    }
    @Test (priority = 7)
    public void verifyInsignaTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickInsigniaTab();
    }
    @Test (priority = 8)
    public void verifyLenovoTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickLenovoTab();
    }
    @Test (priority = 9)
    public void verifyLGTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickLGTab();
    }
    @Test (priority = 10)
    public void verifyNikonTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickNikonTab();
    }
    @Test (priority = 11)
    public void verifyBoseTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickBoseTab();
    }
    @Test (priority = 12)
    public void verifyCanonTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickCanonTab();
    }
    @Test (priority = 13)
    public void verifyEpsonTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickEpsonTab();
    }
    @Test (priority = 14)
    public void verifyGoProTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickGoProTab();
    }
    @Test (priority = 15)
    public void verifyHpTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickHpTab();
    }
    @Test (priority = 16)
    public void verifyAllBrandsTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickAllBrandsTab();
    }
    @Test (priority = 17)
    public void verifyMagnoliaAudioTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickMagnoliaAudioTab();
    }
    @Test (priority = 18)
    public void verifyPacificKitchenTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickPacificKitchenTab();
    }
    @Test (priority = 19)
    public void verifyCameraExperienceTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickCameraExperienceTab();
    }
    @Test (priority = 20)
    public void verifyClosetTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brandsPage = PageFactory.initElements(driver, BrandsPage.class);
        brandsPage.clickBrandsTab();
        brandsPage.clickCloseTab();
    }
}
