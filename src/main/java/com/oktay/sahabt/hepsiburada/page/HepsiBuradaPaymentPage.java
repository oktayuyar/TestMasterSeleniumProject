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

        if(driver.getPageSource().contains("selectbox-choice")){

            sleep(2);
            clickElement(CONTINUE_PAYMENT_XPATH);
        }
        else {
            sleep(3);
            setText(NAME_TEXTBOX,NAME);
            setText(SURNAME_TEXTBOX,SURNAME);
            sleep(2);
            setText(ADDRESS_TEXTBOX,ADDRESS_VALUE);
            setText(ADDRESS_NAME_TEXTBOX,ADDRESS_NAME_VALUE);
            setText(PHONE_TEXTBOX,PHONE_VALUE);

            sleep(2);
            clickElement(CONTINUE_PAYMENT_XPATH);
        }

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
