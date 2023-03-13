package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectClass extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        Select dropDown = new Select(webMenu); //select menu, DropDown menu

        dropDown.selectByIndex(1);
        MyFunc.Bekle(1);

        WebElement srcButton = driver.findElement(By.id("nav-search-submit-button"));
        srcButton.click();

        WebElement element = driver.findElement(By.xpath("//h2[text()='Top picks for you']"));

        driverStop();

    }
}
