package Gun13;

import Utility.BaseDriverEdge;
import Utility.BaseDriverFirefox;
import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _04_RobotIntro extends BaseDriverFirefox {
    @Test
    public void Test() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        Robot rbt = new Robot();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        MyFunc.Wait(3);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Wait(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Wait(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        //StringSelection selection = new StringSelection(/*file path here*/);
                //In windows shift + right click -> Copy as path
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //clipboard.setContents(selection, selection);

        //ctrl+v
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement submitFile = driver.findElement(By.id("submitbutton"));
        submitFile.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement uploadMessage = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMessage.getText().contains("has been successfully uploaded."));

        MyFunc.Wait(2);
        //driver.close();
        driverStop();
    }
}
