package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_SelectClass extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        Select dropDown = new Select(webMenu); //select menu, DropDown menu

        //dropDown.selectByVisibleText("Kitaplar");
        //dropDown.selectByIndex(9);
        dropDown.selectByValue("search-alias=stripbooks");
        MyFunc.Bekle(1);

        WebElement srcButton = driver.findElement(By.id("nav-search-submit-button"));
        srcButton.click();

        MyFunc.Bekle(3);
        WebElement element = driver.findElement(By.xpath("//h1[text()='Kitap']"));

        Assert.assertTrue(element.getText().contains("Kitap"));

        System.out.println("Test passed");

        driverStop();

    }
}
