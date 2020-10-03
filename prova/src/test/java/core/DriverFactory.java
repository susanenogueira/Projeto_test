package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static core.Propriedades.*;


public class DriverFactory {


    private static WebDriver driver;


    private DriverFactory() { }

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (Propriedades.browser){

                case  CHROME:  driver = new ChromeDriver();

                    break;
                case  FIREFOX:  driver = new FirefoxDriver();
                    break;
               }

           driver.manage().window().maximize();
        }
        return driver;



    }


    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }


    }
}



