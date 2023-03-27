package Gun14;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_ScreenRecord extends BaseDriverEdge{
    @Test
    public void Test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123");
        MyFunc.Wait(1.5);
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();

        List<WebElement> alertMessage = driver.findElements(By.cssSelector("div[role='alert']"));
        if (alertMessage.size() > 0)
            System.out.println("Login fail, alert message shown");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File inMemory = ts.getScreenshotAs(OutputType.FILE); //2. adım ekran görüntü alındı hafızada bekliyor
        FileUtils.copyFile(inMemory, new File("screenShots\\screenshot.png"));
        //FileUtils need commons.io library
        // https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0

        MyFunc.Wait(2);
        driverStop();
    }
}
