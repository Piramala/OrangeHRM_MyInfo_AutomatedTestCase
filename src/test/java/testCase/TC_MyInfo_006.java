package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_MyInfo_006 extends BaseClass{
    @Test(priority = 4)
    public void editPersonalDetails() throws InterruptedException {
        TC_MyInfo_005 TC5 = new TC_MyInfo_005();
        TC5.viewPersonalDetail();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Piramala");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='middleName']")).clear();
        Thread.sleep(6000);

        // Locate the Nationality textbox and click it
        WebElement nationalityTextbox = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]"));
        Thread.sleep(5000);
        nationalityTextbox.click();
        // Locate the value in the dropdown and click it
        WebElement dropdownValue = driver.findElement(By.xpath ("//*[contains(text(),'American')]"));
        Thread.sleep(5000);
        dropdownValue.click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")).click();
        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,150)", "");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
        Thread.sleep(5000);

        System.out.println("ESS User Edited the field ");


    }
}
