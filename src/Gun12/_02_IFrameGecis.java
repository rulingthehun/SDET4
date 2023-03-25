package Gun12;

import Utility.BaseDriverEdge;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFrameGecis extends BaseDriverEdge {
    /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame().switchTo().frame(1);
        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByVisibleText("Avatar");

        driverStop();

    }
}
