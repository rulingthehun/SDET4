package Gun12;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WindowsSwitch extends BaseDriverEdge {
    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra ana sayfa ya dönününüz.
    ipucu : driver.switchTo().window(id) ile istenilen tab a geçiş yapılır
 */
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link : links)
            if (!(link.getAttribute("href").contains("mailto")))
                link.click();

        Set<String> windowIDs = driver.getWindowHandles();
        for (String id : windowIDs){
            driver.switchTo().window(id);
            System.out.println("ID = " + id + " - Title = " +
                    driver.getTitle() + " - URL: " + driver.getCurrentUrl());
            MyFunc.Bekle(1);
            if (!driver.getCurrentUrl().equals("https://www.selenium.dev/"))
                driver.close();
        }

        driverStop();

    }
}
// TODO: her bir sayfayı ayrı ayrı kapatın