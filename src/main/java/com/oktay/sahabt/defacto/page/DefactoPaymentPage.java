package com.oktay.sahabt.defacto.page;

import com.oktay.sahabt.defacto.constants.General_Constants;
import com.oktay.sahabt.defacto.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefactoPaymentPage extends BasePageUtil implements General_Constants {

    public DefactoPaymentPage(WebDriver driver) {
        super(driver);
    }

    public void complatePayment(){
        setAddressInformation();
        setCardInformation();
    }

    public void setAddressInformation(){

        if(getTitle().contains("Address_AddressTypeId")){
            sleep(3);
            setText(ADDRESS_TYPE_ID,"Ev");
            sleep(2);
            setText(ADDRESS_CITY_ID,"Hatay");
            sleep(2);
            setText(ADDRESS_COUNTY_ID,"Antakya");
            sleep(2);
            setText(ADDRESS_POSTAL_CODE_ID,"31200");
            sleep(2);
            setText(ADDRESS_TEXT_ID,"Eski Antakya");
            sleep(2);
            setText(ADDRESS_FIRST_NAME_ID,"Oktay");
            sleep(2);
            setText(ADDRESS_LAST_NAME_ID,"Uyar");
            sleep(2);
            setText(ADDRESS_MOBILE_PHONE_ID,"5382997022");
            sleep(2);
            setText(ADDRESS_IDENTITY_NUMBER_ID,"43882239212");
            sleep(2);
            click(SAVE_ADDRESS_INFORMATION_XPATH);
            sleep(2);
        }
        else{
            log.info(ADDRESS_LOG_INFO);
        }
        sleep(2);
        click(SELECT_TYPE_OF_DELIVERY_XPATH);
        sleep(2);

        if(getTitle().contains("Shopping/Address"))
            log.info(DELIVERY_ADDRESS_LOG_INFO);
        click(CLICK_GO_TO_PAY_XPATH);
        sleep(2);
    }

    private void setCardInformation() {
        sleep(2);
        if(getTitle().contains("Shopping/Payment"))
            log.info(PAYMENT_LOG_INFO);
        setText(PAYMENT_CARD_NUMBER_ID,"4506344220167040");
        sleep(2);
        setText(PAYMENT_EXPIRE_MONTH_ID,"10");
        sleep(2);
        setText(PAYMENT_EXPIRE_YEAR_ID,"2020");
        sleep(2);
        setText(PAYMENT_SECURITY_CODE_ID,"173");
        sleep(2);
        click(CREDIT_CARD_CONTRACT_ENABLE_ID);
        sleep(2);
        click(MASTER_PASS_ENABLE_ID);
        sleep(2);
        setText(ACCOUNT_ALIAS_NAME_XPATH,"Oktay Uyar");
        sleep(2);
        click(CREDIT_CARD_BUTTON);
        log.info(SUCCESS_LOG_INFO);
    }
}
