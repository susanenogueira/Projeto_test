package core;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static core.Propriedades.*;


public class DriverFactory {


    private static WebDriver driver;


    private DriverFactory() { }

    public static WebDriver getDriver() {
      //  System.setProperty("webdriver.chrome.driver", "C:/drivers_automacao/chromedriver.exe");
        if (driver == null) {
            switch (browser){

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



