package com.oktay.sahabt.hepsiburada.page;

import com.oktay.sahabt.hepsiburada.constants.General_Constants;
import com.oktay.sahabt.hepsiburada.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HepsiBuradaPaymentPage extends BasePageUtil implements General_Constants {

    public HepsiBuradaPaymentPage(WebDriver driver) {
        super(driver);
    }

    public void complatePayment(){
        setPersonalInformation();
        setCardInformation();
    }

    public void setPersonalInformation(){

//        setText(NAME_TEXTBOX,NAME);
//        setText(SURNAME_TEXTBOX,SURNAME);
//        select(TOWN_DROPDOWN_MENU_XPATH);
//        sleep(2);
//        setText(ADDRESS_TEXTBOX,"Adalar");
//        setText(ADDRESS_NAME_TEXTBOX,"İstanbul");
//        setText(PHONE_TEXTBOX,"05382997000");

        clickElement(CONTINUE_PAYMENT_XPATH);

        Assert.assertTrue(PAYMENT_PAGE_ERROR_MESSAGE, getTitle().contains(DELIVERY_PAGE_TITLE));
        log.info(PAYMENT_PAGE_SUCCESS_MESSAGE);

    }

    public void setCardInformation() {
        sleep(3);
        setText(CARD_NUMBER_ID,CARD_NUMBER);
        sleep(2);
        setText(CARD_NAME_XPATH,CARD_NAME);
        clickElement(MOUNTH_XPATH);
        clickElement(SELECTED_MOUNTH_XPATH);
        sleep(2);
        clickElement(YEAR_XPATH);
        clickElement(SELECTED_YEAR_XPATH);
        sleep(2);
        setText(CCV_ID,CCV);
        sleep(2);
        clickElement(CONTINUE_XPATH);

        Assert.assertTrue(PAYMENT_INFORMATION_PAGE_ERROR_MESSAGE, getTitle().contains(PAYMENT_INFORMATION_TITLE));
        log.info(PAYMENT_INFORMATION_PAGE_MESSAGE);
    }
}
