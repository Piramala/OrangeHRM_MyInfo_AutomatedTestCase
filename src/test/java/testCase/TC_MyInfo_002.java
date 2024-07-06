package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_MyInfo_002 extends BaseClass{
    @Test(priority = 2)
    public void loginInvalidPassword() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
            Thread.sleep(4000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }
        catch (Exception e)
        {
            System.out.println("An error occurred:"+ e);
//            System.err.println("An error occurred:+ e");
        }

    }
}
