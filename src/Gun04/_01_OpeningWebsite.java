package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.safari.SafariDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new SafariDriver(); // web sayfasini kontrol eden gorevli
        driver.manage().window().maximize();

        driver.get("https://www.techno.study/"); //web sayfasini ac

        MyFunc.Bekle(3);
        driver.quit();
        int sayi = 5;

    }
}
