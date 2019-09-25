package CDtest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/apple/Documents/atong/geckodriver");
      //  System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/firefox");
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.baidu.com/");

    }
}
