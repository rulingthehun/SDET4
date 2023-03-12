package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.awt.*;

public class _02_Navigating extends BaseDriver{
    public static void main(String[] args) throws AWTException {
        String window = driver.getWindowHandle();

        Robot rbt = new Robot();

        driver.switchTo().window(window);

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); //web sayfası açma komutu
        MyFunc.Bekle(3);
        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); //o anda bulunduğum URL

        MyFunc.Bekle(3);
        driver.navigate().back(); //Tarayıcı history sinden geri gelir.

        System.out.println(driver.getCurrentUrl());

        MyFunc.Bekle(3);
        driver.navigate().forward(); //Tarayıcı history sinden geri gelir.

        System.out.println(driver.getCurrentUrl());

        driverStop();
    }
}
