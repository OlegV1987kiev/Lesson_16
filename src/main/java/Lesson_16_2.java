import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


public class Lesson_16_2 {

    WebDriver driver;
    String summAutQA;
    String summQA;

    @BeforeTest
    public void launchBrowser() {
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:\\34\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        driver.get("https://dou.ua/");


    }


    @Test(priority = 1)
    public void Registration() {
        driver.findElement(By.id("login-link")).click();
        driver.findElement(By.id("_loginByMail")).click();
    }

    @Test(priority = 2)
    public void LoginParameters() {
        driver.findElement(By.name("username")).sendKeys("case2@i.ua");
        driver.findElement(By.name("password")).sendKeys("case2@i.ua");
    }

    @Test(priority = 3)
    public void WrongPassword() {

        System.out.println(driver.findElement(By.id("wrong-password-message")).getText());
    }

    @Test(priority = 4)
    public void RegistrationByEmail() {

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/ul/li[2]")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div/div")).getText());
    }

    @AfterTest
    public void terminateBrowser() {
          driver.close();

    }
}
