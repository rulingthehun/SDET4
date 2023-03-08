package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _02_Navigating extends BaseDriver{
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); //web sayfası açma komutu
        MyFunc.Bekle(3);
        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        MyFunc.Bekle(3);
        driver.navigate().back(); //Tarayıcı history sinden geri gelir.

        MyFunc.Bekle(3);
        driver.navigate().forward(); //Tarayıcı history sinden geri gelir.

        driverStop();
    }
}
