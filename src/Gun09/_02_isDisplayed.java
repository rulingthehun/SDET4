package Gun09;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_isDisplayed extends BaseDriverFirefox {
    //       Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.
    @Test
    public void Test(){

        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com.tr/");
        driver.manage().deleteAllCookies();

        MyFunc.Wait(2);
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("CertificateWarningController.visitInsecureWebsiteWithTemporaryBypass()");

        driver.manage().deleteAllCookies(); //Sayfa açıldıktan sonra cookies silindi
        WebElement acceptButton = driver.findElement(By.cssSelector("button[data-cookiebanner='accept_button']"));
        acceptButton.click();
        MyFunc.Wait(1);
        WebElement registrationFormButton = driver.findElement(By.linkText("Create new account"));
        registrationFormButton.click();

        MyFunc.Wait(2);
        WebElement firsName = driver.findElement(By.name("firstname"));
        firsName.sendKeys("Burak");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Gaznepoğlu");

        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed());

        WebElement regEmail = driver.findElement(By.name("reg_email__"));
        regEmail.sendKeys("burakgaznepoglu_1999@hotmail.com");

        reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertTrue(reEmail.isDisplayed());

        Select birthdayDay = new Select(driver.findElement(By.id("day")));
        birthdayDay.selectByVisibleText("9");

        Select birthdayMonth = new Select(driver.findElement(By.id("month")));
        birthdayMonth.selectByValue("1");

        Select birthdayYear = new Select(driver.findElement(By.id("year")));
        birthdayYear.selectByVisibleText("1999");

        MyFunc.Wait(4);
        driverStop();

    }
}
