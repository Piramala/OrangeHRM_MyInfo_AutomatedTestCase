package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_MyInfo_005 extends BaseClass {

    @Test(priority = 3)
    public void viewPersonalDetail() throws InterruptedException {
        TC_MyInfo_001 TC1= new TC_MyInfo_001();
        TC1.loginTest();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
        Thread.sleep(4000);
        System.out.println("ESS user can viewed Personal Details ");

    }

}
