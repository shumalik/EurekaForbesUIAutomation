import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;

import java.util.concurrent.TimeUnit;

    public class EurekaForbesUI {
        public static void main(String[] args) throws InterruptedException {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.eurekaforbes.com/");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            WebElement element = CommonUtils.createElement(driver,Constants.serviceLink);
            element.click();

            WebElement bookService = CommonUtils.createElement(driver,Constants.bookService);
            bookService.click();

            WebElement mobNoTextBox = CommonUtils.createElement(driver,Constants.mobileTextBox);
            mobNoTextBox.sendKeys("9873603803");

            WebElement sbmtBtn = CommonUtils.createElement(driver,Constants.submitBtn);
            sbmtBtn.click();

            WebElement otpTextBox = CommonUtils.createElement(driver,Constants.otpTextBox);
            otpTextBox.sendKeys("123456");

            WebElement verifyBtn = CommonUtils.createElement(driver,Constants.verifyButton);
            verifyBtn.click();

            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.bookServiceButton)));
            WebElement bookServiceBtn = CommonUtils.createElement(driver,Constants.bookServiceButton);
            bookServiceBtn.click();

            WebElement unInstallLink = CommonUtils.createElement(driver,Constants.uninstallLink);
            unInstallLink.click();

            WebElement nextBtn = CommonUtils.createElement(driver,Constants.nextButton);
            nextBtn.click();

            WebElement serviceDate = CommonUtils.createElement(driver,Constants.serviceDate);
            serviceDate.click();

            WebElement serviceTime = CommonUtils.createElement(driver,Constants.serviceTime);
            serviceTime.click();

            WebElement nextBtn1 = CommonUtils.createElement(driver,Constants.nextButton1);
            nextBtn1.click();



            // Close the browser
            driver.quit();
        }
    }





