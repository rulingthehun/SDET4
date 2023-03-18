package Gun06;

import Utility.BaseDriverSafari;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriverSafari {
    @Test
    public void Test1(){
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String message = "merhaba tester dünyası biz geliyoruz";
        WebElement enterMessage = driver.findElement
                (By.cssSelector("[type='text'][placeholder='Please enter your Message']"));
        enterMessage.sendKeys(message);

        WebElement showMessageButton = driver.findElement(By.cssSelector("[type='button'][onclick='showInput();']"));
        showMessageButton.click();

        WebElement yourMessage = driver.findElement(By.cssSelector("span[id='display']"));

        /*
        if (yourMessage.getText().contains("merhaba tester dünyası biz geliyoruz"))
            System.out.println("test passed");
        else
            System.out.println("test failed");
         */

        Assert.assertTrue(message + "Mesaj bulunamadı", yourMessage.getText().contains(message));
        // assertTrue: içindeki değer True mu? True ise hiç bir şey yapmaz.
        // değilse beklenen olmamışsa hata mesajı verir.
        // Genel kural: Hata var ise göster

        driverStop();
    }
}
