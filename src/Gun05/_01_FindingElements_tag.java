package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver{
    public static void main(String[] args) {


        driver.get("https://www.techno.study/");

        List<WebElement> links = driver.findElements(By.tagName("a")); // tag ine göre bulma
        //bu bana safyadaki tüm linkleri verir.

        for (WebElement e: links) {
            if (e.getText().equals("")) { //kırık link yani ekranda gözüken kısmı yok
                System.out.println("getAttribute = " + e.getAttribute("href"));
                System.out.println("getAttribute(\"title\") = " + e.getAttribute("title"));
                System.out.println("getAttribute(\"rel\") = " + e.getAttribute("rel"));
            }
        }

        driverStop();
    }
}
