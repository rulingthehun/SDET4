package Gun10;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_AllertPart3 extends BaseDriverFirefox {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        new Actions(driver).scrollByAmount(0, 700).build().perform();

        WebElement clickMe3 = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe3.click();
        driver.switchTo().alert().sendKeys("burak");
        MyFunc.Bekle(1);
        driver.switchTo().alert().accept();

        WebElement txtActual = driver.findElement(By.cssSelector("p[id='prompt-demo']"));
        Assert.assertTrue("Beklenen yazı gözükmedi", txtActual.getText().contains("burak"));

        MyFunc.Bekle(1);

        driverStop();
    }
}
