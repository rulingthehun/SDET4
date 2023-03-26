package Gun13;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriverEdge {
    @Test
    public void Test(){
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Bekle(0.6);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // sayfa sonuna kadar kaydır.

        MyFunc.Bekle(1.35);
        js.executeScript("window.scrollTo(0, 0);");

        MyFunc.Bekle(1.6);
        driverStop();
    }
}
