package Gun06;

import Utility.BaseDriverSafari;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert; // Javanın kendi test kontrol ve organize sınıfı

public class _01_CSSSelector extends BaseDriverSafari {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement enterMessage = driver.findElement
                (By.cssSelector("[type='text'][placeholder='Please enter your Message']"));
        enterMessage.sendKeys("merhaba tester dünyası biz geliyoruz");

        WebElement showMessageButton = driver.findElement(By.cssSelector("[type='button'][onclick='showInput();']"));
        showMessageButton.click();

        WebElement yourMessage = driver.findElement(By.cssSelector("span[id='display']"));

        /*
        if (yourMessage.getText().contains("merhaba tester dünyası biz geliyoruz"))
            System.out.println("test passed");
        else
            System.out.println("test failed");
         */

        Assert.assertTrue("Mesaj bulunamadı", yourMessage.getText().contains("merhaba tester...dünyası biz geliyoruz"));
        // assertTrue: içindeki değer True mu? True ise hiç bir şey yapmaz.
        // değilse beklenen olmamışsa hata mesajı verir.
        // Genel kural: Hata var ise göster

        driverStop();
    }
}
