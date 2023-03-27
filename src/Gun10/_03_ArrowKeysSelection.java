package Gun10;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_ArrowKeysSelection extends BaseDriverFirefox {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");
        Actions actions = new Actions(driver);

        WebElement singleContainer = driver.findElement(By.id("autoCompleteSingleContainer"));
        actions.moveToElement(singleContainer).click().sendKeys("b").build().perform();
        MyFunc.Wait(2);
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

        driverStop();

    }
}
