package Gun13;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_ScrollIntro extends BaseDriverEdge {
    /*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    window.scrollBy(0, 3000);
    window.scrollTo(0, document.body.scrollHeight);
    "arguments[0].scrollIntoView(true);", element
    "arguments[0].click();", element
 */
    @Test
    public void Test(){
        driver.get("https://triplebyte.com/");

        MyFunc.Bekle(1.5);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 3000);");

        MyFunc.Bekle(1.2);
        js.executeScript("window.scrollTo(0, -3000);");

        // scrollTo : Verilen pixele gider. (verilen noktaya gider)
        // scrollBy : Verilen kadar daha ileri gider. (append)
        MyFunc.Bekle(5);
        driverStop();

    }
}
