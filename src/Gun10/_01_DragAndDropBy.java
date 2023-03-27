package Gun10;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;

public class _01_DragAndDropBy extends BaseDriverFirefox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions actions = new Actions(driver);

        actions.scrollByAmount(0, 500).build().perform();
        WebElement leftSlider = driver.findElement(By.cssSelector("div[id='slider-range']>:nth-child(2)"));
        WebElement rightSlider = driver.findElement(By.cssSelector("div[id='slider-range']>:nth-child(3)"));
        WebElement sliderRange = driver.findElement(By.cssSelector("div[id='slider-range']>:nth-child(1)"));

        actions.dragAndDropBy(leftSlider, -101, 0).build().perform();
        actions.dragAndDropBy(rightSlider, 201, 0).build().perform();
        int sliderWith = sliderRange.getSize().width;
        int unitLength = sliderWith / 500;
        System.out.print("Enter the minimum value of price you want to search = $");
        int minPrice = scanner.nextInt();
        System.out.print("Enter the maximum value of price you want to search = $");
        int maxPrice = scanner.nextInt();
        actions.dragAndDropBy(leftSlider, unitLength * minPrice, 0).build().perform();
        actions.dragAndDropBy(rightSlider, unitLength * (-(500 - maxPrice - 1)), 0).build().perform();

        MyFunc.Wait(5);
        driverStop();
    }
}
