package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.List;

public class _04_FindingByClassName {
    public static void main(String[] args) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement submitButton = driver.findElement(By.className("form-submit-button"));
        System.out.println("submitButton.getText() = " + submitButton.getText());
//        submitButton.click();

//        Inspect types
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar
        // .first_name yazarsak bütün CLASS paramatrelerinde arar

//        Birden fazla ayni locator a sahip eleman bulursa findElement ne yapar?
//        Cevap: Ilk elementi bulur

        WebElement element = driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());

//        Bu locator a ait elemanlarin hepsini nasil alirim?
        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println("labels.size() = " + labels.size());
        for (WebElement e : labels)
            System.out.println("Labels = " + e.getText());

//        Aranilan eleman bulunamazsa: findElement NoSuchElement hatasi verir
//        findElements ise size'i 0 olan List verir, yani hata vermez.

        MyFunc.Bekle(10);
        driver.quit();
    }
}
