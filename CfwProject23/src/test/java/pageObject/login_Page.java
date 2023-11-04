package pageObject;

import base.config;
import org.openqa.selenium.By;
import org.testng.Assert;

public class login_Page extends config {

    public void enterEmail(String emailAddress) {
        driver.findElement(By.id("email-address")).sendKeys(emailAddress);
    }

    public void enterPassword(String enterPassword){

        driver.findElement(By.id("password")).sendKeys(enterPassword);
    }

    public void clickLoginButton(){


        driver.findElement(By.xpath("//button[@id='accountsignin']/span/span")).click();
    }

    public void invalidEmailOrPasswordMsg(){
        String act = driver.findElement(By.xpath("//*[@id=\"signinform\"]/div/div[2]/div/div/p")).getText();
        String exp = "Invalid Username or password";
        Assert.assertEquals(act, exp);
    }



}






