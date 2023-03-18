package Gun09;

import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElementStatus extends BaseDriverSafari {
    @Test
    public void Test() {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());

        MyFunc.Bekle(0.5);
        tuesday.click();

        MyFunc.Bekle(2);
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());

        driverStop();

    }
}
