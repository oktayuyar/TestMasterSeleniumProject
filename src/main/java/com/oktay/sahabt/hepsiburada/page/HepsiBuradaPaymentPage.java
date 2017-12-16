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

    }

    public void setCardInformation() {
        sleep(3);
        setText(CARD_NUMBER_ID,"4506344220167848");
        sleep(2);
        setText(CARD_NAME_XPATH,"Oktay Uyar");
        clickElement(MOUNTH_XPATH);
        clickElement(By.xpath("/html//form[@id='form-credit-card']//div[@class='date-col group']/div[1]/div/div/ul[@role='menu']/li[@rel='10']/a[@class='']"));
        sleep(2);
        clickElement(YEAR_XPATH);
        clickElement(By.xpath("/html//form[@id='form-credit-card']//div[@class='date-col group']/div[2]/div/div/ul[@role='menu']/li[@rel='6']/a[@class='']"));
        sleep(2);
        setText(CCV_ID,"290");
        sleep(2);
        clickElement(By.xpath("/html//div[@id='short-summary']//button[@class='btn btn-primary full']"));
    }
}
