package Gun12;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriverEdge {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement element : links)
            if (!(element.getAttribute("href").contains("mailto")))
                element.click();

        //driver.getWindowHandle() -> aktif olan tabın ID sini verir
        //driver.getWindowHandles() -> açık olan tüm sayfaların ID sini verir
        Set<String> windowIDs = driver.getWindowHandles();
        for (String id : windowIDs)
            System.out.println("id = " + id);

        MyFunc.Wait(6);
        driverStop();

    }
}
