package com.globant.pom.pagesoprs;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Katalon {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
        private JavascriptExecutor js;

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            baseUrl = "https://www.google.com/";
            //cambio a explicit wait
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            js = (JavascriptExecutor) driver;
        }

        @Test
        public void testUntitledTestCase() throws Exception {
//?
            driver.get("https://www.booking.com/index.es.html");

            driver.findElement(By.id("ss")).click();
            driver.findElement(By.id("ss")).clear();
            driver.findElement(By.id("ss")).sendKeys("bogota");
            driver.findElement(By.xpath("//form[@id='frm']/div/div/div/div/ul/li")).click();
//fechas
            driver.findElement(By.xpath("//form[@id='frm']/div/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[3]/td[2]/span/span")).click();
            driver.findElement(By.xpath("//form[@id='frm']/div/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[3]/span/span")).click();

            //span[@class='xp__guests__count']

            driver.findElement(By.xpath("//label[@id='xp__guests__toggle']/span[2]/span")).click();
//?
            driver.findElement(By.xpath("//div[@id='xp__guests__inputs-container']/div/div/div/div/div[2]/button[2]")).click();
            driver.findElement(By.id("group_adults")).clear();
            driver.findElement(By.id("group_adults")).sendKeys("3");
            driver.findElement(By.xpath("//div[@id='xp__guests__inputs-container']/div/div/div[2]/div/div[2]/button[2]/span")).click();
            driver.findElement(By.id("group_children")).clear();
            driver.findElement(By.id("group_children")).sendKeys("1");
            driver.findElement(By.name("age")).click();
            new Select(driver.findElement(By.name("age"))).selectByVisibleText("9 años");
//*[@id="search_results_table"]/div[1]/div/div/div/div[7]/div[8]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/h3/a/div[1]
            driver.findElement(By.xpath("//form[@id='frm']/div/div[4]/div[2]/button/span")).click();
            driver.findElement(By.xpath("//div[@id='searchboxInc']/div/div/div/div/div[6]/div[5]/label/div")).click();
            driver.findElement(By.xpath("//div[@id='search_results_table']/div/div/div/div/div[7]/div[5]/div/div[2]/div/div/div/div/div/div/div/h3/a/div")).click();
            //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
//new tab
            //verificaciones -> 1er result page
            //*[@id="search_results_table"]/div[1]/div/div/div/div[7]/div[5]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/h3/a/div[1]
            //*[@id="search_results_table"]/div[1]/div/div/div/div[7]/div[5]/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div/div[1]/a/span/div/div[1]
            //*[@id="search_results_table"]/div[1]/div/div/div/div[7]/div[5]/div[1]/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div/div/div/div[2]/span[2]
            driver.findElement(By.id("hp_hotel_name")).click();
            driver.findElement(By.xpath("//div[@id='js--hp-gallery-scorecard']/a/div/div/div/div/div")).click();
            driver.findElement(By.xpath("//div[@id='hp-reviews-sliding']/div/div/i")).click();
            //verificaciones 2do page
            //*[@id="group_recommendation"]/table/tbody/tr/td[3]/table/tbody/tr[1]/td/div/div[1]
            //*[@id="group_recommendation"]/table/tbody/tr/td[3]/table/tbody/tr[1]/td/div/div[2]
            driver.findElement(By.xpath("//div[@id='group_recommendation']/table/tbody/tr/td[3]/table/tbody/tr/td/div/div[2]/div/span")).click();
            driver.findElement(By.xpath("//div[@id='group_recommendation']/table/tbody/tr/td[3]/table/tbody/tr[2]/td/a/span")).click();

            driver.findElement(By.id("b_tt_holder_4")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crea tu cuenta'])[1]/following::*[name()='svg'][8]")).click();
            driver.findElement(By.xpath("//fieldset[@id='bp-control-group--travel_purpose']/div/div/div/label/span")).click();
            driver.findElement(By.xpath("//fieldset[@id='bp-control-group--travel_purpose']/div/div[2]/div/label/span")).click();
            driver.findElement(By.id("firstname")).click();
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys("G");
            driver.findElement(By.id("lastname")).click();
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("CB");
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("gcb@gmail.com");
            driver.findElement(By.id("email_confirm")).click();
            driver.findElement(By.id("email_confirm")).clear();
            driver.findElement(By.id("email_confirm")).sendKeys("gcb@gmail.com");
            driver.findElement(By.xpath("//fieldset[@id='bp-control-group--notstayer']/div/div/div/label/span")).click();
            driver.findElement(By.xpath("//fieldset[@id='bp-control-group--notstayer']/div/div[2]/div/label/span")).click();
            driver.findElement(By.xpath("//form[@id='bookForm']/div[5]/div/div[2]/button/span")).click();
            driver.findElement(By.id("cc1")).click();
            driver.findElement(By.id("phone")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crea tu cuenta'])[1]/following::*[name()='svg'][6]")).click();
            driver.findElement(By.id("phone")).click();
            driver.findElement(By.id("phone")).clear();
            driver.findElement(By.id("phone")).sendKeys("+573121234567");
            driver.findElement(By.xpath("//div[@id='bookStage3Inc']/div/div[2]/div/div[2]/div/fieldset/div/div/div/label/span")).click();
            driver.findElement(By.id("cc_type")).click();
            new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("MasterCard");
            driver.findElement(By.id("cc_number")).click();
            driver.findElement(By.id("cc_number")).clear();
            driver.findElement(By.id("cc_number")).sendKeys("123456789123");
            driver.findElement(By.id("cc_month")).click();
            new Select(driver.findElement(By.id("cc_month"))).selectByVisibleText("11 - nov");
            driver.findElement(By.id("ccYear")).click();
            new Select(driver.findElement(By.id("ccYear"))).selectByVisibleText("2038");
            driver.findElement(By.id("cc_number")).click();
            driver.findElement(By.id("cc_number")).clear();
            driver.findElement(By.id("cc_number")).sendKeys("1234567891232468");
            driver.findElement(By.id("cc_cvc")).click();
            driver.findElement(By.id("cc_cvc")).clear();
            driver.findElement(By.id("cc_cvc")).sendKeys("121");
            driver.findElement(By.id("cc_number")).click();
            driver.findElement(By.xpath("//form[@id='bookForm']/div")).click();
            driver.findElement(By.id("cc_number")).clear();
            driver.findElement(By.id("cc_number")).sendKeys("5100 8544 8000 3399");
            driver.findElement(By.id("cc_type")).click();
            driver.findElement(By.xpath("//div[@id='bookwrapper_cell']/div[4]/div/div[2]/button/span[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Crea tu cuenta'])[1]/following::*[name()='svg'][6]")).click();
        }

        @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }
