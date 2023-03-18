package Gun09;

import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriverSafari {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click(); normal click

        Actions action = new Actions(driver);
        System.out.println("action öncesi tüm action ların çalışacağı Aksiyonlar sınıfı oluştu.");

        //Action action1 = action.moveToElement(element).click().build();
        // Elementin üzerine gidildi click aksiyonu hazırda bekliyor, henüz click olmadı.

        System.out.println("Action prepered");

        MyFunc.Bekle(2);
        //action1.perform();
        System.out.println("Action done");

        action.moveToElement(element).click().build().perform(); //Kısa hali

        driverStop();

    }
}
