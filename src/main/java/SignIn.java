import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;


public class SignIn extends SignUP {

    public static void main(String[] args)  {

        driver = new ChromeDriver();
        driver.get("https://www.raymourflanigan.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.findElement(By.xpath("//*[@id=\"bx-element-2378700-bwpjVdL\"]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/nav/div/div[2]/div/div[4]/span/div")).click();
        driver.findElement(By.xpath("/html/body/div[41]/div/div[2]/div/div[1]/ul/li[1]/a/span")).click();

        driver.findElement(By.id("email-address")).sendKeys("motoorbyk@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("Abcabc0909!");
        driver.findElement(By.xpath("//button[@id='accountsignin']/span/span")).click();


        // Assert
        // String act = driver.findElement(By.xpath(" ")).getText(); // From Coding
        //String exp = " "; // BA/Requirements/Mock up
        //Assert.assertEquals(act, exp);



        //mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags=@smoke









}}
