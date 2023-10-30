package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils {

    public static WebElement createElement (WebDriver driver, String element){

        return driver.findElement(By.xpath(element));
    }
}
