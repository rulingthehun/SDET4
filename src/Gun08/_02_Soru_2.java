package Gun08;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru_2 extends BaseDriverFirefox {
    //       Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//        öncesinde de görünmediğini assert ile doğrulayınız.
    //getAttribute ile email kontrol
    @Test
    public void Test(){

        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com.tr/");
        driver.manage().deleteAllCookies();

        MyFunc.Bekle(2);
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("CertificateWarningController.visitInsecureWebsiteWithTemporaryBypass()");

        driver.manage().deleteAllCookies(); //Sayfa açıldıktan sonra cookies silindi
        WebElement acceptButton = driver.findElement(By.cssSelector("button[data-cookiebanner='accept_button']"));
        acceptButton.click();
        MyFunc.Bekle(1);
        WebElement registrationFormButton = driver.findElement(By.linkText("Create new account"));
        registrationFormButton.click();

        MyFunc.Bekle(2);
        //WebElement firsName = driver.findElement(By.xpath("input[id^='u_'][name='firstname']"));
        WebElement firsName = driver.findElement(By.name("firstname"));
        firsName.sendKeys("Burak");

        //WebElement lastName = driver.findElement(By.xpath("input[id^='u_'][name='lastname']"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Gaznepoğlu");

        WebElement hiddenElement = driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertTrue("Email girmeden önce gizli durumu ", hiddenElement.getAttribute("class").equals("hidden_elem"));


        WebElement regEmail = driver.findElement(By.name("reg_email__"));
        regEmail.sendKeys("burakgaznepoglu_1999@hotmail.com");

        hiddenElement = driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertFalse("Email girdikten sonra gizli durumu ", hiddenElement.getAttribute("class").equals("hidden_elem"));

        Select birthdayDay = new Select(driver.findElement(By.id("day")));
        birthdayDay.selectByVisibleText("9");

        Select birthdayMonth = new Select(driver.findElement(By.id("month")));
        birthdayMonth.selectByValue("1");

        Select birthdayYear = new Select(driver.findElement(By.id("year")));
        birthdayYear.selectByValue("1999");

        MyFunc.Bekle(4);
        driverStop();
    }
}
