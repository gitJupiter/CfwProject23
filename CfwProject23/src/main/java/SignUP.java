import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SignUP {
    public static WebDriver driver;

    public static void main(String[] args)  {

        driver = new ChromeDriver();
        driver.get("https://www.disney.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
}
}
