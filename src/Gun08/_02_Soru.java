package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utility.BaseDriver.driver;
import static Utility.BaseDriver.driverStop;

public class _02_Soru extends BaseDriver {
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
        driver.manage().deleteAllCookies(); //Sayfa açıldıktan sonra cookies silindi

        MyFunc.Bekle(1);
        WebElement registrationFormButton = driver.findElement(By.xpath("a[id^='u_0_0_']"));
        registrationFormButton.click();

        MyFunc.Bekle(2);
        WebElement firsName = driver.findElement(By.xpath("input[id^='u_'][name='firstname']"));
        firsName.sendKeys("Burak");

        WebElement lastName = driver.findElement(By.xpath("input[id^='u_'][name='lastname']"));
        lastName.sendKeys("Gaznepoğlu");

        WebElement regEmail = driver.findElement(By.xpath("input[id^='u_'][name='reg_email__']"));
        regEmail.sendKeys("burakgaznepoglu_1999@hotmail.com");

        Select birthdayDay = new Select(driver.findElement(By.id("day")));
        birthdayDay.selectByVisibleText("9");

        Select birthdayMonth = new Select(driver.findElement(By.id("month")));
        birthdayMonth.selectByVisibleText("Oca");

        Select birthdayYear = new Select(driver.findElement(By.id("year")));
        birthdayYear.selectByVisibleText("1999");

        driverStop();

    }
}
