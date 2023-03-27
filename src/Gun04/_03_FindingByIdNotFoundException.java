package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.safari.SafariDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new SafariDriver();
        driver.get("https://form.jotform.com/221934510376353"); //web sayfasini ac

        try {
            WebElement element = driver.findElement(By.id("sublabel_8_firs"));
            System.out.println("element.getText() = " + element.getText());
        }
        catch (Exception ex){
            System.out.println("Eleman bulunamadi = " + ex.getMessage());
        }


        MyFunc.Wait(10);
        driver.quit();
    }
}
