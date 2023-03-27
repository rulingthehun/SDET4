package Gun10;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_IntroAlert extends BaseDriverFirefox {
    /*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        clickMe1.click();

        MyFunc.Wait(2);

        driver.switchTo().alert().accept(); // Alert kutucuğuna geçildi

        driverStop();

    }
}
