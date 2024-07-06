package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

//    public String baseURl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public String username="ABC123";
    public String password="abc1234";
    public static WebDriver driver;

    @BeforeClass
    @Parameters({"browserName","url"})
    public void initBrowser(String browserName, String url) throws InterruptedException {

        if(browserName.equalsIgnoreCase("chrome"))
        {

            driver = WebDriverManager.firefoxdriver().create();
        }
        else if (browserName.equalsIgnoreCase("safari"))
        {
            driver=WebDriverManager.safaridriver().create();
        }
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);


//        System.setProperty("webdriver.gecko.driver","/Users/piramala/Desktop/Drivers/geckodriver");
//        driver = new FirefoxDriver();
   }

    @AfterClass
    public void quitBrowser()
    {
        driver.quit();
    }
}
