package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;

    static{
        //ilk adımda çalışan kod kısmı
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize(); //Tam ekran
        driver.manage().deleteAllCookies(); //Sitenin bilgisayarda yağtığı ayarları siler

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); //Sadece tüm sayfanın kodlarının
        // bilgisayara inme süresi ile ilgili
        //Bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler. : 30 sn süresincesayfanın
        // yüklenmesini bekle, yüklenmezse hata ver.
        // Eğer 2 sn yüklenirse 30 sn beklemez.

        driver.manage().timeouts().implicitlyWait(dr); //Bütün web elementlerin element bazında
        // elemente özel işlem yapılmadan önce hazır hale gelmesi için verilen mühlet (süre).
    }

    public static void driverStop(){
        MyFunc.Bekle(10);
        driver.quit();
    }
}
