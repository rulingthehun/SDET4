package Gun10;

import Utility.BaseDriverChrome;
import Utility.BaseDriverFirefox;
import Utility.BaseDriverSafari;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionKeyControlSendKeys extends BaseDriverFirefox {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");
        Actions actions = new Actions(driver);

        WebElement singleContainer = driver.findElement(By.id("autoCompleteSingleContainer"));
        actions.moveToElement(singleContainer).click().keyDown(Keys.SHIFT).sendKeys("b").
                keyUp(Keys.SHIFT).sendKeys("urak").build().perform();

        driverStop();

    }
}
