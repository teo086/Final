package com.globant.pom.pagesoprs;

import com.globant.pom.pagesobj.StaysPageObj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaysPagesOprs extends StaysPageObj {
    WebDriver driver;
    WebDriverWait wait;
    /**
     * constructor
     */
    public StaysPagesOprs(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }
    public void offerSearch(){
        /**
         *  select the box where you'll put the destination
         */
        driver.findElement(inputDestination).click();
        /**
         * clean the searchbox
         */
        driver.findElement(inputDestination).clear();
        /**
         * input the destination
         */
        driver.findElement(inputDestination).sendKeys("bogota");
        /**
         * input the checkin and checkout dates
         */
        driver.findElement(dateField).click();
        selectDates("2022-01-10");
        selectDates("2022-01-25");
        /**
         * select the box where you will put how many guest do you want to include
         */
        driver.findElement(guestSelect).click();
        /**
         * click plus one adult for a total of three adults
         */
        wait.until(ExpectedConditions.elementToBeClickable(adultsSelect));

        driver.findElement(adultsSelect).click();

        /**
         * clean the box
         */
        driver.findElement(childrenSelect).click();
        /**
         * select the box where you will put the age of a kid
         */
        driver.findElement(ageKid).click();
        /**
         * choose the age of the kid(s)
         */
        new Select(driver.findElement(ageKid)).selectByVisibleText("9 años");
        /**
         * click on the search button
         */
        driver.findElement(searchBtn).click();
        /**
         * click on the 'five stars' filter
         */
        driver.findElement(fiveStarsFilter).click();
        //1ras verificaciones -> titulo, score y precio (3 localizadores)

        /**
         * click on the second hotel
         */
        driver.findElement(secondHotel).click();
        /**
         * ??verify parameters of booking
         */
        //2das verificaciones -> number of adults and childs are the same as the previous page ALSO PRICE.
        /**
         * start the reserve process
         */
        driver.findElement(startReservationBtn).click();
        /**
         * finalize the reserve process
         */
        driver.findElement(finalReservationBtn).click();
        /**
         * set the purpose the trip
         */
        driver.findElement(travelPurpose).click();
        /**
         * click on the first name box
         */
        driver.findElement(firstNameInput).click();
        /**
         * clean the box
         */
        driver.findElement(firstNameInput).clear();
        /**
         * write your firstname
         */
        driver.findElement(firstNameInput).sendKeys("G");
        /**
         * click on the last name box
         */
        driver.findElement(lastNameInput).click();
        /**
         * clean the box
         */
        driver.findElement(lastNameInput).clear();
        /**
         * write your lastname
         */
        driver.findElement(lastNameInput).sendKeys("CB");
        /**
         * click on the email box
         */
        driver.findElement(emailInput).click();
        /**
         * clean the box
         */
        driver.findElement(emailInput).clear();
        /**
         * put your email address
         */
        driver.findElement(emailInput).sendKeys("gcb@gmail.com");
        /**
         * click on the confirmation email box
         */
        driver.findElement(emailConfirmationInput).click();
        /**
         * clean the box
         */
        driver.findElement(emailConfirmationInput).clear();
        /**
         * confirm (rewrite) your email address
         */
        driver.findElement(emailConfirmationInput).sendKeys("gcb@gmail.com");
        /**
         * select if you are the user of the reserve
         */
        driver.findElement(reservationUser).click();
        /**
         * go to the last data information form (star the reservation process)
         */
        driver.findElement(bookForm).click();
        /**
         * click on country selection box
         */
        driver.findElement(countrySelection).click();
        // aki en el fljo yo no hice nada xq ya estaba 'colombia' la  alt seria add:
        //new Select(driver.findElement(countrySelection)).selectByVisibleText("colombia");

        /**
         * click on phone selection box
         */
        driver.findElement(phoneSelection).click();
        /**
         * clean the box
         */
        driver.findElement(phoneSelection).clear();
        /**
         * put the phone number
         */
        driver.findElement(phoneSelection).sendKeys("+573121234567");

        /**
         * click on type of credit card box
         */
        driver.findElement(chooseCreditCardBox).click();
        //? si kito new, sale 'method call expected
        new Select(driver.findElement(chooseCreditCardBox)).selectByVisibleText("MasterCard");
        /**
         * click on credit card number box
         */
        driver.findElement(creditCardNumber).click();
        /**
         * clean the box
         */
        driver.findElement(creditCardNumber).clear();
        /**
         * \\ put the credit card number
         */
        driver.findElement(creditCardNumber).sendKeys("5100 8544 8000 3399");
        /**
         * click month of your caducity date of credit card
         */
        driver.findElement(chooseMonthForCaducityDateCc).click();
        //? si kito new, sale 'method call expected
        new Select(driver.findElement(chooseMonthForCaducityDateCc)).selectByVisibleText("11 - nov");
        /**
         * click year of your caducity date of credit card
         */
        driver.findElement(chooseYearForCaducityDateCc).click();
        //? si kito new, sale 'method call expected
        new Select(driver.findElement(chooseYearForCaducityDateCc)).selectByVisibleText("2038");
        /**
         * click on the CVC (Card Verification Code) box
         */
        driver.findElement(chooseCvcForCaducityDataCC).click();
        /**
         * clear the box
         */
        driver.findElement(chooseCvcForCaducityDataCC).clear();
        /**
         * put CVC (Card Verification Code) of your
         */
        driver.findElement(chooseCvcForCaducityDataCC).sendKeys("121");

        /**
         * finish the reservation process
         */
        driver.findElement(completeReserveForm).click();


    }
    public void selectDates (String posteriorDays)
    {
        boolean isStillRunnin=true;
        while (isStillRunnin)
        {
            try {
                this.driver.findElement(datePickerTds(posteriorDays)).click();
                isStillRunnin=false;
            }catch (Exception error)
            {
                driver.findElement(dateField).click();
            }
        }
    }

}
