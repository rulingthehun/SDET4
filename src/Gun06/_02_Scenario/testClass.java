package Gun06._02_Scenario;

import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class testClass extends BaseDriverSafari {
    @Test
    public void Test(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.Bekle(1);
        WebElement business = driver.findElement(By.cssSelector
                ("[type='radio'][value='Business']"));
        business.click();

        MyFunc.Bekle(1);
        WebElement dropDownDiscover = driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();

        MyFunc.Bekle(1);
        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        // Best practice
        //Select onlineAdvertising = new Select(driver.findElement(By.cssSelector("select[id$='_4588']")));
        //onlineAdvertising.selectByVisibleText("Online Advertising");

        MyFunc.Bekle(1);
        WebElement useXyzRadioButton = driver.findElement
                (By.cssSelector("[type='radio'][value='Every Day']"));
        useXyzRadioButton.click();

        MyFunc.Bekle(1);
        WebElement experienceRadioButton = driver.findElement
                (By.cssSelector("[type='radio'][value='Good']"));
        experienceRadioButton.click();

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 600).perform();

        MyFunc.Bekle(1);
        WebElement howLongDropDown = driver.findElement(By.cssSelector("select[id$='_4597']"));
        howLongDropDown.click();

        MyFunc.Bekle(1);
        WebElement option4 = driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        option4.click();

        experienceRadioButton.click();

        // Best practice
        //Select usingXyz = new Select(driver.findElement(By.cssSelector("select[id$='_4597']")));
        //singXyz.selectByIndex(3);

        driverStop();
    }
}
