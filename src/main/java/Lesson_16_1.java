import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


public class Lesson_16_1 {

    WebDriver driver;
    String summAutQA;
    String summQA;

    @BeforeTest
    public void launchBrowser() {
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "D:\\34\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        driver.get("https://dou.ua/");


    }

    //    @Test (priority=0)
//    public void Click_Search() {
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div[2]/form/span/input")).sendKeys("QA");
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div[2]/form/input")).click();
//
//
//    }
    @Test(priority = 1)
    public void CalculateVaca1() {
        driver.findElement(By.xpath("/html/body/div[1]/header/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div[2]/form/span/input")).sendKeys("QA");

//        driver.findElement(By.id("txtGlobalSearch")).click();
        WebElement buttonAdd = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/form/input")));
        buttonAdd.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1")).getText());
        summQA = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1")).getText();
    }

    @Test(priority = 2)
    public void CalculateVaca2() {
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div[2]/form/span/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div[2]/form/span/input")).sendKeys("Automation QA");
        WebElement buttonAdd = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/form/input")));
        buttonAdd.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1")).getText());
        summAutQA = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1")).getText();
    }

    @Test(priority = 3)
    public void CalculateAnalyst() {
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Analyst");
        WebElement buttonAdd = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/form/input")));
        buttonAdd.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1")).getText());


    }

    @Test(priority = 4)

    public void CalculateAndroid() {
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Android");
        WebElement buttonAdd = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/form/input")));
        buttonAdd.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1")).getText());
    }

    @Test(priority = 5)

    public void CalculateDBA() {
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("DBA");
        WebElement buttonAdd = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/form/input")));
        buttonAdd.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/h1")).getText());
    }

    @DataProvider
    public Object[][] MoreQa1() {
        {
        }
        return new Object[0][];
    }

    @AfterTest
    public void terminateBrowser() {
      driver.close();

    }
}
