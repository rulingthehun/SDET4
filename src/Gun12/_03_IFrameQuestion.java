package Gun12;

import Utility.BaseDriverEdge;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameQuestion extends BaseDriverEdge {
    /*
   1- https://chercher.tech/practice/frames sitesine gidiniz
   2- Inputa ülke adı yazınız
   3- CheckBox ı çekleyiniz.
   4- Select in 4. elemanını seçiniz.
 */
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("body>#topic~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent().switchTo().frame(1);
        Select animals = new Select(driver.findElement(By.id("animals")));
        animals.selectByIndex(3); // Son eleman: animals.getOptions().size()-1

        driverStop();

    }
}
