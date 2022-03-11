package chromeLog;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/chromeLog/chromedriver.exe");
        System.setProperty("webdriver.chrome.logfile", "chromeLogsAfterSearch.txt");

        WebDriver driver = new ChromeDriver();


        Path sampleFile = Paths.get("src/test/java/client/index.html");
    //    driver.get(sampleFile.toUri().toString());



        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("hello world"+ Keys.ENTER);

        //driver.get("https://google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        Thread.sleep(2000);
        driver.quit();
    }
}
