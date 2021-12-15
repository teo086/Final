package com.globant.pom.pagesobj;

import org.openqa.selenium.By;

public class StaysPageObj {
    public By inputDestination = By.id("ss");
    public By dateField = By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span");
    public By guestSelect = By.xpath("//label[@id='xp__guests__toggle']/span[2]");
    public By adultsSelect = By.id("group_adults");
    public By childrenSelect = By.id("group_children");
    public By ageKid = By.name("age");
    public By searchBtn = By.xpath("//form[@id='frm']/div/div[4]/div[2]/button/span");
    public By fiveStarsFilter = By.xpath("//div[@id='searchboxInc']/div/div/div/div/div[6]/div[5]/label/div");
    public By secondHotel = By.xpath("//div[@id='search_results_table']/div/div/div/div/div[7]/div[5]/div/div[2]/div/div/div/div/div/div/div/h3/a/div");
    public By startReservationBtn = By.xpath("//div[@id='group_recommendation']/table/tbody/tr/td[3]/table/tbody/tr[2]/td/a/span");
    public By finalReservationBtn = By.id("b_tt_holder_4");
    public By travelPurpose = By.xpath("//fieldset[@id='bp-control-group--travel_purpose']/div/div[2]/div/label/span");
    public By firstNameInput = By.id("firstname");
    public By lastNameInput = By.id("lastname");
    public By emailInput = By.id("email");
    public By emailConfirmationInput = By.id("email");
    public By reservationUser = By.xpath("//fieldset[@id='bp-control-group--notstayer']/div/div/div/label/span");
    public By bookForm = By.xpath("//form[@id='bookForm']/div[5]/div/div[2]/button/span");
    public By countrySelection = By.id("cc1");
    public By phoneSelection = By.id("phone");
    public By chooseCreditCardBox = By.id("cc_type");
    public By creditCardNumber = By.id("cc_number");
    public By chooseMonthForCaducityDateCc =  By.id("cc_month");
    public By chooseYearForCaducityDateCc = By.id("ccYear");
    public By chooseCvcForCaducityDataCC = By.id("cc_cvc");
    public By completeReserveForm = By.xpath("//div[@id='bookwrapper_cell']/div[4]/div/div[2]/button/span[2]");

    public By datePickerTds(String daysAfterCurrentDay){
        return By.xpath("//td[@data-date='"+ daysAfterCurrentDay + "']");
    }


}
