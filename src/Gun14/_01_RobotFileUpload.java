package Gun14;

import Utility.BaseDriverFirefox;
import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class _01_RobotFileUpload extends BaseDriverSafari {
    @Test
    public void Test() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        Robot rbt = new Robot();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        MyFunc.Wait(3);

        WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
        fileUpload.sendKeys("C:Users/");

        WebElement uploadMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMessage.getText().contains("has been successfully uploaded."));

        MyFunc.Wait(2);
        //driver.close();
        driverStop();
    }
}
