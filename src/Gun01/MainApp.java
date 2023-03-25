package Gun01;

import Utility.BaseDriverFirefox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class MainApp extends BaseDriverFirefox {
    public static void main(String[] args) {
        driver.get("https://www.google.com/");
        driverStop();

    }
}
