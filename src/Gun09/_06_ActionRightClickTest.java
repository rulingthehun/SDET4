package Gun09;

import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionRightClickTest extends BaseDriverSafari {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/buttons");
        WebElement element = driver.findElement(By.id("rightClickBtn"));
        new Actions(driver).contextClick(element).build().perform();
        driverStop();

    }
}