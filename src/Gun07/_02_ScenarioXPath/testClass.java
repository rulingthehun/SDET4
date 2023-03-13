package Gun07._02_ScenarioXPath;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class testClass extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.saucedemo.com/");

        //    ABSOLUTE XPATH
        //WebElement element = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[1]/input"));

        //    RELATIVE XPATH
        //WebElement element = driver.findElement(By.xpath("//input[@id='user-name']"));

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();

        MyFunc.Bekle(1);
        WebElement backpack = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        //Text ile bulma
        // "//div[text()='Sauce Labs Backpack']"
        backpack.click();

        MyFunc.Bekle(1);
        WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart.click();

        MyFunc.Bekle(1);
        WebElement backToProducts = driver.findElement(By.xpath("//button[text()='Back to products']"));
        backToProducts.click();

        MyFunc.Bekle(1);
        WebElement sauceLabsBolTShirt = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        sauceLabsBolTShirt.click();

        MyFunc.Bekle(1);
        WebElement addToCartTShirt = driver.findElement(By.xpath("//*[text()='Add to cart']"));
        addToCartTShirt.click();

        MyFunc.Bekle(1);
        WebElement shoppingCartContainer = driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
        shoppingCartContainer.click();

        MyFunc.Bekle(1);
        WebElement checkout = driver.findElement(By.xpath("//*[text()='Checkout']"));
        checkout.click();

        MyFunc.Bekle(1);
        WebElement firstName = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstName.sendKeys("Burak");

        MyFunc.Bekle(1);
        WebElement lastName = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastName.sendKeys("Gaznepoğlu");

        MyFunc.Bekle(1);
        WebElement postalCode = driver.findElement(By.xpath("//*[@id='postal-code']"));
        postalCode.sendKeys("26090");

        MyFunc.Bekle(1);
        WebElement continueButton = driver.findElement(By.xpath("//*[@id='continue']"));
        continueButton.click();

        List<WebElement> prices = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double total = 0;

        for (WebElement e : prices) {
            total += Double.parseDouble(e.getText().substring(1));
        }

        WebElement priceTotal = driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        double totalPrice = Double.parseDouble(priceTotal.getText().substring(13));
        System.out.println("totalPrice = " + totalPrice);

        Assert.assertTrue("Hatalı sepet", total == totalPrice);

        // 2. YOL:
        //WebElement item1Price = driver.findElement(By.xpath("(//*[@class='inventory_item_price'])[1]"));
        //System.out.println(item1Price.getText());
        //double price1 = Double.parseDouble(item1Price.getText().substring(1));
        //System.out.println("price1 = " + price1);

        //WebElement item2Price = driver.findElement(By.xpath("(//*[@class='inventory_item_price'])[2]"));
        //double price2 = Double.parseDouble(item2Price.getText().substring(1));
        //System.out.println("price2 = " + price2);

        //WebElement priceTotal = driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        //double totalPrice = Double.parseDouble(priceTotal.getText().substring(13));
        //System.out.println("total price = " + totalPrice);

        //Assert.assertTrue("Hatalı sepet", price1 + price2 == totalPrice);

        System.out.println("Sepet doğru");

        driverStop();

    }
}
