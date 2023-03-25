package Gun12;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _06_Question extends BaseDriverEdge {
    /*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */
    @Test
    public void Test(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        new Actions(driver).scrollByAmount(0, 1000).build().perform();
        int randomNumber1 = (int) (Math.random() * 100);
        int randomNumber2 = (int)(Math.random() * 100);
        driver.findElement(By.id("number1Field")).sendKeys(Integer.toString(randomNumber1));
        driver.findElement(By.id("number2Field")).sendKeys(Integer.toString(randomNumber2));
        Select selectOperation = new Select(driver.findElement(By.id("selectOperationDropdown")));
        List<WebElement> option = driver.findElements(By.cssSelector("select[id='selectOperationDropdown']>option"));
        int num = 0;
        for (WebElement e : option) {
            selectOperation.selectByIndex(num);
            WebElement calculateButton = driver.findElement(By.id("calculateButton"));
            calculateButton.click();
            MyFunc.Bekle(2);
            num++;
        }
        MyFunc.Bekle(3);
        driverStop();

    }
}
