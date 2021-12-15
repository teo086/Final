package com.globant.test;

import com.globant.pom.pagesoprs.StaysPagesOprs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingTest {
    private WebDriver driver;
    StaysPagesOprs staysPagesOprs;

    @BeforeTest
    /**
     * method to configure the driver
     */
    public  void  setUp () {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/index.es.html");
        staysPagesOprs = new StaysPagesOprs(driver);
    }

    @Test
    public void staysPage(){
        staysPagesOprs.offerSearch();
    }



    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
