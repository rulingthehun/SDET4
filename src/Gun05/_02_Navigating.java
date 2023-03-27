package Gun05;

import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class _02_Navigating extends BaseDriverSafari {
    public static void main(String[] args) throws AWTException {
        String window = driver.getWindowHandle();

        Robot rbt = new Robot();

        driver.switchTo().window(window);

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); //web sayfası açma komutu
        MyFunc.Wait(3);
        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); //o anda bulunduğum URL

        MyFunc.Wait(3);
        driver.navigate().back(); //Tarayıcı history sinden geri gelir.

        System.out.println(driver.getCurrentUrl());

        MyFunc.Wait(3);
        driver.navigate().forward(); //Tarayıcı history sinden geri gelir.

        System.out.println(driver.getCurrentUrl());

        driverStop();
    }
}
