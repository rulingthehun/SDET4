package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_1_FindingById {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("https://form.jotform.com/221934510376353"); //web sayfasini ac

        WebElement name = driver.findElement(By.id("first_8"));
        name.sendKeys("burak");

        WebElement surName = driver.findElement(By.id("last_8"));
        surName.sendKeys("gaznepoglu");

        MyFunc.Bekle(10);
        driver.quit();
    }
}
