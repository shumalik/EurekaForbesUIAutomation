import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EurekaForbesUIMobileView {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        int width = 768;
        int height = 1024;
        Dimension dimension = new Dimension(width, height);
        driver.manage().window().setSize(dimension);
        driver.get("https://www.eurekaforbes.com/");

        WebElement element = driver.findElement(By.xpath(Constants.serviceLink));
        element.click();

        WebElement bookService = driver.findElement(By.xpath(Constants.bookService));
        bookService.click();

        WebElement mobNoTextBox = driver.findElement(By.xpath(Constants.mobileTextBox));
        mobNoTextBox.sendKeys("9873603803");

        WebElement sbmtBtn = driver.findElement(By.xpath(Constants.submitBtn));
        sbmtBtn.click();

        WebElement otpTextBox = driver.findElement(By.xpath(Constants.otpTextBox));
        otpTextBox.sendKeys("123456");

        WebElement verifyBtn = driver.findElement(By.xpath(Constants.verifyButton));
        verifyBtn.click();

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.bookServiceButton)));
        WebElement bookServiceBtn = driver.findElement(By.xpath(Constants.bookServiceButton));
        bookServiceBtn.click();

        WebElement unInstallLink = driver.findElement(By.xpath(Constants.uninstallLink));
        unInstallLink.click();

        WebElement nextBtn = driver.findElement(By.xpath(Constants.nextButton));
        nextBtn.click();

        WebElement serviceDate = driver.findElement(By.xpath(Constants.serviceDate));
        serviceDate.click();

        WebElement serviceTime = driver.findElement(By.xpath(Constants.serviceTime));
        serviceTime.click();

        WebElement nextBtn1 = driver.findElement(By.xpath(Constants.nextButton1));
        nextBtn1.click();

                // Close the browser
                        driver.quit();
    }
}





