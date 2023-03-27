package Gun10;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AllertPart2 extends BaseDriverFirefox {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe2.click();

        MyFunc.Wait(2);

        driver.switchTo().alert().dismiss();

        MyFunc.Wait(2);

        driverStop();
    }
}
