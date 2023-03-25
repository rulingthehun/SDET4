package Gun11;

import Utility.BaseDriverEdge;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_waitAlertIsPresent extends BaseDriverEdge {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
    @Test
    public void Test(){
        driver.get("https://www.demoblaze.com/index.html");

        WebElement galaxyS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        galaxyS6.click();

        WebElement addToCart = driver.findElement(By.linkText("Add to cart"));
        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement productStore = driver.findElement(By.linkText("PRODUCT STORE"));
        productStore.click();

        driverStop();
    }
}
