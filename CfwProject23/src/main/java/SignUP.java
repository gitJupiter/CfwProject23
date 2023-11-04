import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SignUP {
    public static WebDriver driver;

    public static void main(String[] args)  {

        driver = new ChromeDriver();

        driver.get("https://www.raymourflanigan.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

        driver.findElement(By.xpath("//*[@id=\"bx-element-2378700-bwpjVdL\"]/button")).click();//dismiss
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/nav/div/div[2]/div/div[4]/span/div")).click(); //dropdown
        driver.findElement(By.xpath("/html/body/div[42]/div/div[2]/div/div[1]/ul/li[2]/a/span")).click(); //create account
        driver.findElement(By.id("first-name")).sendKeys("mohammed");
        driver.findElement(By.id("last-name")).sendKeys("milon");
        driver.findElement(By.id("email-address")).sendKeys("motoorbyk@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("Abcabc0909!");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div/div[2]/div/div/div/form/div/div[7]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();//cookies

    }

}
