package Gun11;

import Utility.BaseDriverEdge;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _03_FillingFormTask extends BaseDriverEdge {
    /*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.cssSelector("input[id='title']"));
        name.sendKeys("Burak");

        WebElement textArea = driver.findElement(By.cssSelector("textarea[id='description']"));
        textArea.sendKeys("this is a comment");

        WebElement button = driver.findElement(By.cssSelector("input[id='btn-submit']"));
        button.click();

        new Actions(driver).scrollByAmount(0, 200).build().perform();

        List<WebElement> formSubmitText = driver.findElements(By.id("submit-control"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Form submited Successfully!']")));
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));
        Assert.assertTrue("The element does not exist", formSubmitText.get(0).getText().contains("Successfully!"));
        
        driverStop();
        
    }
}
