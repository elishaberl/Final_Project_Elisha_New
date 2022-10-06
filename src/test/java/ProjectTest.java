import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class ProjectTest {

    @Test
    void testOne() throws IOException, InterruptedException {
        WebDriver driver = Helper.setupDriver();

        driver.get(Helper.EGGEDURL);
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File path = new File(Helper.FOLDER + "myPicture" + Helper.PICTURE);
        FileUtils.copyFile(screenshot,path);
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    void testTwo() throws InterruptedException {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.MI_ANACHNU);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(Helper.MI_ANACHNU)));

        Thread.sleep(2000);
        driver.quit();

    }

    @Test
    void testThree() throws InterruptedException {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.EGGEDURL);
        String theWindow = driver.getWindowHandle();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        String otherWindow = driver.getWindowHandle();
        driver.get(Helper.KSHARIMPLUS);
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        String secondTab = driver.getWindowHandle();
        driver.get(Helper.BANKJERUSALEM);
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public static void testFour() throws InterruptedException {

        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.EGGEDURL);

        Thread.sleep(10000);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.ENGLISH1))).click();

        Thread.sleep(12000);


        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.SEARCH_BY_LINE))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Helper.ORIGINALCITYID))).sendKeys("yotvata");

        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public static void testFive() throws InterruptedException {

        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.PTURL);
        Select dropdown = new Select(driver.findElement(By.xpath(Helper.LANGUAGEDROPDOWNXPATH)));
        dropdown.selectByValue(Helper.ENGLISHVALUE);
        Thread.sleep(2000);
        driver.quit();



    }

    @Test
    public static void testSix() throws InterruptedException {
    WebDriver driver = Helper.setupDriver();
    driver.get(Helper.YOMKIPUR);
    JavascriptExecutor Shem =(JavascriptExecutor)driver;
    WebElement avodah = driver.findElement(By.id(Helper.AVODAHID));
    Shem.executeScript("arguments[0].scrollIntoView();", avodah);
    Thread.sleep(2000);
    driver.quit();

    }

    @Test
    public static void testSeven() throws InterruptedException {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.ROTTERSCOOPS);
        Thread.sleep(4000);
        driver.navigate().to(Helper.PTURL);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();



    }

}
