package Gun12;

import Utility.BaseDriverEdge;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriverEdge {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // "frame1" id, name, webElement geçişi yavaş

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("switchTo");
        // Şu anda frame1 ile gösterilen sayfadayız.
        driverStop();

        //driver.switchTo().frame(0); // iFrame içindeki frame geçişi
        //driver.switchTo().parentFrame() // Bir önceki sayfaya geri dönüş
        //driver.switchTo().defaultContent(); // İlk sayfaya direkt dönüş
    }
}
