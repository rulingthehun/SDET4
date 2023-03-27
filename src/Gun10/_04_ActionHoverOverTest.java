package Gun10;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _04_ActionHoverOverTest extends BaseDriverFirefox {
    @Test
    public void Test(){
        driver.get("https://www.etsy.com/");
        Actions actions = new Actions(driver);

        // 1- isDisplay ve isEnable gibi kontroller, element HTML nini içinde var fakat görünür devil.
        // durumunda kullanılır.
        // 2- BAZI durumlarda element HTML nini içinde hiç yoktur.
        List<WebElement> acceptButton = driver.findElements(By.cssSelector("button[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        //Elementi bulamazsa implicitly wait devreye girer ve verilen süre kadar bulmaya çalışır
        if (acceptButton.size() > 0)
            acceptButton.get(0).click();

        WebElement jewelryAccessories = driver.findElement(By.cssSelector("li[data-node-id='10855']"));
        WebElement necklaces = driver.findElement(By.cssSelector("li[data-node-id='10873'][data-ui='side-nav-category-link']"));
        WebElement bibNecklaces = driver.findElement(By.id("catnav-l3-10881"));

        actions.moveToElement(jewelryAccessories).build().perform();
        MyFunc.Wait(2.5);

        actions.moveToElement(necklaces).build().perform();
        MyFunc.Wait(1);

        actions.moveToElement(bibNecklaces).click().build().perform();
        MyFunc.Wait(2);
        String url = driver.getCurrentUrl();
        Assert.assertTrue("Wrong site", url.contains("bib-necklaces"));

        MyFunc.Wait(3);
        driverStop();

    }
}
