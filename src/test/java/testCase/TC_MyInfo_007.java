package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_MyInfo_007 extends BaseClass{
    @Test(priority = 5)
    public void editRestrictedFields() throws InterruptedException {
        TC_MyInfo_005 TC5 = new TC_MyInfo_005();
        TC5.viewPersonalDetail();
        try {
            driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")).clear();
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.err.println("An error occurred:" + e.getMessage());
        }
        try {
            driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("1234");
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.err.println("An error occurred:" + e.getMessage());
        }
        finally {
            System.out.println("ESS User cannot Restricted the field");

        }
    }

}
