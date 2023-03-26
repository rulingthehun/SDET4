package Gun13;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_ScrollToWebElement extends BaseDriverEdge {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com.tr/");
        MyFunc.Bekle(1.1);
        driver.manage().deleteAllCookies();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll u bir elemente kadar nasıl kaydırırım?

        WebElement button = driver.findElement(By.linkText("İletişim"));

        js.executeScript("arguments[0].scrollIntoView(true);", button);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("İletişim")));
        MyFunc.Bekle(1.6);
        js.executeScript("arguments[0].click();", button);

        MyFunc.Bekle(1.4);
        driverStop();
    }
}
