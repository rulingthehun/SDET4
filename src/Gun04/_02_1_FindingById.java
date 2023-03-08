package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _02_1_FindingById {
    public static void main(String[] args) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("https://form.jotform.com/221934510376353"); //web sayfasini ac

        WebElement name = driver.findElement(By.id("first_8"));
        name.sendKeys("burak");

        WebElement surName = driver.findElement(By.id("last_8"));
        surName.sendKeys("gaznepoglu");

        WebElement label1 = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("label1.getText() = " + label1.getText());


        WebElement label2 = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("label2.getText() = " + label2.getText());

        MyFunc.Bekle(10);
        driver.quit();
    }
}
