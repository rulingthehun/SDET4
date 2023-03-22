package Gun09;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropTest extends BaseDriverFirefox {
    @Test
    public void Test() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);

        //1. Yöntem
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));
        actions.dragAndDrop(oslo, norway).build().perform();

        //2. Yöntem
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        actions.clickAndHold(seoul).build().perform(); //Sürüklenecek element ele alındı
        actions.moveToElement(southKorea).release().build().perform();

        MyFunc.Bekle(2);
        driverStop();

    }
}