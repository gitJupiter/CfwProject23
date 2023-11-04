package stepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends config {

    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    public static String baseURL;

    @Before
    public void startTest(){
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                baseURL = "https://www.raymourflanigan.com/";
                GLOBAL_EMAIL = "motoorbyk@yahoo.com";
                GLOBAL_PASSWORD= "Abcabc0909!";
                break;
            case "stage":
                baseURL = "https://www.stage.raymourflanigan.com/";
                GLOBAL_EMAIL = "motorbyk@yahoo.com";
                GLOBAL_PASSWORD = "abcabc000";
                break;
            case "prod":
                baseURL = "https://prod.taltektc.com";
                break;
        }
        driver.get(baseURL);
    }

    @After
    public void testComplete(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        driver.close();
        driver.quit();
    }

}








