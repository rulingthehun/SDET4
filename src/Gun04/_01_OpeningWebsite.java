package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver(); // web sayfasini kontrol eden gorevli
        driver.manage().window().maximize();

        driver.get("https://www.techno.study/"); //web sayfasini ac

        MyFunc.Wait(3);
        driver.quit();
        int sayi = 5;
        System.out.println("sayi = " + sayi%3);
    }
}
