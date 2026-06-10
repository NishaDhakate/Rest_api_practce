package API_demo_day1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;

public class Day_02 {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //To take screenshot
      /*  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("D:\\TestData\\Screensot\\example.png");
        FileUtils.copyFile(screenshot, destination);*/

        //To object of screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("D:\\TestData\\Screensot\\Nisha.png");
        FileUtils.copyFile(sourcefile, destination); // ✅ Copy step added
    }
}
