package Gun11;

import Utility.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class _01_WaitGiriş extends BaseDriverChrome {
    /*
    Selenium Bekletme Konusu
    Thread.Sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

    Implicitly Wait :
    Tüm sayfadaki elemanlar için bir bekleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
    Bütüm elemanlar için geçerli.NoSuchElement hatası nı vermek için verilen süre kadar,  eleman bulunana kadar bekler.

      driver.manage().timeouts().implicitlyWait(dr);


    pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
 */
    @Test
    public void Test(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement onClick = driver.findElement(By.cssSelector("button[onclick]"));
        //WebElement onClick = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));

        onClick.click();

        WebElement demo = driver.findElement(By.xpath("//p[text()='WebDriver']"));
        System.out.println(demo.getText());

        driverStop();

    }
}
