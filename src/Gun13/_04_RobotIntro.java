package Gun13;

import Utility.BaseDriverEdge;
import Utility.BaseDriverFirefox;
import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _04_RobotIntro extends BaseDriverFirefox {
    @Test
    public void Test() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        Robot rbt = new Robot();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        MyFunc.Bekle(3);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(2);
        driverStop();
    }
}
