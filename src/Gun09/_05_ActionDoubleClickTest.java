package Gun09;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDoubleClickTest extends BaseDriverFirefox {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Wait(2);

        //Actions action = new Actions(driver);
        //action.moveToElement(element).doubleClick().build().perform();

        new Actions(driver).doubleClick(element).build().perform(); //kısa hali

        MyFunc.Wait(2);
        driverStop();

    }
}
