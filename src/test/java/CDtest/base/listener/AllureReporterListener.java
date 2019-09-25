package CDtest.base.listener;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;


import java.io.IOException;

public class AllureReporterListener implements IHookable {

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {

        callBack.runTestMethod(testResult);
        if (testResult.getThrowable() != null) {
            try {
                takeScreenShot(testResult.getMethod().getMethodName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Attachment(value = "Failure in method {0}", type = "image/png")
    private byte[] takeScreenShot(String methodName) throws IOException {
        System.setProperty("webdriver.gecko.driver", "/Users/apple/Documents/atong/geckodriver");

        WebDriver webDriver = new FirefoxDriver();
        WebDriverRunner.setWebDriver(webDriver);

        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
