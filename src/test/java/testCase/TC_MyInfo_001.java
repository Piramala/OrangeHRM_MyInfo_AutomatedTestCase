package testCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_MyInfo_001 extends BaseClass {
    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);


        if (driver.getTitle().equals("OrangeHRM")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }


    }
}
